package day04;

public class TestThree {
	//��Ŀ�����
   public static void main(String[] args){
	   int a=3;
	   int b=5;
	   int max=a>5?a:b;
	   System.out.println("max="+max);
	   //�ȼ���
	   if(a>b){
		   max=a;
	   }else{
		   max=b;
	   }
	   System.out.println("max="+max);
   }
}
