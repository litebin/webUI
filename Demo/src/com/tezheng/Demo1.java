package com.tezheng;

public class Demo1 {
	public static void main(String[] args) {
		Pupil p1=new Pupil();
		p1.printname();
	}

}




class Stu{
	public int age;
	public String name;
	public float fee;
	public void printname(){
		System.out.println("�����ǣ�"+this.name);
	}
}
//Сѧ����
class  Pupil extends Stu{
	public void pay(){
		this.fee=fee;
	}
}

//Сѧ����
class  MiddlStu extends Stu{
	public void pay(){
		this.fee=fee*0.8f;
	}
}

//Сѧ����
class  ColStu extends Stu{
	public void pay(){
		this.fee=fee*01f;
	}
}