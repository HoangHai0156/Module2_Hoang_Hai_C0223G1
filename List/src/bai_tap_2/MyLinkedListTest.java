package bai_tap_2;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        myLinkedList.addFirst(2);
        myLinkedList.addLast(4);
        myLinkedList.addLast(5);
        myLinkedList.addLast(6);
        myLinkedList.addLast(9);

//        myLinkedList.clear();
//        myLinkedList.remove(6);
//        System.out.println(myLinkedList.contains(2));
//        System.out.println(myLinkedList.indexOf(12));
        myLinkedList.clear();

//        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.getFirst());
        System.out.println(myLinkedList.getLast());
        System.out.println(myLinkedList.size());

//        System.out.println("clone......");
//
//        MyLinkedList myLinkedList1 = myLinkedList.clone();
//
//        System.out.println(myLinkedList1.get(1));
//        System.out.println(myLinkedList1.getFirst());
//        System.out.println(myLinkedList1.getLast());
//        System.out.println(myLinkedList1.size());
    }
}
