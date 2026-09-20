package HashSet;
import java.util.*;

public class CountDistnElement {

    public static void main(String[] args) {

        int[] arr = {1,2,1,3,4,2,6}; // size = 5
        
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0 ; i< arr.length ; i++){
            set.add((arr[i]));
        }

        System.out.println(set.size());

    }    
}