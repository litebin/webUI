package com.chouxiang;

public class Demo2 {
	public static void main(String[] args) {
		
	  Computer computer=new Computer();
	  Phone   phone=new Phone();
	  Camera  camera=new Camera();
	  computer.useUsb(camera);
	  computer.useUsb(phone);	 
	}
}
 
interface Usb{
	//������������
	//��ʼ����
	public void start();
	//ֹͣ����
	public void stop();
}
//��д������࣬��ʵ��usb�ӿ�
//һ����Ҫԭ�򣺵�һ����ʵ����һ���ӿڣ�
//��Ҫ����������ӿڵ����з�����ͳͳʵ��
class Camera implements Usb{ 
	public void start(){
		System.out.println("�����������ʼ������..");
	}
	public void stop(){
		System.out.println("���������ֹͣ������..");
	}
}
//��д�ֻ���
class Phone implements Usb{ 
	public void start(){
		System.out.println("�����ֻ�����ʼ������..");
	}
	public void stop(){
		System.out.println("�����ֻ���ֹͣ������..");
	}
}
//��д�������
class  Computer{
	public void useUsb(Usb usb){
		usb.start();
		usb.stop();
	}
}

