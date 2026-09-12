package Stacks;
import java.util.*;

public class basicBuiltInMethod {

    public static void main(String[] args) {
        Stack<String> st =new Stack<>();

        st.push("10");
        st.push("20");
        st.push("30");
        st.push("40");
        System.out.println(st);
        st.pop();
        System.out.println(st);
        

    }
    
}