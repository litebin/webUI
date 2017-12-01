package date;

import java.util.Calendar;

public class GetDate {
    public static void main(String[] args) {
    	//获取当前日期 Calendar类
		     Calendar cal=Calendar.getInstance();
		     int day =cal.get(Calendar.DATE);
		     System.out.println("今天是"+day+"号");
		     int month=cal.get(Calendar.MONTH)+1;
		     System.out.println("今天是："+month+"月");
		     int year=cal.get(Calendar.YEAR);
		     System.out.println("今天是："+year+"年份");
		     
		     
		     int dow=cal.get(Calendar.DAY_OF_WEEK);
		     System.out.println("今天是一周中的："+dow+"天");
		     int dom=cal.get(Calendar.DAY_OF_MONTH);
		     System.out.println("今天是一月中的："+dom+"天");
             int doy=cal.get(Calendar.DAY_OF_YEAR);
		     System.out.println("今天是一年中的："+doy+"天");

	}
}
