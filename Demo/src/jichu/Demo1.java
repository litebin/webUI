package jichu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo1 {
  public static void main(String[] args) {
	  //输入流，从键盘接收数
	  InputStreamReader isr=new InputStreamReader(System.in);
	  //把数据读到缓存中
	  BufferedReader sn=new BufferedReader(isr);
	  //给出提示
	System.out.println("请输入第一个字符：");
	//读取一行数据
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
		System.out.println("星期一");
		break;
	case "b" :
		System.out.println("星期二");
		break;
	case "c" :
		System.out.println("星期三");
		break;
	case "d" :
		System.out.println("星期四");
		break;
	}
	
}
}
