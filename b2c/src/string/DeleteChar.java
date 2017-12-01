package string;

public class DeleteChar {
//重构  :把文件名和类名重命名 Refactor -Rename
	//subString() 删除某个字符串； 用这个方法来删除字符串中的一个字符
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str ="Today is sunny day";
         System.out.println(removeCharAt(str, 6));
	}
  public static String removeCharAt(String s,int pos){
	  //s是要删除的字符串， pos是要删除字符串的位置 
	  //+ 是拼接
	  return s.substring(0, pos)+s.substring(pos+1);
  }
}
