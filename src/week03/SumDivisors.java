package week03;

public class SumDivisors {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum = 1;
        for (int i = 2; i < n; i ++){
            if (n % i == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
