package Stacks;
import java.util.*;

class baseBallGame {
    public int calPoints(String[] operations) {
        int ans = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0 ; i  < operations.length; i++) {

            // int num = Integer.parseInt(operations[i]);
            // st.push(num);

            if(operations[i].equals("C")){
                st.pop();
            }

            else if(operations[i].equals("D")){
                int x = st.peek()*2;
                st.push(x);
            }
            else if (operations[i].equals("+")) {
                int x = st.pop();
                int y = st.peek();
                st.push(x);
                st.push(x + y);
            }

            else{
                int num = Integer.parseInt(operations[i]);
                st.push(num);
            }

        }

        while (!st.isEmpty()) {
            ans = st.pop() + ans;
        }

        return ans;

    }
}
