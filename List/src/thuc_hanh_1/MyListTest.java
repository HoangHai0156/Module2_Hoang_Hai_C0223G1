package thuc_hanh_1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);

        System.out.println(listInteger.getElement(4));
        System.out.println(listInteger.getElement(1));
        System.out.println(listInteger.getElement(2));

//        System.out.println(listInteger.getElement(6));

        System.out.println(listInteger.getElement(-1));
    }
}