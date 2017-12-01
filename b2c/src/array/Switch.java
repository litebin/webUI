package array;

public class Switch {
             public static void main(String[] args) {
				Car c=Car.audi;
				switch(c){
				case lamborghini:
					System.out.println("土豪，太崇拜了");
					break;
				case audi:
					System.out.println("哼！小样");
					break;
				default:
					System.out.println("xxxx!");
				
				}
			}
}
