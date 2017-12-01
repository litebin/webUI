package day03;

public class TestRandom {
	//写一个程序，TestRandomChar.java
	//生成一个随机大写英文字母    A~Z
	//思路    'A'+0  'A'  65
	//    'A'+1  'B'  66
	//    'A'+2  'C'  67
	//........
   public static void main(String[] args){
	   double d1=Math.random();  //[0-1]double
	   System.out.println(d1);
	   double d2=d1*26;   //[0-26] double
	   System.out.println(d2);
	   int n1=(int)d2;    //[0-25] int	   
	   System.out.println(n1);
	   char c1=(char)('A'+25);
	   char c2=(char)('A'+n1);
	   System.out.println(c1);
	   System.out.println(c2);
   }
}
