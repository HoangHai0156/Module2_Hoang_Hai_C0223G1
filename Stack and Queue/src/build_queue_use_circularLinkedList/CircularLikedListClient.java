package build_queue_use_circularLinkedList;


public class CircularLikedListClient {
    public static void main(String[] args) {
        MyCircularLinkedListQueue myLinkedListQueue = new MyCircularLinkedListQueue();
        myLinkedListQueue.enQueue(10);
        myLinkedListQueue.enQueue(20);

        System.out.println(myLinkedListQueue.deQueue().getData());
        System.out.println(myLinkedListQueue.deQueue().getData());
        System.out.println(myLinkedListQueue.deQueue().getData());

        myLinkedListQueue.enQueue(30);
        myLinkedListQueue.enQueue(40);
        myLinkedListQueue.enQueue(50);
    }
}
