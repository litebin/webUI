package day02;

import java.util.Scanner;

public class TestTime {
	 public static void main(String[] args){
		 //求出7099秒等于多少x时x分x秒
		 Scanner sc =new Scanner(System.in);
		 System.out.println("请输入秒数：");
		 int second=sc.nextInt();
		 int h=second/3600; 
		 int m=second%3600/60;
		 int s= second%3600%60;
		 System.out.println(h+"时"+m+"分"+s+"秒");
	 }

}
