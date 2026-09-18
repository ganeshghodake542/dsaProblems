package Queue;

import java.util.*;

public class FirstNonRepeating {

    public static void main(String[] args) {

        String s = "aabc";

        Queue<Character> q = new LinkedList<>();
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Add character to queue
            q.add(ch);

            // Increase frequency
            freq[ch - 'a']++;

            // Remove repeating characters from front
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            // Print first non-repeating character
            if (q.isEmpty()) {
                System.out.print("# ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }
    }
}