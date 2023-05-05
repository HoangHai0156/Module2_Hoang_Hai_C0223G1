package sum_nums_in_textFile;

import java.io.*;

public class ReadFileExample {
    public static void main(String[] args) throws IOException {
        File file = new File("nums.txt");
        FileWriter fw = new FileWriter(file);
        try (BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("5\n");
            bw.write("3\n");
            bw.write("6\n");
            bw.write("1\n");
            bw.write("8\n");
        }
        sumFile("nums.txt");
    }

    public static void sumFile(String filePath) throws IOException {
        File file = new File(filePath);
        FileReader fr = new FileReader(file);
        String str = "";
        try (BufferedReader br = new BufferedReader(fr)) {
            try {
                int sum = 0;
                int num;
                while ((str = br.readLine()) != null) {
                    num = Integer.parseInt(str);
                    sum += num;
                }
                System.out.println("Sum = "+sum);
            }catch (NumberFormatException e){
                System.err.println("Noi dung co loi: "+str);
            }
        }
    }
}
