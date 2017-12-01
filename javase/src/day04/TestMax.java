package day04;

public class TestMax {
    public static void main(String[] args){
      
    	int a=5;
    	int b=6;
    	//方法调用
    	int max=Max(a,b); //实参
    	System.out.println(max);
    }
    //方法声明
    public static int  Max(int a,int b){ //形参
    	//方法体
    	return a>b?a:b;
    }
}
    
