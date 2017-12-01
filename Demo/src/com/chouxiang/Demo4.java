package com.chouxiang;

public class Demo4 {
   public static void main(String[] args) {
	   CarShop aShop=new CarShop();
	   //����һ������
	   aShop.SellCar(new BMW());
	   //����һ������QQ
	   aShop.SellCar(new CheryQQ());
	   System.out.println("�����룺"+aShop.getMoney());
	
}
}
interface Car{
	//��������
	String getName();
	//�����ۼ�
	int getPrice();
}
//����
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
//����QQ
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
//�������۵�
 class CarShop{
	//�۳�����
	private int money=0;
	//����һ����    ���ڰ�
	public void SellCar(Car car){
		System.out.println("���ͣ�"+car.getName()+"���ۣ�"+car.getPrice());
	//�����������ۼ۵�����
		money+=car.getPrice();
	}
	//�۳�������
	public int getMoney(){
		return money;
	}
}
 /*�̳��Ƕ�̬����ʵ�ֵĻ�����  ��̬����һ�����ͱ��ֳ�����״̬
  * ��̬�����ں��ڰ����ֻ�����ʵ�ֵġ���̬�����Ǵ����ô�����������֮�����Ϲ�ϵ��ʹ�����������չ��
  * �����������У�������һ���������������ۣ�ֻ��Ҫ���¶������̳�Car�ಢʵ���������з���
  * �������ԭ�д������κ��޸ģ�CarShop���SellCar(Car car)�����Ϳ��Դ����µĳ�����
  * �����������£�
  */
 //ɣ��������
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
  

