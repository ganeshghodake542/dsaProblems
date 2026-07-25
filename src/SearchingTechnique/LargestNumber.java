package SearchingTechnique;

public class LargestNumber {
    public static void main(String[] args) {
        int large = -1;
        int Num[] = {2,5,9,1,3};
        for(int i = 0 ; i<Num.length ; i++){
            if(Num[i]>large){
                large =Num[i];
            }
        }
        System.out.print(large);
    }
}
