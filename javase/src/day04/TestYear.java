package day04;

import java.util.Scanner;

public class TestYear {
    public static void main(String[] args){
    	//从控制台输入一个年份，比如2016，判断是否闰年
    	//提示输入年份year
    	Scanner sc=new Scanner(System.in);
    	System.out.println("请输入年份：");
    	int year=sc.nextInt();
    	//判断是否闰年
    	//能被4整除但不能被100整除，或者能够被400整除
    	if((year%4==0&&year%100!=0)||year%400==0){
    		System.out.println(year+"是闰年");
    	}else{
    		System.out.println(year+"不是闰年");
    	}
    }
}
