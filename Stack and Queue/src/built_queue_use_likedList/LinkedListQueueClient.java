package built_queue_use_likedList;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue myLinkedListQueue = new MyLinkedListQueue();
        myLinkedListQueue.enqueue(10);
        myLinkedListQueue.enqueue(20);

        System.out.println(myLinkedListQueue.dequeue().getKey());
        System.out.println(myLinkedListQueue.dequeue().getKey());
        System.out.println(myLinkedListQueue.dequeue().getKey());

        myLinkedListQueue.enqueue(30);
        myLinkedListQueue.enqueue(40);
        myLinkedListQueue.enqueue(50);

//        System.out.printf("");
    }
}
