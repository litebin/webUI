package string;

public class DeleteChar {
//�ع�  :���ļ��������������� Refactor -Rename
	//subString() ɾ��ĳ���ַ����� �����������ɾ���ַ����е�һ���ַ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str ="Today is sunny day";
         System.out.println(removeCharAt(str, 6));
	}
  public static String removeCharAt(String s,int pos){
	  //s��Ҫɾ�����ַ����� pos��Ҫɾ���ַ�����λ�� 
	  //+ ��ƴ��
	  return s.substring(0, pos)+s.substring(pos+1);
  }
}
