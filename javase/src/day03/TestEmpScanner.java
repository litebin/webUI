package day03;

import java.util.Scanner;

public class TestEmpScanner {
     public static void main(String[] args){
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("请输入姓名：");
    	 String name=sc.nextLine();
    	 System.out.println("请输入一个年龄：");
    	 int age=sc.nextInt();
    	 System.out.println("请输入薪水：");
    	 double salary=sc.nextDouble();
    	 System.out.println("姓名："+name+",年龄："+age+",薪水"+salary);
     }
}
