package string;

public class FindString {
	//indexOf()
	//�ع�ѡ����Ҫ�滻�ı������� Refactor--Rename
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
