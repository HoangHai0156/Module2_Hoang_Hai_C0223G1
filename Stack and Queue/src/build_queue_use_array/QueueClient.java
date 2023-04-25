package build_queue_use_array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueClient {
    public static void main(String[] args) {
        MyArrayQueue myArrayQueue = new MyArrayQueue(4);
        System.out.println(myArrayQueue.isQueueEmpty());
        myArrayQueue.enqueue(45);
        myArrayQueue.enqueue(46);
        myArrayQueue.enqueue(47);
        myArrayQueue.enqueue(48);
        System.out.println(myArrayQueue.isQueueFull());
        myArrayQueue.enqueue(49);
        myArrayQueue.dequeue();
        myArrayQueue.dequeue();
        myArrayQueue.dequeue();
        myArrayQueue.dequeue();
        System.out.println(myArrayQueue.isQueueEmpty());
        myArrayQueue.dequeue();
    }
}
