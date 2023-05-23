package bai20;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String string = "{}(";

        System.out.println(isBracketGood(string));
    }
    public static boolean isBracketGood(String str){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char sym = str.charAt(i);
            if (sym == '(')
                stack.push(sym);
            else if (sym == ')'){
                if (stack.isEmpty())
                    return false;
                else stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
