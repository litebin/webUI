package string;

public class StringReplacement {
	//repalce �ַ����滻
        public static void main(String[] args) {
        	String str="Hellow Hellow world";
        	System.out.println(str.replace("H", "W")); 
        	//�滻�������ַ�
        	System.out.println(str.replaceFirst("He", "Wa"));
        	//�滻��һ��He
            System.out.println(str.replaceAll("He|wo", "Wa"));
            //�滻���е�He |������ʽ woҲ��Ҫ�滻 Wa

 
			
		}
}
