package week02;

public class RightTriangle{
    
    static boolean isTriangle(double a, double b, double c){
        // begin edit 
        if( a>0 && b>0 && c>0 && a+b > c && a+c>b && b+c>a ) {
			return true;
        } else {
			return false;
        }
        //end edit
    }
    public static void main (String args[]){
        double a = Double.parseDouble (args[0]);
		double b = Double.parseDouble (args[1]);
		double c = Double.parseDouble (args[2]);
		boolean check = isTriangle(a,b,c);
		System.out.println(check);
		if (check == true){
			System.out.println("la mot tam giac");
        } else {
			System.out.println("khong phai la mot tam giac");
		}
    }
}