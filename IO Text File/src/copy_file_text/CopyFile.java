package copy_file_text;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException{
        copyFile("sourceFile.txt","targetFile.txt");
    }
    public static void copyFile(String sourceFile, String targetFile) throws IOException {
        File fileSource = new File(sourceFile);
        File fileTarget = new File(targetFile);
        FileReader fr = new FileReader(fileSource);
        FileWriter fw = new FileWriter(fileTarget);
        if (!fileSource.exists()) {
            System.out.println("tệp nguồn không tồn tại");
            return;
        }
        if (!fileTarget.exists()){
            System.out.println("tập tin đích đã tồn tại");
            return;
        }
        try(BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(fw)){
            String str;
            while ((str = br.readLine())!=null){
                bw.write(str);
                bw.newLine();
            }
        }
    }
}
