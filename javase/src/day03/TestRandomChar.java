package day03;

public class TestRandomChar {
	//生成一个随机大写英文字母    A~Z
  public static void main(String[] args){
	  //1.生成随机整数num  [0-25]
	  int num=(int)(Math.random()*26); 
	  //2.生成随机字符
	  System.out.println(num);
	  char randomChar1=(char)('A'+0);
	  char randomChar2=(char)('A'+num);
	  char randomChar3=(char)('A'+25);
	  //3.打印输出
	  System.out.println(randomChar1);
	  System.out.println(randomChar2);
	  System.out.println(randomChar3);
  }
}
