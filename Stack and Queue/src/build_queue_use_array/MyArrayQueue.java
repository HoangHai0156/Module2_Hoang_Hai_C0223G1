package build_queue_use_array;

import java.io.NotActiveException;

public class MyArrayQueue {
    private int capacity;
    private int[] queueArr;
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyArrayQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueEmpty() {
        if (currentSize == 0)
            return true;
        return false;
    }

    public boolean isQueueFull() {
        if (currentSize == capacity)
            return true;
        return false;
    }

    public void enqueue(int element) {
        if (isQueueFull())
            System.out.println("mang da day");
        else {
            tail++;
            if (tail == currentSize - 1) {
                tail = 0;
            }
            queueArr[tail] = element;
            currentSize++;
            System.out.println("Element " + element + " is pushed to Queue !");
        }
    }

    public void dequeue() {
        if (isQueueEmpty())
            System.out.println("khong co gia tri de xoa");
        else {
            head++;
            if (head == capacity) {
                System.out.println("Da xoa phan tu: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Da xoa phan tu: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }
}
