package thuc_hanh_1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyTest {
    public static void main(String[] args) {

    }
    private static void copyFileUsingJava7Files(File source, File target) throws IOException {
        Files.copy(source.toPath(),target.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    protected static void copyFileUsingStream(File source, File target) throws IOException{
        try(InputStream inputStream = new FileInputStream(source);
            OutputStream outputStream = new FileOutputStream(target)){
            byte[] bytes = new byte[1024];
            int length;
            while ((length = inputStream.read(bytes))>0){
                outputStream.write(bytes,0,length);
            }
        }
    }
}
