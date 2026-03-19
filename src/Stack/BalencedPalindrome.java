package Stack;
import java.util.Stack;
public class BalencedPalindrome {
        static boolean isBalanced(String s) {
            Stack<Character> st = new Stack<>();
            for (char c : s.toCharArray()) {
                if (c == '(' || c == '{' || c == '[') st.push(c);
                else {
                    if (st.isEmpty()) return false;
                    char t = st.pop();
                    if ((c == ')' && t != '(') ||
                            (c == '}' && t != '{') ||
                            (c == ']' && t != '[')) return false;
                }
            }
            return st.isEmpty();
        }

        public static void main(String[] args) {
            String s1 = "{[()]}";
            System.out.println(isBalanced(s1));

        }
    }





