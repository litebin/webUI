package date;

import java.text.SimpleDateFormat;
import java.util.Date;
//获取当前日期   Date类
public class DateFormat {
    public static void main(String[] args) {
		Date date=new Date();
		//定义字符串格式
		String strDateFormat="yyyy-MM-dd HH:mm:ss";
		//sdf是一种规则  转换成上面定义的这种规则
		SimpleDateFormat sdf=new SimpleDateFormat(strDateFormat);
		System.out.println(sdf.format(date));
	}
    
}
	