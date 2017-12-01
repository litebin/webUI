package string;

public class ReverseString {
	//字符串反转
     public static void main(String[] args) {
		String str="gip a ma I";
		String reverse=new StringBuffer(str).reverse().toString();
		System.out.println("\nString before reverse:"+str);
		System.out.println("\nString after reverse:"+reverse);

		
		reverse.toString();
		StringBuilder a=new StringBuilder(str);
		//StringBuilder 多线程时，更安全
	}
}
