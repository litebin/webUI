package string;

public class StringUtils {
	
	//String Compare example
	//compare(string)
	//compareTolgnoreCase(string)
	//compareTo(Object string)
	//ASCII
	//objStr.toString()���������ת�����ַ���
	//�Ƚ������ַ���
        public static void main(String[] args) {
			String str="Hello World";
			String another="hello world";
			Object objStr=str;
			System.out.println(str.compareTo(another)); //H-h 72-104=-32
			System.out.println(str.compareToIgnoreCase(another)); //���Դ�Сѧ
			System.out.println(str.compareTo(objStr.toString()));
		}
}
