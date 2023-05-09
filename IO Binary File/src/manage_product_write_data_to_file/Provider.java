package manage_product_write_data_to_file;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Provider {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Product> productList = new ArrayList<>();
    public static WriteAndReadFile writeAndReadFile = new WriteAndReadFile();

    public static void createProdductFromMemmory(List<Product> products) {
//        int id, String name, double price, Category category, String description
        products.add(new Product(1, "JBL Ear Buds", 800000, Category.EARPHONE, "Tai nghe khong day JBL"));
        products.add(new Product(2, "Lenovo Laptop", 18000000, Category.LAP, "lap top 15 inches"));
        products.add(new Product(3, "Samsung S20FE", 9000000, Category.PHONE, "Dien thoai samsung"));
        products.add(new Product(4, "Office Mouse", 80000, Category.MOUSE, "Chuot van phong mau den"));
        products.add(new Product(5, "AirPods Pro", 700000, Category.EARPHONE, "Tai nghe khong day Iphone"));
    }

    public static void main(String[] args) {
        boolean check = true;
        do {
            int action;
            do {
                System.out.println("Menu");
                System.out.println("1. Them san pham vao file");
                System.out.println("2. Hien thi san pham tu file");
                System.out.println("3. Tim kiem san pham trong file");
                System.out.println("0. Exit");
                action = Integer.parseInt(scanner.nextLine());
            } while (action < 0 || action > 3);
            switch (action) {
                case 1:
                    addProduct(productList);
                    break;
                case 2:
                    showProducts(productList);
                    break;
                case 3:
                    findProduct(productList);
                    break;
                default:
                    check = false;
                    break;
            }
        }while (check);
    }

    private static void findProduct(List<Product> productList) {
//        int id, String name, double price, Category category, String description
        System.out.println("Them san pham moi");
        System.out.println("");

    }

    private static void showProducts(List<Product> productList) {
    }

    private static void addProduct(List<Product> productList) {
    }
    private static int findMaxId(List<Product> productList){
        int maxId = productList.get(0).getId();
        for (Product product: productList
             ) {
            if (product.getId() > maxId){
                maxId = product.getId();
            }
        }
        return maxId;
    }
}
