package com.chouxiang;

import java.util.Scanner;
/*一只猴子摘了一堆桃子，它每天吃了其中的一半然后再多吃了一个，直到第10天，它发现只有1个桃子了，问它第一天摘了多少个桃子？
 * */
public class Monkey {
	public static void main(String[] args) {
		Monkey.peach(1, 20);
		Monkey.scan();
	}
	//day表示想得到哪天的桃子数，aday表示吃了多少天剩下一个
	public static int peach(int day,int sday){
		if(day==sday){
			return 1;
		}else{
			return (peach(day+1,sday)+1)*2;
		}
	}
	public static void scan(){
		System.out.println("请输入两个数");
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a<b){
			System.out.println(Monkey.peach(a, b));
		}else{
			System.out.println("第一个数要小于等于第二个数");
			Monkey.scan();
		}
	}
	}



