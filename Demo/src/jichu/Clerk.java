package jichu;

public class Clerk {
	public String name;
	private int age;
	private float salary;
public Clerk( String name,int age,float salary){
		this.age=age;
		this.name=name;
		this.salary=salary;
	}
   //通过一个成员方法去控制和访问私有的属性
    public float getSal(){
    	return this.salary;
    }
    public static void main(String[] args) {
    	Clerk clerk1=new Clerk("小米",23,8632.68f);
    	System.out.println("名字是："+clerk1.name+
    			"工资是："+clerk1.getSal());
    	
	}
   
    }
	


