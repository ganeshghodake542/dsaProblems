package Recursion;

public class RaiseToThatNum {

    public static int Calc(int x, int m) {

        if (m == 0) {
            return 1;
        }

        return x * Calc(x, m-1);

    }

    public static void main(String[] args) {

        int x = Calc(2, 4);
        System.out.println(x);

    }
}
