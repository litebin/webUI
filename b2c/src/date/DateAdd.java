package date;

import java.util.Calendar;
import java.util.Date;

public class DateAdd {
	//Calendar获取当前时间
    public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		cal.setTime(new Date());
		//天数减去5天
		cal.roll(Calendar.DATE, -5);
		System.out.println(cal.get(Calendar.DATE));
		//月份加上9
		cal.roll(Calendar.MONTH, 9);
		System.out.println(cal.get(Calendar.MONTH));
	}
}
