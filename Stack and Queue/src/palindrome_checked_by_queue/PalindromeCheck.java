package palindrome_checked_by_queue;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "Java is a language"; // Rats Deified Star
        String str1 = str.toLowerCase();
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str1.length(); i++) {
            stack.push(str1.charAt(i));
            queue.add(str1.charAt(i));
        }
        System.out.println(stack);
        System.out.println(queue);

        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome)
            System.out.println(str + " is palindrome");
        else System.out.println(str + " is not palindrome");
    }
}
