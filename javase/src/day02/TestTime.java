package day02;

import java.util.Scanner;

public class TestTime {
	 public static void main(String[] args){
		 //���7099����ڶ���xʱx��x��
		 Scanner sc =new Scanner(System.in);
		 System.out.println("������������");
		 int second=sc.nextInt();
		 int h=second/3600; 
		 int m=second%3600/60;
		 int s= second%3600%60;
		 System.out.println(h+"ʱ"+m+"��"+s+"��");
	 }

}
