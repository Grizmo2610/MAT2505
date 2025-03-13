package week04;

public class SimplifyFrac {
    public static void main(String[] args) {
        int nume = Integer.parseInt(args[0]);
        int denom = Integer.parseInt(args[1]);

        printSimplest(nume, denom);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int num = b;
            b = a % b;
            a = num;
        }
        return Math.abs(a);
    }

    public static void printSimplest(int nume, int denom) {
        int gcd = gcd(nume, denom);
        nume = nume / gcd;
        denom = denom / gcd;

        if (denom < 0) {
            nume = nume * (-1);
            denom = denom * (-1);
        }

        System.out.println(nume + "/" + denom);
    }
}
