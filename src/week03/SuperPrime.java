package week03;

import java.util.Scanner;

public class SuperPrime {
    public static boolean isPrime(int n) {
		if (n < 2){
            return false;
        }else if(n == 2 || n == 3){
            return true;
        }
        else if (n % 2 == 0){
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSuperPrime(int n) {
        while (n > 0) {
            if (!isPrime(n)) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(isSuperPrime(n));
    }
}
