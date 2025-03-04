package week03;
import java.util.Scanner;

public class PerfectNumber{
    public static boolean isPerfect(int n){
        // begin edit
        if ( n<=1 ) {
            return false;
        }
		int sum = 0;
		for(int i = 1; i<n ; i++){
		    if(n%i==0){
			    sum+=i;
			}
		}
        return sum == n;
        //end edit
    }
    public static void main(String []args){
	    Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		System.out.println(isPerfect(n));
		sc.close();
        
    }
}