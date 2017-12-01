package com.tezheng;

public class Demo2 {
         public static void main(String[] args) {
        	/* Cat  cat=new Cat();
        	 cat.cry();
        	 Dog dog=new Dog();
        	 dog.cry();*/
        	 //用到多态和方法重写，继承，封装
        	/* Animal an=new Cat();
        	 an.cry();
        	 an=new Dog();
        	 an.cry();*/
        	 Master master=new Master();
        	 master.feed(new Dog(),new Bone());
        	 master.feed(new Cat(),new Fish());
        	 

			
		}
}
//主人类
class Master{
	//给动物喂食物，使用多态方法就可以用一个
	//Animal既是猫又是狗 一个引用（类型）在不同情况下的多种状态
	public void feed(Animal an,Food f){
		an.eat();
		//f.showName();
	}
	
}
//假如要加多种食物的话，Food这个类不需要改动
class Food{
	String name;
	 public void showName(){
		 
	 }
}
//鱼类
class Fish extends Food{
	public void showName(){
	System.out.println("鱼");
	}
}
//骨头类
class Bone extends Food{
	public void showName(){
	System.out.println("骨头");
	}
}

class Animal{
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	int age;
	public void cry(){
		System.out.println("不知道怎么叫");
	}
	public void eat(){
		System.out.println("不知道吃什么");
	}
		
}

class Cat extends Animal{
	public void cry(){
		System.out.println("喵喵叫");
	}
	public void eat(){
		System.out.println("猫爱吃鱼");
	}
}

class Dog extends Animal{
	public void cry(){
		System.out.println("汪汪叫");
	}
	public void eat(){
		System.out.println("狗爱吃骨头");
	}
}

