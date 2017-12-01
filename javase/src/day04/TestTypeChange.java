package day04;
import day03.Student;
public class TestTypeChange {
    public static void main(String[] args){
    	//自动类型转换
    	//1.常数在表数范围内能够自动转型
    	 byte b1=123;  //int  --》byte  [-128,127]
    	 char c1=65;   //int  -->char [0,65535]
    	 char c2='A'+1;
    	 System.out.println(b1);
    	 System.out.println(c1);
    	 System.out.println(c2);
    	 //2.范围小的自动向范围大的转型
    	 int n1='A';
    	 double d1=123;
    	 System.out.println(n1);
    	 System.out.println(d1);
    	 //3.引用类型子类能够自动转化为父类
    	 Student   stu1=new  Student();
          Object obj=stu1;   //Student  --> Object
         //4.基本类型可以和包装类型之间互相转换
         // int ---->java.long.Integer
        // 基本类型              包装类型
       // byte       Byte       
       // short     Short         
       // int       Integer 
       //long        Long    
       // char       character      
       // float      Float        
       // double     Double         
        // boolean   Boolean          
         int i1=123;
         Integer in1=i1;  //int  -->Integer 自动封箱
         int  i2=in1;     //Integer  -->int 自动拆箱
         //5.强制类型转换
          byte b2=(byte)128;
          System.out.println(b2);
          byte b3=(byte)256;
          System.out.println(b3);
          
          
    }
} 
