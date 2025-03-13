package week04;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int n) {
        int num = n;
        int temp;
        int sum = 0;

        while (n > 0) {
            temp = n % 10;
            sum = sum * 10 + temp;
            n /= 10;
        }

        return (sum == num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isPalindrome(n)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        sc.close();
    }
}
