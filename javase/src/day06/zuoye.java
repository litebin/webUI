package day06;

public class zuoye {
       
        	 public static void main(String[] args) {
        		 // a+bc*2=30, a+bc*3=50, a+bc*4=90£¬Çóa,b,c
        	        int a = 30;
        	        int b = 30;
        	        int c = 30; 
        		 
        	        for (int i = 0; i <= a; i++) {
        	            for (int j = 0; j <= b; j++) {
        	                for (int k = 0; k <= c; k++) {
        	                    if (i + j * k * k == 30 && i + j * k * k * k == 50
        	                            && i + j * k * k * k * k == 90) {
        	                        System.out.println(i + " " + j + " " + k);
        	                    }
        	                }
        	            }
        	        }
        	    

		}
}
