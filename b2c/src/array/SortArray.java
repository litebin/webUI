package array;

import java.util.Arrays;
/*Arrays.sort(array);
 * �������ڶ������鰴�û��Զ����������
 * */


public class SortArray {
     public static void main(String[] args) {
		int array[]={2,5,-2,6,-3,8,0,7,9,4};
		//int[] array1={2,5,-2,6,-3,8,0,7,9,4};
		//�������������Ҳ�ǿ��Ե� 
		Arrays.sort(array);
		printArray("����������Ϊ",array);
		
	}
     //protected  �ܱ�����
     //static ��̬����  �����Լ�ʹ��  ����Ҫ����������ʵ����  
     //Arrays. ������з�������ֱ��ʹ��
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
    		 //foreach  Java ��ǿ�͵�forѭ�� for each
    		 private static void printArray(String message,int array[]){
    	    	 System.out.println(message+":[lenth:"+array.length+"]");
    	    	 for(int element:array){
    	    		
    	    			 System.out.print(",");    	    		
    	    			 System.out.print(element);
    	    		 }
    	    		 System.out.println();
    	 
    	 
     }
}
