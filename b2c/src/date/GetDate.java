package date;

import java.util.Calendar;

public class GetDate {
    public static void main(String[] args) {
    	//��ȡ��ǰ���� Calendar��
		     Calendar cal=Calendar.getInstance();
		     int day =cal.get(Calendar.DATE);
		     System.out.println("������"+day+"��");
		     int month=cal.get(Calendar.MONTH)+1;
		     System.out.println("�����ǣ�"+month+"��");
		     int year=cal.get(Calendar.YEAR);
		     System.out.println("�����ǣ�"+year+"���");
		     
		     
		     int dow=cal.get(Calendar.DAY_OF_WEEK);
		     System.out.println("������һ���еģ�"+dow+"��");
		     int dom=cal.get(Calendar.DAY_OF_MONTH);
		     System.out.println("������һ���еģ�"+dom+"��");
             int doy=cal.get(Calendar.DAY_OF_YEAR);
		     System.out.println("������һ���еģ�"+doy+"��");

	}
}
