package date;

import java.text.SimpleDateFormat;

public class ConvertTimestamp {
	//��ȡʱ���  ��ʱ���  ת����  ���� 
    public static void main(String[] args) {
    	//��ȡʱ���
    	long timeStamp=System.currentTimeMillis();
    	//�������
    	SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
    	//ת��������  String.valueOf(timeStamp) ��timeStampת�����ַ�������
    	//Long.parseLong(String.valueOf(timeStamp))  �ٰ��ַ�������ת���� ������
    	//sdf.format(Long.parseLong(String.valueOf(timeStamp)))
    	//format������ת����� ��ʽ���ַ���
    	//String sd=sdf.format(Long.parseLong(String.valueOf(timeStamp)));
    	String sd=sdf.format(timeStamp);
    	System.out.println(sd);
    	//���ַ���ת��������
    	int a=Integer.parseInt("1234");
    	System.out.println(a);
    	
		
	}
}
