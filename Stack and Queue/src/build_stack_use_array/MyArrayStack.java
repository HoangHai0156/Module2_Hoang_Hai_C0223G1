package build_stack_use_array;

import java.util.EmptyStackException;

public class MyArrayStack {
    private int[] arr;
    private int size;
    private int index = 0;
    public MyArrayStack(int size){
        this.size = size;
        arr = new int[this.size];
    }
    public boolean isStackFull(){
        if (index == size)
            return true;
        return false;
    }
    public boolean isStackEmpty(){
        if (index == 0)
            return true;
        return false;
    }
    public int size(){
        return index;
    }
    public void push(int element){
        if (isStackFull()){
            throw new StackOverflowError("Stack is full");
        }
        arr[index++] = element;
    }
    public int pop(){
        if (isStackEmpty())
            throw new EmptyStackException();
        return arr[--index];
    }
}
