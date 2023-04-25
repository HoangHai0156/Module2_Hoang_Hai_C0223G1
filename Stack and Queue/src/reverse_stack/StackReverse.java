package reverse_stack;

import java.util.Arrays;
import java.util.Stack;

public class StackReverse {
    public static void main(String[] args) {
        Stack<Integer> intStack = createIntStack();
        String str = "Umbalaxibua";

//        System.out.println("Before reverse: ");
//        System.out.println(intStack);
//
//        reverseInterger(intStack);
//
//        System.out.println("After reverse: ");
//        System.out.println(intStack);

        System.out.println("Before reverse: ");
        System.out.println(str);

        str = reverseString(str);

        System.out.println("After reverse: ");
        System.out.println(str);

    }
    public static void reverseInterger(Stack<Integer> stack){
        for (int i =0; i < stack.size(); i++){
            stack.add(i,stack.pop());
        }
    }
    public static Stack<Integer> createIntStack(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        return stack;
    }
    public static String reverseString(String str){
        int N = str.length();
        String str1 = "";
        Stack<Character> stack = new Stack<>();
        for (int i =0; i < N;i++){
            stack.push(str.charAt(i));
        }
        for (int i =0; i < N;i++){
            str1 += stack.pop();
        }
        return str1;
    }
}
