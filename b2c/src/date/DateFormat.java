package date;

import java.text.SimpleDateFormat;
import java.util.Date;
//��ȡ��ǰ����   Date��
public class DateFormat {
    public static void main(String[] args) {
		Date date=new Date();
		//�����ַ�����ʽ
		String strDateFormat="yyyy-MM-dd HH:mm:ss";
		//sdf��һ�ֹ���  ת�������涨������ֹ���
		SimpleDateFormat sdf=new SimpleDateFormat(strDateFormat);
		System.out.println(sdf.format(date));
	}
    
}
	