package day05;

import java.util.Scanner;

public class TestSalary {
      public static void main(String[] args){
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("请输入工资：");
    	  double salary=sc.nextDouble();
//    	  if(salary>3000.0){
//    		  System.out.println("无此操作");
//    		  return ;
//    	  }
    	  if(salary>10000){
    		  System.out.println("飞机男");
    		 }else if(salary>=8000){
    			 System.out.println("高铁男");
    		 }else if(salary>=6000){
    			 System.out.println("汽车男");
    		 }else if(salary>=5000){
    			 System.out.println("自行车男");
    		 }else if(salary>=4000){
    			 System.out.println("步行男");
    			  }else{
    				  System.out.println("宅男");
    			  }
    	  
      }
}
