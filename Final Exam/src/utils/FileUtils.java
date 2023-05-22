package utils;

import model.Student;
import views.StudentManageView;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    private static StudentManageView studentManageView;
    public static List<Student> readDataFromFile(String filePath) {
        List<Student> datas = new ArrayList<>();

        File file = new File(filePath);
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)){

            String line;
            while ((line = bufferedReader.readLine()) != null){
                Student student = new Student();
                student.parseData(line);
                datas.add(student);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return datas;
    }

    public static void writeDataToFile(List<Student> studentList, String filePath){
        File file = new File(filePath);
        try (FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){

            for (Student student: studentList){
                bufferedWriter.write(student.toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
