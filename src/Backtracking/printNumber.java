package Backtracking;

public class printNumber {

    public static void changeNum(int arr[], int i , int val){
        if(i== arr.length){
            printNum(arr);
            return;
        }

        arr[i] = val;
        changeNum(arr, i+1, val+1);
        arr[i] = val-2;

    }

    public static void printNum(int arr[]) {
        for( int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        changeNum(arr, 0, 01);
        System.out.println();
        printNum(arr);
    }
}