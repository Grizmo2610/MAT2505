package week03;

public class AverageEvens {

    public static double averageEvens(int n){
        int sum = 0;
        for (int i = 1; i <= n; i += 2){
            sum += i;
        }

        int amout = (n + 1) / 2;
        return 1.0 * sum / amout;
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(averageEvens(n));
    }
}
