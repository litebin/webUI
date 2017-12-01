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
		System.out.println("名字是："+this.name);
	}
}
//小学生类
class  Pupil extends Stu{
	public void pay(){
		this.fee=fee;
	}
}

//小学生类
class  MiddlStu extends Stu{
	public void pay(){
		this.fee=fee*0.8f;
	}
}

//小学生类
class  ColStu extends Stu{
	public void pay(){
		this.fee=fee*01f;
	}
}