package day04;

import java.util.Scanner;

public class TestZhuanHuan {
	//����ɨ����sc����ʾ��������scond 7199
	//��scondת��Ϊh  m  s
	public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("������ʵ�ʣ�");
    int second=sc.nextInt();
    int h=second/3600;
    int m=second%3600/60; //����/60��
    int s=second%3600%60;
    
    System.out.println("��ǰʱ���ǣ�"+h+"ʱ"+m+"��"+s+"��");
	}
}