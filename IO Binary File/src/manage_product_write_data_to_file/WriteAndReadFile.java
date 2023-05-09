package manage_product_write_data_to_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadFile {
    public WriteAndReadFile(){

    }
    protected void writeObjectToFile(String path, List<Product> productList){
        try(FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            objectOutputStream.writeObject(productList);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    protected List<Product> readObjectFromFile(String path, List<Product> productList){
        List<Product> readProductList = new ArrayList<>();
        try(FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            readProductList = (List<Product>) objectInputStream.readObject();

        }catch (Exception e){
            e.printStackTrace();
        }
        return readProductList;
    }
}
