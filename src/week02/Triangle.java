package week02;

public class Triangle{
    static double getArea(double a, double b, double c) {
        if( a>0 && b>0 && c>0 && a+b > c && a+c>b && b+c>a ) {
			double p = (a + b +c) / 2;
			return Math.sqrt( p * ( p - a ) * ( p - b ) * ( p - c ));
        } else { 
            return 0; 
        }
}
    public static void main(String [] args){
        double a = Double.parseDouble (args[0]);
		double b = Double.parseDouble (args[1]);
		double c = Double.parseDouble (args[2]);  
        System.out.println(getArea(a,b,c));
    }
}