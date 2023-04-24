package bai_tap_1;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(1);
        myList.add(3,0);
        myList.add(5);
        myList.add(8);
        myList.add(12);
        myList.add(6);

        MyList cloneList = myList.clone();

//        myList.clear();

        System.out.println(cloneList.get(0));
        System.out.println(cloneList.get(1));
        System.out.println(cloneList.get(2));
        System.out.println(cloneList.get(3));
        System.out.println(cloneList.get(4));

        cloneList.remove(1);

        System.out.println(cloneList.get(0));
        System.out.println(cloneList.get(1));
        System.out.println(cloneList.get(2));
        System.out.println(cloneList.get(3));
        System.out.println(cloneList.get(4));
//        System.out.println(myList.size());
//        System.out.println(myList.indexOf(3));
//        System.out.println(myList.contains(10));
    }
}
