package day04;

public class TestMax {
    public static void main(String[] args){
      
    	int a=5;
    	int b=6;
    	//��������
    	int max=Max(a,b); //ʵ��
    	System.out.println(max);
    }
    //��������
    public static int  Max(int a,int b){ //�β�
    	//������
    	return a>b?a:b;
    }
}
    
