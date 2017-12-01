package string;

public class SearchLastString {
   //str.lastIndexOf(Stringname)
//查找最后出现Hello的字符串的位置
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
