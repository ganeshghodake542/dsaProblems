package HashMap;
import java.util.*;


class validAnagram {
    public boolean isAnagram(String s, String t) {
        HashMap<String ,Integer > hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            String ch = String.valueOf(s.charAt(i));

            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {

            String ch = String.valueOf(t.charAt(i));

            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) - 1);
            } else {
                return false;
            }
        }

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        
    }
        
}