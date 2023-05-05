package find_max_num_in_numsFile;

import java.io.*;
import java.util.Scanner;

public class ReadAndWriteFile {
    public static int findMaxValue(String pathFile) throws IOException{
        File file = new File(pathFile);
        int max = 0;
        int recent = 0;
        try(Scanner scanner = new Scanner(file).useDelimiter("\\s+")){
            if (scanner.hasNext())
                max = Integer.parseInt(scanner.next());
            while (scanner.hasNext()){
                if (max < (recent = Integer.parseInt(scanner.next()))){
                    max = recent;
                }
            }
            return max;
        }
    }

    public static void main(String[] args) throws IOException{
        File file = new File("result.txt");
        int max = findMaxValue("nums1.txt");
        FileWriter fw = new FileWriter(file);
        fw.write(""+max);
        fw.close();
    }
}
