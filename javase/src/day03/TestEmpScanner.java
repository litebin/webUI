package day03;

import java.util.Scanner;

public class TestEmpScanner {
     public static void main(String[] args){
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("������������");
    	 String name=sc.nextLine();
    	 System.out.println("������һ�����䣺");
    	 int age=sc.nextInt();
    	 System.out.println("������нˮ��");
    	 double salary=sc.nextDouble();
    	 System.out.println("������"+name+",���䣺"+age+",нˮ"+salary);
     }
}
