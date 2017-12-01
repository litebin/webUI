package day05;
public class TestLen {
	public static void mian(String[] args){
	   double a=3.0;
	   double b=4.0;
	   double c=len(a,b);
	   System.out.println(c);
   }
     public static double len(double a,double b){
		double d=a*a+b*b;
		return Math.sqrt(d);
	}

}