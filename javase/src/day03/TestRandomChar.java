package day03;

public class TestRandomChar {
	//����һ�������дӢ����ĸ    A~Z
  public static void main(String[] args){
	  //1.�����������num  [0-25]
	  int num=(int)(Math.random()*26); 
	  //2.��������ַ�
	  System.out.println(num);
	  char randomChar1=(char)('A'+0);
	  char randomChar2=(char)('A'+num);
	  char randomChar3=(char)('A'+25);
	  //3.��ӡ���
	  System.out.println(randomChar1);
	  System.out.println(randomChar2);
	  System.out.println(randomChar3);
  }
}
