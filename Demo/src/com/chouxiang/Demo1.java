package com.chouxiang;

public class Demo1 {
        public static void main(String[] args) {
			
		}
}
//这就是一个抽象类
abstract class Animal{
	String name;
	int age;
	//动物会叫
	abstract	public void cry();
}
//当一个类继承的父类是抽象类的话，
//需要我们把抽象类中的所有抽象方法全部实现
class Cat extends Animal{
	//实现父类cry
	 public void cry(){
		 System.out.println("猫猫叫..");
	 }
}
