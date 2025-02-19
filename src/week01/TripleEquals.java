package week01;

public class TripleEquals {
        public static void main(String[] args) {
        String a = args[0];
        String b = args[1];
        String c = args[2];
        boolean check = a.equals(b) && a.equals(c) ;
        System.out.println(check);
	}
}