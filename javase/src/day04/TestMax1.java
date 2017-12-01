package day04;

public class TestMax1 {
   public static void main(String[] args){
	   //求出两个整数最大值，再和第三个c比较
	   int a=3,b=7,c=5;
		int max=(a>b?a:b)>c?(a>b?a:b):c;
		System.out.println(max);
   }
  
}
