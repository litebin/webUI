package com.chouxiang;

import java.util.Scanner;
/*һֻ����ժ��һ�����ӣ���ÿ��������е�һ��Ȼ���ٶ����һ����ֱ����10�죬������ֻ��1�������ˣ�������һ��ժ�˶��ٸ����ӣ�
 * */
public class Monkey {
	public static void main(String[] args) {
		Monkey.peach(1, 20);
		Monkey.scan();
	}
	//day��ʾ��õ��������������aday��ʾ���˶�����ʣ��һ��
	public static int peach(int day,int sday){
		if(day==sday){
			return 1;
		}else{
			return (peach(day+1,sday)+1)*2;
		}
	}
	public static void scan(){
		System.out.println("������������");
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a<b){
			System.out.println(Monkey.peach(a, b));
		}else{
			System.out.println("��һ����ҪС�ڵ��ڵڶ�����");
			Monkey.scan();
		}
	}
	}



