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
   //ͨ��һ����Ա����ȥ���ƺͷ���˽�е�����
    public float getSal(){
    	return this.salary;
    }
    public static void main(String[] args) {
    	Clerk clerk1=new Clerk("С��",23,8632.68f);
    	System.out.println("�����ǣ�"+clerk1.name+
    			"�����ǣ�"+clerk1.getSal());
    	
	}
   
    }
	


