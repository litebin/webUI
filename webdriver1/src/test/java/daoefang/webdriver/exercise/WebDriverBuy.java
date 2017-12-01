package daoefang.webdriver.exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WebDriverBuy {
	@Test(description="测试登录")
	public void zuoyelogin(){
		System.setProperty("webdriver.firefox.bin","D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("http://localhost/index.php?m=user&c=public&a=login");
		 driver.findElement(By.name("username")).sendKeys("daoexuan");
		 driver.findElement(By.name("password")).sendKeys("daoexuan");
		 driver.findElement(By.xpath("//input[@value='登　录']")).click();
		 System.out.println("正在登录中");
	//
		 (new WebDriverWait(driver,10)).until(new ExpectedCondition<Boolean>(){
				public Boolean apply(WebDriver driver){
					return driver.getTitle().toLowerCase().startsWith("我的会员中心");
				}
			});
		 
		 driver.findElement(By.name("keyword")).sendKeys("iphone");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 (new WebDriverWait(driver,20)).until(new ExpectedCondition<Boolean>(){
				public Boolean apply(WebDriver driver){
					return driver.findElement(By.xpath("//a[text()='苹果 (Apple) iPhone 6 (A1586) 16GB 金色 移动联通电信4G手机']")).isDisplayed();
		}
			});
		
		 
		 driver.findElement(By.xpath("//a[text()='苹果 (Apple) iPhone 6 (A1586) 16GB 金色 移动联通电信4G手机']")).click();
		 (new WebDriverWait(driver,10)).until(new ExpectedCondition<Boolean>(){
				public Boolean apply(WebDriver driver){
					return driver.findElement(By.xpath("//div[@class='goods-pay-btn']//span[text()='加入购物车']")).isDisplayed();
		}
			});
		 driver.findElement(By.xpath("//div[@class='goods-pay-btn']//span[text()='加入购物车']")).click();
//	 (new WebDriverWait(driver,20)).until(new ExpectedCondition<Boolean>(){
//				public Boolean apply(WebDriver driver){
//					return driver.findElement(By.xpath("//div[@class='shopCar_T']//span[@class='shopCar_T_span3']")).isDisplayed();
//		}
//		});
		
	 driver.findElement(By.xpath("//div[@class='shopCar_T']//span[@class='shopCar_T_span3']")).click();
		 driver.findElement(By.xpath("//div[@class='shopCar_btn_02 fl']")).click();
		 driver.close();
		 driver.quit();
		 
	}

}
