package string;

public class FindString {
	//indexOf()
	//重构选择需要替换的变量名字 Refactor--Rename
    public static void main(String[] args) {
    	  String strOrig="Hello world,Hello Reader";
		  int index=strOrig.indexOf("Hello");
		  if(index == -1){
			  System.out.println("Hello not found");
		  }else{
			  System.out.println("Last occurrence of Hellow is at index" + index);
		  }
	}
}
