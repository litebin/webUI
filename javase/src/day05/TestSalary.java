package day05;

import java.util.Scanner;

public class TestSalary {
      public static void main(String[] args){
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("�����빤�ʣ�");
    	  double salary=sc.nextDouble();
//    	  if(salary>3000.0){
//    		  System.out.println("�޴˲���");
//    		  return ;
//    	  }
    	  if(salary>10000){
    		  System.out.println("�ɻ���");
    		 }else if(salary>=8000){
    			 System.out.println("������");
    		 }else if(salary>=6000){
    			 System.out.println("������");
    		 }else if(salary>=5000){
    			 System.out.println("���г���");
    		 }else if(salary>=4000){
    			 System.out.println("������");
    			  }else{
    				  System.out.println("լ��");
    			  }
    	  
      }
}
