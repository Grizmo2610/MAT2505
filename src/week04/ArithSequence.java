package week04;
import java.util.Scanner;
class ArithSequence
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        int S = (a+d*(n-1));
        System.out.println(S);
        sc.close();
    }
}