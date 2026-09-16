package Stacks;
import java.util.*;


public class consecutaiveChar {
    public static void main(String[] args) {
        String s = "abbaca";
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == ch)
                st.pop();
            else
                st.push(ch);
        }

        String ans = "";

        while (!st.isEmpty())
            ans = st.pop() + ans;

        System.out.println(ans);
    }
}