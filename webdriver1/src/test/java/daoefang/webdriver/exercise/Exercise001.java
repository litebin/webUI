package daoefang.webdriver.exercise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Exercise001 {

	@Test(description = "验证商品购买的功能")
	public void exercise001(){
		
		
		// 初始化并打开浏览器
		System.setProperty("webdriver.firefox.bin",
				"D:/Program Files (x86)/Mozilla Firefox/firefox.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://localhost");
		
		
		//登录
		driver.findElement(By.linkText("登录")).click();
		driver.close();
		for(String handle:driver.getWindowHandles()){
		  driver.switchTo().window(handle);
		}
		
		(new WebDriverWait(driver,10)).until(new ExpectedCondition<Boolean>(){
			public Boolean apply(WebDriver driver){
				return driver.getTitle().toLowerCase().startsWith("用户登录");
			}
		});
		
		driver.findElement(By.xpath("//h3[text() = '欢迎登录道e坊商城']"));
		driver.findElement(By.id("username")).sendKeys("daoexuan");
		WebElement element = driver.findElement(By.id("password"));
		element.sendKeys("daoexuan");
		driver.findElement(By.xpath("//input[@value='登　录']")).click(); 
		
		(new WebDriverWait(driver,10)).until(new ExpectedCondition<Boolean>(){
			public Boolean apply(WebDriver driver){
				return driver.getTitle().toLowerCase().startsWith("我的会员中心");
			}
		});
		
		driver.findElement(By.linkText("进入商城购物"));
		
		//搜索
		driver.findElement(By.name("keyword")).sendKeys("iPhone");
		driver.findElement(By.className("btn1")).click(); 
		
		driver.findElement(By.xpath("//div/p/a[text()='苹果 (Apple) iPhone 6 (A1586) 16GB 金色 移动联通电信4G手机']")).click(); 
		
		driver.close();
		for(String handle:driver.getWindowHandles()){
		  driver.switchTo().window(handle);
		}
		
//		(new WebDriverWait(driver,10)).until(new ExpectedCondition<Boolean>(){
//			public Boolean apply(WebDriver driver){
//				return driver.getTitle().toLowerCase().startsWith("苹果 (Apple) iPhone 6");
//			}
//		});
		
		(new WebDriverWait(driver,10)).until(new ExpectedCondition<Boolean>(){
			public Boolean apply(WebDriver driver){
				return driver.findElement(By.xpath("//div/div/span[text() = '苹果 (Apple) iPhone 6 (A1586) 16GB 金色 移动联通电信4G手机']")).isDisplayed();
			}
		});
		
//		driver.findElement(By.xpath("//div/div/span[text() = '苹果 (Apple) iPhone 6 (A1586) 16GB 金色 移动联通电信4G手机']"));
		
		//加入购物车
		driver.findElement(By.id("joinCarButton")).click(); 
		
		(new WebDriverWait(driver,10)).until(new ExpectedCondition<Boolean>(){
			public Boolean apply(WebDriver driver){
				return driver.findElement(By.className("shopCar_T_span3")).isDisplayed();
			}
		});
		
		driver.findElement(By.xpath("//div/div/div/span[text() = '商品已成功加入购物车']"));
		driver.findElement(By.className("shopCar_T_span3")).click(); 
		driver.findElement(By.linkText("结算"));
		
		//清空购物车
		driver.findElement(By.xpath("//div/div[@class = 'shopCar_btn_02 fl']")).click(); 
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		(new WebDriverWait(driver,10)).until(new ExpectedCondition<Boolean>(){
			public Boolean apply(WebDriver driver){
				return driver.findElement(By.className("shopCar_content_01")).isDisplayed();
			}
		});
		
		driver.findElement(By.xpath("//div[text()='你的购物车还是空的,赶紧行动吧！']"));
		
		//结束
		driver.close();
		driver.quit();
		
	}
	
	
}
