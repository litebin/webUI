package com.tezheng;

public class Demo2 {
         public static void main(String[] args) {
        	/* Cat  cat=new Cat();
        	 cat.cry();
        	 Dog dog=new Dog();
        	 dog.cry();*/
        	 //�õ���̬�ͷ�����д���̳У���װ
        	/* Animal an=new Cat();
        	 an.cry();
        	 an=new Dog();
        	 an.cry();*/
        	 Master master=new Master();
        	 master.feed(new Dog(),new Bone());
        	 master.feed(new Cat(),new Fish());
        	 

			
		}
}
//������
class Master{
	//������ιʳ�ʹ�ö�̬�����Ϳ�����һ��
	//Animal����è���ǹ� һ�����ã����ͣ��ڲ�ͬ����µĶ���״̬
	public void feed(Animal an,Food f){
		an.eat();
		//f.showName();
	}
	
}
//����Ҫ�Ӷ���ʳ��Ļ���Food����಻��Ҫ�Ķ�
class Food{
	String name;
	 public void showName(){
		 
	 }
}
//����
class Fish extends Food{
	public void showName(){
	System.out.println("��");
	}
}
//��ͷ��
class Bone extends Food{
	public void showName(){
	System.out.println("��ͷ");
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
		System.out.println("��֪����ô��");
	}
	public void eat(){
		System.out.println("��֪����ʲô");
	}
		
}

class Cat extends Animal{
	public void cry(){
		System.out.println("������");
	}
	public void eat(){
		System.out.println("è������");
	}
}

class Dog extends Animal{
	public void cry(){
		System.out.println("������");
	}
	public void eat(){
		System.out.println("�����Թ�ͷ");
	}
}

