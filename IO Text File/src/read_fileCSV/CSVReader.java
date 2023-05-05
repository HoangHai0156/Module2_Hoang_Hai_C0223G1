package read_fileCSV;

import java.io.*;

public class CSVReader {
    public static void main(String[] args) throws IOException{
        readFileCSV("nationList.csv");
    }
    public static void readFileCSV(String pathFileCSV) throws IOException{
        File file = new File(pathFileCSV);
        FileReader fr = new FileReader(file);
        try(BufferedReader br = new BufferedReader(fr)){
            String str;
            while ((str = br.readLine())!=null){
                String[] strList = str.split(",");
                Nation nation = new Nation(Integer.parseInt(strList[0]),strList[1],strList[2]);
                System.out.println(nation);
            }
        }
    }
}
