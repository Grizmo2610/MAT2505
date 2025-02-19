package week02;

public class ConvertUnit3{
    public static void main(String[] args){
        double x = Double.parseDouble(args[0]);
        double y = x * 9 / 5.0 + 32;
        System.out.printf("%.2f\n", y);
    }
}
