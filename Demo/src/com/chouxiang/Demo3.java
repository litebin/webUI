package com.chouxiang;

public class Demo3 {
	public static void main(String[] args) {
		
	}

}
interface Fish{
	public void swimming();
}
interface Bird{
	public void Fry();
}
class Monkey1{
	String name;
	//��
	public void jump(){
		System.out.println("����ϲ����");
	}
}
class LittleMonkey extends Monkey implements Fish,Bird {

	@Override
	public void swimming() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Fry() {
		// TODO Auto-generated method stub
		
	}
	
}