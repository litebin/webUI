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
	   //stu1��stu3ָ��ͬһ�������κ�һ�����ö����Ե��øö���
	   Student stu3=stu1;
	   stu3.name="TomCat";
	   stu1.study("Web");
	   //Jamesѧ�������Ϊϵͳ����
	   stu2=null;
	   //��ָ���쳣  java.lang.NullPointerException
	   //��������ʱ�쳣
	   //stu2.name="Mary";
	   //stu2.study("Web");
   }
}
