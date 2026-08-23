package Sorting;

public class selectionSorting {
    public static void main(String[] args) {

        int arr[] = { 4, 3, 5, 1, 2 };

        for (int i = 0; i < arr.length; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            // swap

            int temp = arr[min];
            arr[min] =  arr[i];
            arr[i] = temp;

        }

        for (int b = 0; b < arr.length; b++) {
            System.out.println( b+ " = " +arr[b]);
        }
    }

}
