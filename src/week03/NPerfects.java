package week03;

import java.util.Scanner;
public class NPerfects{
    public static boolean isPerfect(int n){
        //begin edit
        if (n<2){
            return false;
        }
        int sum = 0;
		for(int i = 1; i<n ; i++){
            if( n%i==0 ){
                sum+=i;
                }
            }
		return sum == n;
    }
    
    public static void printNPerfect(int n){
        for (int j = 1; j < n ; j++){
            if (isPerfect(j)){
                System.out.print(j + " ");
            }
        }
		
		
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printNPerfect(n);
        sc.close();
    }
}