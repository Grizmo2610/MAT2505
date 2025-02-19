package week02;

public class MovementTime {
    public static void main(String[] args) {
        double S = Double.parseDouble(args[0]);
        double v0 = Double.parseDouble(args[1]);
        double a = Double.parseDouble(args[2]);

        if (S <= 0 || v0 < 0 || a <= 0) {
            System.out.println("-1");
            return;
        }

        double A = a / 2;
        double B = v0;
        double C = -S;

        double delta = B * B - 4 * A * C;

        if (delta < 0) {
            System.out.println("-1");
            return;
        }

        double t1 = (-B + Math.sqrt(delta)) / (2 * A);
        double t2 = (-B - Math.sqrt(delta)) / (2 * A);
        
        if (t1 > 0){
            System.out.printf("%.2f\n",t1);
        }else if(t2 > 0){
            System.out.printf("%.2f\n",t1);
        }else{
            System.out.printf("-1");
        }
    }
}
