package String;

public class Palindrome {

    public static void main(String[] args) {

        String str = "abc";

        int n = str.length();

        for (int i = 0; i < n / 2; i++) {

            if (str.charAt(i) != str.charAt(n - i - 1)) {
                System.out.println("Not Palindrome");
                return;
            }
        }

        System.out.println("Palindrome");
    }
}