package views;

import model.ESex;
import model.Student;
import model.StudentComparator;
import service.StudentService;
import utils.FileUtils;

import java.util.List;
import java.util.Scanner;

public class StudentManageView {
    public static Scanner scanner = new Scanner(System.in);
    private static String studentsFilePath = "./Data/students.csv";
    private static List<Student> studentList = FileUtils.readDataFromFile(studentsFilePath);
    private static StudentService studentService;

    public String getStudentsFilePath() {
        return studentsFilePath;
    }
    public List<Student> getStudentList(){
        return studentList;
    }

    public StudentManageView() {
    }

    public void launcher() {
        boolean checkContinue;
        int menuAction;

        do {
            checkContinue = true;
            do {
                System.out.println("CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN");
                System.out.println("Chọn chức năng theo số (để tiếp tục)");
                System.out.println("1. Xem danh sách sinh viên");
                System.out.println("2. Thêm mới");
                System.out.println("3. Cập nhật");
                System.out.println("4. Xóa");
                System.out.println("5. Sắp xếp");
                System.out.println("6. Đọc từ file");
                System.out.println("7. Ghi vào file");
                System.out.println("8. Thoát");
                System.out.println("Chọn chức năng: ");

                menuAction = Integer.parseInt(scanner.nextLine());
            } while (menuAction < 1 || menuAction > 8);

            studentService = new StudentService();

            switch (menuAction) {
                case 1:
                    studentService.showStudentsInPages(studentList);
                    break;
                case 2:
                    addStudentView();
                    break;
                case 3:
                    updateStudentView();
                    break;
                case 4:
                    removeStudentView();
                    break;
                case 5:
                    sortStudentView();
                    break;
                case 6:
                    readDatasFromFileView();
                    break;
                case 7:
                    writeDatasToFileView();
                    break;
                case 8:
                    checkContinue = false;
                    break;
            }
        } while (checkContinue);
    }

    private void writeDatasToFileView() {
        boolean confirm = getConfirm("ghi data vào file");

        if (confirm){
            System.out.println("Ghi vào file ...");
            FileUtils.writeDataToFile(studentList,studentsFilePath);
        }
    }

    private void readDatasFromFileView() {
        boolean confirm = getConfirm("cập nhật bộ nhớ");

        if (confirm){
            System.out.println("Đọc từ file ....");
            studentList = FileUtils.readDataFromFile(studentsFilePath);
        }
    }

    private void sortStudentView() {
        int sortAction;
        boolean isContinue;

        do {
            System.out.println("Sắp xếp sinh viên theo điểm trung bình");
            System.out.println("Chọn chức năng theo số (để tiếp tục)");
            System.out.println("1. Sắp xếp điểm trung bình tăng dần");
            System.out.println("2. Sắp xếp điểm trung bình giảm dần");
            System.out.println("3. Thoát");

            sortAction = Integer.parseInt(scanner.nextLine());
        }while (sortAction < 1 || sortAction > 3);

        switch (sortAction) {
            case 1 -> {
                StudentComparator studentComparatorAscending = new StudentComparator(true);
                studentList.sort(studentComparatorAscending);
                studentService.showStudentList(studentList);
            }
            case 2 -> {
                StudentComparator studentComparatorDescending = new StudentComparator(false);
                studentList.sort(studentComparatorDescending);
                studentService.showStudentList(studentList);
            }
        }
    }

    private void removeStudentView() {
        Student student = studentService.getStudentByInputId();
        int index = studentService.getIndexOfStudentbyId(student.getId());
        int confirm = -1;
        boolean isInvalid;

        do {
            try {
                isInvalid = false;
                System.out.println("Bạn có chắc muốn xóa sinh viên (Y/N)");
                System.out.println("1. Y");
                System.out.println("2. N");
                confirm = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException numberFormatException){
                System.out.println("Nhập vào không hợp lệ. Xin nhập lại");
                isInvalid = true;
                continue;
            }
            if (confirm != 1 && confirm != 2){
                System.out.println("Nhập vào không hợp lệ. Xin nhập lại");
                isInvalid = true;
            }
        }while (isInvalid);

        switch (confirm){
            case 1:
                studentList.remove(index);
                break;
            case 2:
                break;
        }
    }

    private void updateStudentView() {
        Student student = studentService.getStudentByInputId();
        int index = studentService.getIndexOfStudentbyId(student.getId());

        boolean checkContinue;
        int menuAction;

        do {
            checkContinue = true;
            do {
                System.out.println("Chọn thông tin muốn sửa");
                System.out.println("1. Mã sinh viên");
                System.out.println("2. Họ tên");
                System.out.println("3. Tuổi");
                System.out.println("4. Giới tiính");
                System.out.println("5. Địa chỉ");
                System.out.println("6. Điểm trung bình");
                System.out.println("7. Thoát");

                menuAction = Integer.parseInt(scanner.nextLine());
            } while (menuAction < 1 || menuAction > 7);

            switch (menuAction) {
                case 1 -> {
                    int id = studentService.getInputId();
                    student.setId(id);
                }
                case 2 -> {
                    System.out.println("Nhập tên cho sinh viên: ");
                    String name = scanner.nextLine();
                    student.setName(name);
                }
                case 3 -> {
                    int age = studentService.getInputAge();
                    student.setAge(age);
                }
                case 4 -> {
                    ESex eSex = studentService.getInputESex();
                    student.seteSex(eSex);
                }
                case 5 -> {
                    System.out.println("Nhập địa chỉ cho sinh viên");
                    String address = scanner.nextLine();
                    student.setAddress(address);
                }
                case 6 -> {
                    double averageScore = studentService.getInputScore();
                    student.setAverageScore(averageScore);
                }
                case 7 -> checkContinue = false;
            }
        }while (checkContinue);

        studentList.set(index,student);
    }

    private void addStudentView() {
        Student student = studentService.createStudent();
        studentService.addStudent(student);
        System.out.println(student);
    }
    private boolean getConfirm(String actionName){
        int confirm = -1;
        boolean isInvalid;

        do {
            try {
                isInvalid = false;
                System.out.println("Bạn có chắc muốn "+actionName+" (Y/N)");
                System.out.println("1. Y");
                System.out.println("2. N");
                confirm = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException numberFormatException){
                System.out.println("Nhập vào không hợp lệ. Xin nhập lại");
                isInvalid = true;
                continue;
            }
            if (confirm != 1 && confirm != 2){
                System.out.println("Nhập vào không hợp lệ. Xin nhập lại");
                isInvalid = true;
            }
        }while (isInvalid);

        return switch (confirm) {
            case 1 -> true;
            case 2 -> false;
            default -> false;
        };
    }
}
