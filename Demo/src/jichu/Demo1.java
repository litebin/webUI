package jichu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo1 {
  public static void main(String[] args) {
	  //���������Ӽ��̽�����
	  InputStreamReader isr=new InputStreamReader(System.in);
	  //�����ݶ���������
	  BufferedReader sn=new BufferedReader(isr);
	  //������ʾ
	System.out.println("�������һ���ַ���");
	//��ȡһ������
	try {
		String xq=sn.readLine();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		sn.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	switch("xq"){
	case "a" :
		System.out.println("����һ");
		break;
	case "b" :
		System.out.println("���ڶ�");
		break;
	case "c" :
		System.out.println("������");
		break;
	case "d" :
		System.out.println("������");
		break;
	}
	
}
}
