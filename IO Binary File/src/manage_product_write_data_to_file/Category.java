package manage_product_write_data_to_file;

public enum Category {
    LAP(1,"Laptop"), EARPHONE(2,"Tai nghe"), PHONE(3,"Dien thoai"), MOUSE(4,"Chuot");
    int id;
    String name;
    Category(int id, String name){
        this.id = id;
        this.name = name;
    }
}
