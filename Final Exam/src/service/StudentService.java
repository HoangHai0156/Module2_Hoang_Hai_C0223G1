package service;

import model.ESex;
import model.Student;
import utils.FileUtils;
import views.StudentManageView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {
    private static List<Student> studentList;
    private static StudentManageView manageView;
    private final int ITEMS_PER_PAGE = 5;
    private static Scanner scanner = new Scanner(System.in);

    public StudentService() {
        manageView = new StudentManageView();
        studentList = manageView.getStudentList();
    }

    public void showStudentList(List<Student> studentList) {
//        int id, String name, int age, ESex eSex, String address, double averageScore
        System.out.printf("%-15s %-20s %-15s %-15s %-30s %-15s\n", "Student Id", "Name", "Age", "Sex", "Address", "Average Score");
        for (Student student : studentList) {
            System.out.printf("%-15s %-20s %-15s %-15s %-30s %-15s\n",
                    student.getId(), student.getName(), student.getAge(),
                    student.geteSex().getName(), student.getAddress(), student.getAverageScore());
        }
    }
    public void addStudent(Student student){
        studentList.add(student);
        FileUtils.writeDataToFile(studentList, manageView.getStudentsFilePath());
    }
    public void showStudentsInPages(List<Student> students) {
        List<Student> subList;
        int fullPageNum = students.size() / ITEMS_PER_PAGE;
        int restPageNum = students.size() % ITEMS_PER_PAGE;
        int pageNum;
        boolean checkInvalidPageNum = false;

        do {
            do {
                System.out.println("Chọn trang muốn xem(lớn hơn 0 | Nhập 0 để thoát xem): ");
                pageNum = Integer.parseInt(scanner.nextLine());
            }while (pageNum < 0);

            int startIndex = (pageNum-1)*ITEMS_PER_PAGE;
            int endIndex = startIndex + ITEMS_PER_PAGE;

            if (pageNum == (fullPageNum + 1)){
                if (restPageNum == 0){
                    System.out.println("Số trang không hợp lệ! Nhập lại");
                    checkInvalidPageNum = true;
                    continue;
                }else {
                    endIndex = startIndex + restPageNum;
                    subList = students.subList(startIndex, endIndex);
                }
            }else if (pageNum > (fullPageNum + 1)){
                System.out.println("Số trang không hợp lệ! Nhập lại");
                checkInvalidPageNum = true;
                continue;
            }else if (pageNum == 0){
                checkInvalidPageNum = false;
                continue;
            }
            else {
                subList = students.subList(startIndex, endIndex);
                checkInvalidPageNum = true;
            }
            showStudentList(subList);
        }while (checkInvalidPageNum);
    }

    public Student createStudent() {
        int newId = getNewId();
        System.out.println("Nhập tên sinh viên");
        String newName = scanner.nextLine();
        int age = getInputAge();
        ESex eSex = getInputESex();
        System.out.println("Nhập vào địa chỉ");
        String address = scanner.nextLine();
        double averageScore = getInputScore();

        return new Student(newId,newName,age,eSex,address,averageScore);
    }
    public double getInputScore(){
        boolean isInvalidScore;
        double averageScore = 0;

        do {
            try {
                isInvalidScore = false;
                System.out.println("Nhập vào điểm trung bình của sinh viên");
                averageScore = Double.parseDouble(scanner.nextLine());
            }catch (NumberFormatException numberFormatException){
                System.out.println("Điểm nhập vào không hợp lệ. Xin nhập lại");
                isInvalidScore = true;
                continue;
            }
            if (averageScore < 0 || averageScore > 10){
                System.out.println("Điểm không thể là số âm hay lớn hơn 10. Xin nhập lại");
                isInvalidScore = true;
            }

        }while (isInvalidScore);


        return averageScore;
    }
    public ESex getInputESex(){
        ESex eSex;
        int id;

        do {
            System.out.println("Chọn giới tính cho sinh viên theo id thích hợp");
            System.out.printf("%-10s %-10s\n","ID","Name");
            for (ESex eSex1 : ESex.values()){
                System.out.printf("%-10s %-10s\n",eSex1.getId(),eSex1.getName());
            }

            id = Integer.parseInt(scanner.nextLine());
            eSex = ESex.getESexById(id);
        }while (eSex == null);

        return eSex;
    }
    public int getInputAge(){
        int age = 0;
        boolean isInvalidAge;

        do {
            isInvalidAge = false;

            try {
                System.out.println("Nhập tuổi của sinh viên");
                age = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException numberFormatException){
                System.out.println("Tuổi nhập vào không hợp lệ. Xin nhập lại");
                isInvalidAge = true;
                continue;
            }
            if (age < 0){
                System.out.println("Tuổi nhập vào không thể là số âm. Xin nhập lại");
                isInvalidAge = true;
            }
        }while (isInvalidAge);

        return age;
    }
    public int getIndexOfStudentbyId(int id){
        for (int i = 0; i<studentList.size(); i++){
            if (studentList.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }

    public int getNewId() {
        int maxId = 0;
        for (Student student : studentList) {
            if (student.getId() > maxId) {
                maxId = student.getId();
            }
        }
        return maxId + 1;
    }
    public Student getStudentById(int id){
        for (Student student: studentList){
            if (student.getId() == id){
                return student;
            }
        }
        return null;
    }
    public Student getStudentByInputId(){
        boolean isInvalidId;
        int id = -1;
        Student student = null;

        do {
            isInvalidId = false;

            try {
                System.out.println("Nhập vào ID của sinh viên: ");
                id = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException numberFormatException){
                System.out.println("ID nhập vào không hợp lệ. Xin nhập lại");
                isInvalidId = true;
                continue;
            }
            student = getStudentById(id);
            if (student == null){
                System.out.println("Không tìm được sinh viên với mã sinh viên trên. Xin nhập lại");
                isInvalidId = true;
            }
        }while (isInvalidId);

        return student;
    }
    public boolean isStudentIdExist(int id){
        for (Student student: studentList){
            if (student.getId() == id){
                return true;
            }
        }
        return false;
    }
    public int getInputId(){
        boolean isInvalidId;
        int id = -1;

        do {
            isInvalidId = false;

            try {
                System.out.println("Nhập vào ID của sinh viên: ");
                id = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException numberFormatException){
                System.out.println("ID nhập vào không hợp lệ. Xin nhập lại");
                isInvalidId = true;
                continue;
            }

            if (id < 0){
                System.out.println("ID không thể là số âm. Xin nhập lại");
                isInvalidId = true;
            }else {
                if (isStudentIdExist(id)){
                    System.out.println("Id đã tồn tại. Xin nhập lại");
                    isInvalidId = true;
                }
            }
        }while (isInvalidId);

        return id;
    }
}
