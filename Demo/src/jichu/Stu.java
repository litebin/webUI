package jichu;

public class Stu {
	int  age;
	String name;
	int fee;
	static int totalFee;
	public Stu(int age,String name,int fee){
		this.age=age;
		this.name=name;
	    totalFee+=fee;
	}
	//java中规则：类变量原则上用类方法去访问
   public static int getTotalFee(){
	   return totalFee;
   }
   public static void main(String[] args) {
	   Stu s1=new Stu(20,"zz",230);
	   Stu s2=new Stu(22,"bb",220);
	   System.out.println(Stu.getTotalFee());
	   
}
}
