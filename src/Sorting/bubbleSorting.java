package Sorting;

public class bubbleSorting {
    public static void main (String args[]) {
       int nums[] = {5, 2, 1, 3};

        int n = nums.length;

        for (int i = 0 ; i< n-1 ;i++){
            for (int j = 0 ; j < n-1-i ; j++ ){
                if(nums[j] > nums[j+1]){
                    //swap
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
           
        } 
        for(int i= 0 ; i<n; i++){
            System.out.println(nums[i]);
        }
    }
}