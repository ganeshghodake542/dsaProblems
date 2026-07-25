package SearchingTechnique;

public class LinearSearch {

    public static void main(String[] args) {
        int Num[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 10;

        for (int i = 0; i < Num.length; i++) {
            if (key == Num[i]) {
                
                System.out.println("Key is at Index :" + i);
                break;
            }
            
            
        }
    }
}