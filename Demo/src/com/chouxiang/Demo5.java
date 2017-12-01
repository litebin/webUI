package com.chouxiang;
/*
 * .渔夫出海大鱼，收获若干
 * 1.渔夫卖掉一半的鱼，然后送给邻居的海伦3条。 
 * 2.渔夫又卖掉剩下的鱼的3分之2 自己又吃了一条 
 * 3.海伦来看渔夫，问他那天打了多少鱼，渔夫数了数，家里还剩下4条，渔夫对海伦怎么说呢？
 */
public class Demo5 {
    public static void main(String[] args) {
    	int total;
    	int rest=4;
    	 total=((rest+1)*3+3)*2;
    	 System.out.println("总共多少鱼:"+total);
	}
   
}
