package day04;
import day03.Student;
public class TestTypeChange {
    public static void main(String[] args){
    	//�Զ�����ת��
    	//1.�����ڱ�����Χ���ܹ��Զ�ת��
    	 byte b1=123;  //int  --��byte  [-128,127]
    	 char c1=65;   //int  -->char [0,65535]
    	 char c2='A'+1;
    	 System.out.println(b1);
    	 System.out.println(c1);
    	 System.out.println(c2);
    	 //2.��ΧС���Զ���Χ���ת��
    	 int n1='A';
    	 double d1=123;
    	 System.out.println(n1);
    	 System.out.println(d1);
    	 //3.�������������ܹ��Զ�ת��Ϊ����
    	 Student   stu1=new  Student();
          Object obj=stu1;   //Student  --> Object
         //4.�������Ϳ��ԺͰ�װ����֮�以��ת��
         // int ---->java.long.Integer
        // ��������              ��װ����
       // byte       Byte       
       // short     Short         
       // int       Integer 
       //long        Long    
       // char       character      
       // float      Float        
       // double     Double         
        // boolean   Boolean          
         int i1=123;
         Integer in1=i1;  //int  -->Integer �Զ�����
         int  i2=in1;     //Integer  -->int �Զ�����
         //5.ǿ������ת��
          byte b2=(byte)128;
          System.out.println(b2);
          byte b3=(byte)256;
          System.out.println(b3);
          
          
    }
} 
