package week01;

public class ConvertUnit1{ 
	public static void main(String[] args){
        double x = Double.parseDouble(args[0]);
        double y = x*39.3700787;
        System.out.println(Math.round(y*100.0)/100.00);
	}
}
