package week04;

import java.util.Scanner;
public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Vui lòng nhập số nguyên dương.");
            return;
        }
        boolean first = true;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                if (!first) {
                    System.out.print(" ");
                }
                System.out.print(i);
                n /= i;
                first = false;
            }
        }

        scanner.close();
    }
}
