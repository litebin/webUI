package day04;

import java.util.Scanner;

public class TestYear {
    public static void main(String[] args){
    	//�ӿ���̨����һ����ݣ�����2016���ж��Ƿ�����
    	//��ʾ�������year
    	Scanner sc=new Scanner(System.in);
    	System.out.println("��������ݣ�");
    	int year=sc.nextInt();
    	//�ж��Ƿ�����
    	//�ܱ�4���������ܱ�100�����������ܹ���400����
    	if((year%4==0&&year%100!=0)||year%400==0){
    		System.out.println(year+"������");
    	}else{
    		System.out.println(year+"��������");
    	}
    }
}
