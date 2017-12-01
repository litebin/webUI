package jichu;
/*
 * 静态变量的理解
 * 
 **/
public class Demo3 {
	static int i=1;
	static {
		System.out.println("a");
		i++;
		}
	public Demo3(){
		System.out.println("b");
		i++;
	}
	public static void main(String[] args) {
		Demo3  t1=new Demo3();
		System.out.println(t1.i);
		Demo3  t2=new Demo3();
		System.out.println(t2.i);
	}

}
