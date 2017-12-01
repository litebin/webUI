package com.chouxiang;

public class Demo4 {
   public static void main(String[] args) {
	   CarShop aShop=new CarShop();
	   //卖出一辆宝马
	   aShop.SellCar(new BMW());
	   //卖出一辆奇瑞QQ
	   aShop.SellCar(new CheryQQ());
	   System.out.println("总收入："+aShop.getMoney());
	
}
}
interface Car{
	//汽车名字
	String getName();
	//汽车售价
	int getPrice();
}
//宝马
class  BMW implements Car{

	@Override
	public String getName() {
		
		return "BMW";
	}

	@Override
	public int getPrice() {
		
		return 300000;
	}
	
}
//奇瑞QQ
class CheryQQ implements Car{

	@Override
	public String getName() {
		
		return "CheryQQ";
	}

	@Override
	public int getPrice() {
		
		return 28000;
	}
	
}
//汽车出售店
 class CarShop{
	//售车收入
	private int money=0;
	//卖出一部车    后期绑定
	public void SellCar(Car car){
		System.out.println("车型："+car.getName()+"单价："+car.getPrice());
	//增加卖出车售价的收入
		money+=car.getPrice();
	}
	//售车总收入
	public int getMoney(){
		return money;
	}
}
 /*继承是多态得以实现的基础。  多态就是一种类型表现出多种状态
  * 多态就是在后期绑定这种机制上实现的。多态给我们带来好处是消除了类之间的耦合关系，使程序更容易扩展。
  * 比如在例子中，新增加一种类型汽车的销售，只需要让新定义的类继承Car类并实现它的所有方法
  * 而无需对原有代码做任何修改，CarShop类的SellCar(Car car)方法就可以处理新的车型了
  * 新增代码如下：
  */
 //桑塔纳汽车
 class Santana implements Car{

	@Override
	public String getName() {
		
		return "Santana";
	}

	@Override
	public int getPrice() {
		
		return 80000;
	}
	 
 }
  

