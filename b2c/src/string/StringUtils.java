package string;

public class StringUtils {
	
	//String Compare example
	//compare(string)
	//compareTolgnoreCase(string)
	//compareTo(Object string)
	//ASCII
	//objStr.toString()将这个对象转换成字符串
	//比较两个字符串
        public static void main(String[] args) {
			String str="Hello World";
			String another="hello world";
			Object objStr=str;
			System.out.println(str.compareTo(another)); //H-h 72-104=-32
			System.out.println(str.compareToIgnoreCase(another)); //忽略大小学
			System.out.println(str.compareTo(objStr.toString()));
		}
}
