package HashSet;
import java.util.*;

public class intersection {
    public static void main(String[] args) {

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};


        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for(int i = 0 ; i< nums1.length ; i++){
            set.add(nums1[i]);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
                result.add(num);
            }
        }

        int[] ans = new int[result.size()];

        int i = 0;

        for (int num : result ) {
            ans[i] = num;
            System.out.println(ans[i]);
            i++;
            
        }
        
    }
}
