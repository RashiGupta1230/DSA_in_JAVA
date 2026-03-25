package Stack;
import java.util.Stack;
/* You have a string, denoted as A. to transform the string,you should perform following operation repeatedly.
Identify the first occurrence of consecutive identical pairs of characters within the string
 remove this pair of identical characters from string.
 repeat steps 1 and 2 until there is no more consecutive identical pair of characters.
 final result will be the transformed string.*/
public class ConsecutiveIdenticalPairs {
    public static void main(String[] args) {
        String A = "abbaca";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);

            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        String result = "";
        for (char c : stack) {
            result = result + c;
        }

        System.out.println(result);
    }
}
