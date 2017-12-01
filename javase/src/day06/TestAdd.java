package day06;

public class TestAdd {
	public static int add(int a,int b){
		System.out.println("add(int,int)...");
		return a+b;
	}
	public static double add(double a,double b){
		return a+b;
	}
	public static void main(String[] args) {
		add(1,2);
		//add(1.0,2.0);
	}

}
