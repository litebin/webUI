package date;

import java.util.Calendar;
import java.util.Date;

public class DateAdd {
	//Calendar��ȡ��ǰʱ��
    public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		cal.setTime(new Date());
		//������ȥ5��
		cal.roll(Calendar.DATE, -5);
		System.out.println(cal.get(Calendar.DATE));
		//�·ݼ���9
		cal.roll(Calendar.MONTH, 9);
		System.out.println(cal.get(Calendar.MONTH));
	}
}
