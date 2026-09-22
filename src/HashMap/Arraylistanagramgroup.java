package HashMap;
    import java.util.*;
/**
 * Arraylistanagramgroup
 */
public class Arraylistanagramgroup {
    public static void main(String[] args) {

        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            int[] freq = new int[26];

            for (int i = 0; i < str.length(); i++) {
                freq[str.charAt(i) - 'a']++;
            }

            String key = Arrays.toString(freq);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(str);
        }
        System.out.println(new ArrayList<>(map.values()));

    }

}