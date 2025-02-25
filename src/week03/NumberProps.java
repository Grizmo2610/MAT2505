package week03;

public class NumberProps{
    public static boolean isPrime(int k){
        if (k < 2){
            return false;
        }else if(k == 2 || k == 3){
            return true;
        }
        else if (k % 2 == 0){
            return false;
        }

        for (int i = 3; i <= Math.sqrt(k); i += 2){
            if (k % i == 0) {
                return false;
            }
        }
        return true;
    }   
}
