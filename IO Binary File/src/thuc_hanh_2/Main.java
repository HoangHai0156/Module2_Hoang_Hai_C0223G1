package thuc_hanh_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Van B", "Hue"));
        studentList.add(new Student(2, "Pham A", "Da Nang"));
        studentList.add(new Student(3, "Tran C", "HCM"));
        studentList.add(new Student(4, "Hoang D", "Ha Noi"));
        studentList.add(new Student(5, "Vinh E", "Hai Phong"));
        String path = "src/thuc_hanh_2/students.txt";
        writeDataToFile(path, studentList);
        List<Student> studentDataFromFile = readDataFromFile(path);
        for (Student student : studentDataFromFile
        ) {
            System.out.println(student);
        }
    }

    private static List<Student> readDataFromFile(String path) throws IOException, ClassNotFoundException {
        List<Student> studentList = new ArrayList<>();
        try (FileInputStream fileInputStream = new FileInputStream(path);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            studentList = (List<Student>) objectInputStream.readObject();
        }
        return studentList;
    }

    private static void writeDataToFile(String path, List<Student> studentList) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(path);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            objectOutputStream.writeObject(studentList);

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

}
