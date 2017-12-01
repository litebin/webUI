package day02;

public class TestCompare {
   public static void main(String[] args){
	   //求出两个整数最大值，再和第三个数比
	   int a=5;
	   int b=7;
	   int c=8;
	   int max=(a>b?a:b)>c?(a>b?a:b):c;
	   System.out.println(max);
   }
} 
