package review.homework;

import java.util.Scanner;

public class TestLeapYear {
    public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("��������ݣ�");
		 int year=sc.nextInt();
		 boolean b1=TestLeapYear.isLeapYear(year);
		 if(b1){
			 System.out.println("������");
		 }else{
			 System.out.println("��������");
		 }
	}
    /* �ж��Ƿ�������
     * @param year ���жϵ����
     * @return  ture ������/false ��������
     * */
	public static boolean isLeapYear(int year){
		if((year%4==0 && year%100==0)||(year%400==0)){
			return true;
		}else{
			return false;
		}
	}

	}

