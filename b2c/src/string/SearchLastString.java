package string;

public class SearchLastString {
   //str.lastIndexOf(Stringname)
//����������Hello���ַ�����λ��
	public static void main(String[] args) {
		  String strOrig="Hello world,Hello Reader";
		  int lastIndex=strOrig.lastIndexOf("Hello");
		  if(lastIndex == -1){
			  System.out.println("Hello not found");
		  }else{
			  System.out.println("Last occurrence of Hellow is at index" + lastIndex);
		  }
	}
}
