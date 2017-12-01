package review.homework;

import java.util.Scanner;

public class TestLeapYear {
    public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("请输入年份：");
		 int year=sc.nextInt();
		 boolean b1=TestLeapYear.isLeapYear(year);
		 if(b1){
			 System.out.println("是闰年");
		 }else{
			 System.out.println("不是闰年");
		 }
	}
    /* 判断是否是闰年
     * @param year 待判断的年份
     * @return  ture 是闰年/false 不是闰年
     * */
	public static boolean isLeapYear(int year){
		if((year%4==0 && year%100==0)||(year%400==0)){
			return true;
		}else{
			return false;
		}
	}

	}

