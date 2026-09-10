class Solution {
    
    public int maxArea(int[] height) {

        int lp = 0 ;
        int rp = height.length-1;
        int global = 0;
        

        while(lp < rp){

            int ht;

            if(height[lp] < height[rp]){
                ht = height[lp];
            }
            else{
                ht = height[rp];
            }
            int width = rp-lp;

            int currArea = ht * width;

            if(currArea > global){
                global = currArea;     
            }

            if(height[lp]<height[rp]){
                lp++;
            }
            else {
                rp--;
            }

            
        }
        return global;
    }
}