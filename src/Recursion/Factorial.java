package Recursion;

public class Factorial {

    public static int CalcFactorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * CalcFactorial(n - 1);

    }

    public static void main(String[] args) {
       System.out.println( CalcFactorial(5));
    }

}
