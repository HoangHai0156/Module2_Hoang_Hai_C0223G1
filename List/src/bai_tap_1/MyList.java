package bai_tap_1;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else throw new IllegalArgumentException("capacity: " + capacity);
    }

    public E get(int i) {
        return (E) elements[i];
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    public boolean add(E element) {
        if (size == elements.length)
            ensureCapa();
        elements[size] = element;
        size++;
        return true;
    }

    public void add(E element, int index) {
        if (index > elements.length || index < 0)
            throw new IllegalArgumentException("Index: " + index);
        else if (size == elements.length)
            ensureCapa();

        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }

    public void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return index;
    }
    public boolean contains(E element){
        return indexOf(element) >= 0;
    }
    public MyList<E> clone(){
        MyList<E> clone = new MyList<>();
        clone.elements = Arrays.copyOf(this.elements, this.size);
        clone.size = this.size;
        return clone;
    }
    public E remove(int index){
        if (index > elements.length || index < 0)
            throw new IllegalArgumentException("Index: " + index);
        else {
            E element = (E) elements[index];
            for (int i = index; i < size-1; i++){
                elements[i] = elements[i+1];
            }
            elements[size-1] = null;
            size--;
            return element;
        }
    }
}
