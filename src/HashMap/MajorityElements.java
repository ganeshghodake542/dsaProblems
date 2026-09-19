package HashMap;
import java.util.*;


public class MajorityElements {
    public static void main(String[] args) {

        int[] nums = {2,3,4,2,2,3,2,3};

         HashMap<Integer, Integer > hm = new HashMap<>();

        for (int i = 0 ; i< nums.length ; i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i], hm.get(nums[i])+1);
            }else{
                hm.put(nums[i] , 1);
            }
        }

        Set<Integer> keySet = hm.keySet();
        for(Integer key : keySet ){
            if(hm.get(key) > nums.length/2 ){
                System.out.println(key);
            }
        }

    }
    
}
