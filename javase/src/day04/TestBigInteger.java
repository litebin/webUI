package day04;

import java.math.BigInteger;

public class TestBigInteger {
   public static void main(String[] args){
	   BigInteger n1=new BigInteger("9");
	   //9��99�η����ݣ�
	   BigInteger n2=n1.pow(99);
	   System.out.println(n2);
	   System.out.println(Integer.MAX_VALUE);
   }
}
