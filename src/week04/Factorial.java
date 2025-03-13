package week04;

import java.util.Scanner;
class Factorial {
	public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int fac = 1;
            if (n%2 == 0){
                for (int i =2; i<=n; i+=2){
                    fac *= i;
                }
            } else { 
                for (int i=1; i<=n; i+=2){
                    fac *=i;
                }
        }
        System.out.println(fac);
        sc.close();
	}
}