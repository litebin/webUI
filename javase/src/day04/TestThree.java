package day04;

public class TestThree {
	//三目运算符
   public static void main(String[] args){
	   int a=3;
	   int b=5;
	   int max=a>5?a:b;
	   System.out.println("max="+max);
	   //等价于
	   if(a>b){
		   max=a;
	   }else{
		   max=b;
	   }
	   System.out.println("max="+max);
   }
}
