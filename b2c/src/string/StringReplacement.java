package string;

public class StringReplacement {
	//repalce 字符串替换
        public static void main(String[] args) {
        	String str="Hellow Hellow world";
        	System.out.println(str.replace("H", "W")); 
        	//替换正常的字符
        	System.out.println(str.replaceFirst("He", "Wa"));
        	//替换第一个He
            System.out.println(str.replaceAll("He|wo", "Wa"));
            //替换所有的He |正则表达式 wo也需要替换 Wa

 
			
		}
}
