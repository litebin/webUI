package day04;

import java.util.Scanner;

public class TestZhuanHuan {
	//创建扫描器sc，提示输入秒数scond 7199
	//将scond转化为h  m  s
	public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("请输入实际：");
    int second=sc.nextInt();
    int h=second/3600;
    int m=second%3600/60; //余数/60秒
    int s=second%3600%60;
    
    System.out.println("当前时间是："+h+"时"+m+"分"+s+"秒");
	}
}
