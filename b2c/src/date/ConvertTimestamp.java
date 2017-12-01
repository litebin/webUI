package date;

import java.text.SimpleDateFormat;

public class ConvertTimestamp {
	//获取时间戳  把时间戳  转换成  日期 
    public static void main(String[] args) {
    	//获取时间戳
    	long timeStamp=System.currentTimeMillis();
    	//定义规则
    	SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
    	//转换成日期  String.valueOf(timeStamp) 把timeStamp转换成字符串类型
    	//Long.parseLong(String.valueOf(timeStamp))  再把字符串类型转换成 长整形
    	//sdf.format(Long.parseLong(String.valueOf(timeStamp)))
    	//format长整形转换完后 格式化字符串
    	//String sd=sdf.format(Long.parseLong(String.valueOf(timeStamp)));
    	String sd=sdf.format(timeStamp);
    	System.out.println(sd);
    	//把字符串转换成整型
    	int a=Integer.parseInt("1234");
    	System.out.println(a);
    	
		
	}
}
