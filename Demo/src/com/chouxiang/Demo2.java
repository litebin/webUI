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
	//声明两个方法
	//开始工作
	public void start();
	//停止工作
	public void stop();
}
//编写照相机类，并实现usb接口
//一个重要原则：当一个类实现了一个接口，
//就要求该类把这个接口的所有方法，统统实现
class Camera implements Usb{ 
	public void start(){
		System.out.println("我是相机，开始工作了..");
	}
	public void stop(){
		System.out.println("我是相机，停止工作了..");
	}
}
//编写手机类
class Phone implements Usb{ 
	public void start(){
		System.out.println("我是手机，开始工作了..");
	}
	public void stop(){
		System.out.println("我是手机，停止工作了..");
	}
}
//编写计算机类
class  Computer{
	public void useUsb(Usb usb){
		usb.start();
		usb.stop();
	}
}

