package week03;
import java.util.Scanner;
public class NPrimes {
	public static boolean checkPrime(int n){
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

    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
        for (int i = 2, count = 0; count < n; i ++){
            if (checkPrime(i)){
                count++;
                System.out.print(i + " ");
            }
        }
	}
}