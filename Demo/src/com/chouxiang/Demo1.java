package com.chouxiang;

public class Demo1 {
        public static void main(String[] args) {
			
		}
}
//�����һ��������
abstract class Animal{
	String name;
	int age;
	//������
	abstract	public void cry();
}
//��һ����̳еĸ����ǳ�����Ļ���
//��Ҫ���ǰѳ������е����г��󷽷�ȫ��ʵ��
class Cat extends Animal{
	//ʵ�ָ���cry
	 public void cry(){
		 System.out.println("èè��..");
	 }
}
