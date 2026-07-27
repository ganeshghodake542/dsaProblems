package Array;

public class ReverseArray {

    public static void reverseArr(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        reverseArr(arr);
        for (int index = 0; index < arr.length; index++) {
            System.err.println(arr[index]);
        }
    }

}