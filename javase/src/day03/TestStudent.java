package day03;

public class TestStudent {
   public static void main(String[] args){
	   Student stu1=new Student();
	   stu1.name="Tom";
	   stu1.age=23;
	   stu1.study("JavaSE");
	   Student stu2=new Student();
	   stu2.name="James";
	   stu2.age=25;
	   stu2.study("oracle");
	   //stu1和stu3指向同一个对象，任何一个引用都可以调用该对象
	   Student stu3=stu1;
	   stu3.name="TomCat";
	   stu1.study("Web");
	   //James学生对象称为系统垃圾
	   stu2=null;
	   //空指针异常  java.lang.NullPointerException
	   //属于运行时异常
	   //stu2.name="Mary";
	   //stu2.study("Web");
   }
}
