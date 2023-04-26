package breacket_check;

import java.util.Stack;

public class BracketCheck {
    public static void main(String[] args) {
        String str = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
        System.out.println(isBracketGood(str));

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
