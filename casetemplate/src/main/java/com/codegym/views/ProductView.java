package com.codegym.views;

import com.codegym.model.ECategory;
import com.codegym.model.Product;
import com.codegym.service.ProductServiceInFile;
import com.codegym.service.ProductServiceInMemory;
import com.codegym.utils.DateUtils;
import com.codegym.utils.ProductComparator;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ProductView {
    private Scanner scanner = new Scanner(System.in);
    private ProductServiceInFile productService;

    public ProductView() {
        productService = new ProductServiceInFile();
    }

    public void launcher() {
        boolean check = true;
        do{
            int actionMenu;
            do {
                System.out.println("Menu chương trình:");
                System.out.println("Nhập 1: Xem danh sách sản phẩm");
                System.out.println("Nhập 2: Thêm sản phẩm");
                System.out.println("Nhập 3: Xóa sản phẩm");
                System.out.println("Nhập 4: Sắp xếp sản phẩm");
                System.out.println("Nhập 5: Tìm kiếm sản phẩm");
                System.out.println("Nhập 6: Đọc dữ liệu từ file");
                System.out.println("Nhập 7: Ghi dữ liệu xuống file");
                System.out.println("Nhập 8: Tìm kiếm sản phẩm có phân trang");
                System.out.println("Nhập 0: Exit");

                actionMenu = Integer.parseInt(scanner.nextLine());
            }while (actionMenu < 0 || actionMenu > 9);
            switch (actionMenu) {
                case 1:
                    showProducts(productService.findAllProducts());
                    break;
                case 2:
                    showCreateProduct();
                    break;
                case 3:
                    showDeleteProductById();
                    break;
                case 4:
                    sortProducts();
                    break;
                case 5:
                    searchProduct();
                    break;
//                case 8:

                case 0:
                    check = false;
                    break;
            }
        }while (check);



    }

    private void searchProduct() {
        showProducts(productService.findAllProducts());
        System.out.println("Chọn phương án tìm kiếm: ");
        System.out.println("Chọn 1: Tìm kiếm theo id");
        System.out.println("Chọn 2: Tìm kiếm theo tên");
        int action = Integer.parseInt(scanner.nextLine());
        switch (action){
            case 1:
                System.out.println("Nập ID muốn tìm kiếm");
                long id = Long.parseLong(scanner.nextLine());
                Product idSearchProduct = productService.findProductById(id);
                System.out.println(idSearchProduct);
                break;
            case 2:
                System.out.println("Nập tên muốn tìm kiếm");
                String name = scanner.nextLine();
                List<Product> nameSearchProduct = productService.findProductByName(name);
                showProducts(nameSearchProduct);
                break;
        }
    }

    private void sortProducts() {
        List<Product> productList = productService.findAllProducts();
        showProducts(productList);
        System.out.println("Chọn cách thức sắp xêp: ");
        System.out.println("Chọn 1: Sắp xếp theo tên");
        System.out.println("Chọn 2: Sắp xếp theo Id");
        System.out.println("Chọn 3: Sắp xếp theo ngày tạo");
        System.out.println("Chọn 4: Sắp xếp theo Category");
        System.out.println("Chọn 5: Sắp xếp theo giá");
        int action = Integer.parseInt(scanner.nextLine());
        switch (action){
            case 1:
                ProductComparator nameComparator = new ProductComparator("name");
                productList.sort(nameComparator);
                break;
            case 2:
                ProductComparator idComparator = new ProductComparator("id");
                productList.sort(idComparator);
                break;
            case 3:
                ProductComparator createAtComparator = new ProductComparator("createAt");
                productList.sort(createAtComparator);
                break;
            case 4:
                ProductComparator eCategoryComparator = new ProductComparator("eCategory");
                productList.sort(eCategoryComparator);
                break;
            default:
                ProductComparator priceComparator = new ProductComparator("price");
                productList.sort(priceComparator);
                break;
        }
        showProducts(productList);
    }

    private void showDeleteProductById() {
        showProducts(productService.findAllProducts());
        System.out.println("Nhập vào ID của sản phẩm muốn xóa");
        long id = Long.parseLong(scanner.nextLine());
        while (!productService.isIdExist(id)){
            System.out.println("ID không tồn tại! Nhập vào ID của sản phẩm muốn xóa");
            id = Long.parseLong(scanner.nextLine());
        }
        productService.deleteProduct(id);
        showProducts(productService.findAllProducts());
    }

    private void showCreateProduct() {
        System.out.println("Thêm san phẩm");
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập mo ta: ");
        String description = scanner.nextLine();
        System.out.println("Nhap gia: ");
        float price = Float.parseFloat(scanner.nextLine());

        System.out.println("Chon danh muc:");
        for (ECategory eCategory : ECategory.values()) {
            System.out.printf("Chon %-5s %-10s\n", eCategory.getId(), eCategory.getName());
        }
        int idCategory = Integer.parseInt(scanner.nextLine());
        ECategory eCategory = ECategory.getECategoryById(idCategory);

        //long id, String name, String description,float price, Date createAt, ECategory eCategory) {
        Product p1 = new Product(System.currentTimeMillis() / 1000, name, description, price, new Date(), eCategory);
        productService.addProduct(p1);

        showProducts(productService.findAllProducts());

    }

    private void showProducts(List<Product> allProducts) {

        System.out.printf("%-15s %-10s %-30s %-10s %-30s %-20s\n", "ID", "Name", "Description", "Price", "Create at", "Category");
        for (Product p : allProducts) {
            //long id, String name, String description,float price, Date createAt, ECategory eCategory) {
            System.out.printf("%-15s %-10s %-30s %-10s %-30s %-20s\n", p.getId(), p.getName(), p.getDescription(),
                    p.getPrice(), DateUtils.format(p.getCreateAt()), p.geteCategory());
        }
    }


}
