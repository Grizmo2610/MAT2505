package week02;

public class SumEven {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        for (int i = 2; i < n; i ++){
            sum += i;
        }
        System.out.println(sum);
    }
}
