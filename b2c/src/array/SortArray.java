package array;

import java.util.Arrays;
/*Arrays.sort(array);
 * 方法用于对象数组按用户自定义规则排序
 * */


public class SortArray {
     public static void main(String[] args) {
		int array[]={2,5,-2,6,-3,8,0,7,9,4};
		//int[] array1={2,5,-2,6,-3,8,0,7,9,4};
		//像这个定义数组也是可以的 
		Arrays.sort(array);
		printArray("数组排序结果为",array);
		
	}
     //protected  受保护的
     //static 静态方法  可以自己使用  不需要对这个类进行实例化  
     //Arrays. 后的所有方法可以直接使用
    /* 
     private static void printArray(String message,int array[]){
    	 System.out.println(message+":[lenth:"+array.length+"]");
    	 for(int i=0;i<array.length;i++){
    		 if(i!=0){
    			 System.out.print(",");
    		 }
    			 System.out.print(array[i]);
    		 }
    		 System.out.println();  
    		 */
    		 //foreach  Java 增强型的for循环 for each
    		 private static void printArray(String message,int array[]){
    	    	 System.out.println(message+":[lenth:"+array.length+"]");
    	    	 for(int element:array){
    	    		
    	    			 System.out.print(",");    	    		
    	    			 System.out.print(element);
    	    		 }
    	    		 System.out.println();
    	 
    	 
     }
}
