package week03;

public class Exp {
    public static double computeExp(double x, int n) {
        double sum = 1.0;
        double term = 1.0;
        for (int i = 1; i <= n; i++) {
            term *= x / i;
            sum += term;
        }
        return Math.round(sum * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        int n = Integer.parseInt(args[1]);
        
        System.out.println(computeExp(x, n));
    }
}
