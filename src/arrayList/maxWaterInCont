class Solution {
    public int maxArea(int[] height) {

        int global = 0;
        int ht;
        
        for (int i = 0 ; i<height.length ; i++){
            for(int j = i+1 ; j<height.length ; j++){
                
                if(height[i]> height[j]){
                     ht = height[j];
                }else{
                     ht = height[i];
                }
                int width = j-i;
                
                int area = ht * width;

                if(area > global){
                    global = area;
                }
            }
            

        }return global;
    }
}