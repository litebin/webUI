package day02;
import java.util.Scanner;

public class TestScanner {
     public static void main(String[] args){
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("输入名字：");
    	 String name=sc.next();
    	 System.out.println("输入年龄：");
    	 int age=sc.nextInt();
    	 System.out.println("姓名是:"+name);
    	 System.out.println("年龄是:"+age);
     }
}
