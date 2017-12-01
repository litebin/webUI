package daoefang.webdriver.exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SelectionsExe {

	WebDriver driver=null;
	@BeforeClass
	public void login(){
		driver=new FirefoxDriver();
		driver.get("http://localhost:888/index.php?&m=admin&c=public&a=login");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("userpass")).sendKeys("password");
		driver.findElement(By.name("userverify")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("页面标题是：" + driver.getTitle());
		//等待页面加载完成
		(new WebDriverWait(driver,10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver){
				return driver.getTitle().toLowerCase().startsWith("后台管理中心");
			}
		});
	}
	
	@Test(description="测试查询所有银牌会员的方法")
	public void selectionsExe(){
		driver.findElement(By.linkText("会员管理")).click();
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver){
				return driver.findElement(By.linkText("添加会员")).isDisplayed();
			}
		});
		driver.switchTo().frame(driver.findElement(By.id("mainFrame")));
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.xpath("//a[@id='search']")).isDisplayed();
			}
		});
		//选择银牌会员，首先需要鼠标单击textbox，再选择银牌会员。即首先触发鼠标移动并左键单击事件
		(new Actions(driver)).moveToElement(driver.findElement
				(By.xpath("//span/input[@type='text']"))).click().build().perform();
		(new Actions(driver)).moveToElement(driver.findElement(By.xpath("//div/div/div[text()='银牌会员']"))).click()
			.build().perform();
		//driver.findElement(By.xpath("//span[@class='textbox']/input[@type='text']")).sendKeys("121212");
		driver.findElement(By.xpath("//a[@id='search']")).click();
	
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				Boolean ret=true;
				List<WebElement> elements=driver.findElements(By.xpath("//tr/td[@field='group_id']/div[text()='银牌会员']"));
				for(WebElement e:elements){
					String s=e.getText();
					if(e.equals("银牌会员")){
						ret=false;
						System.out.println(s);
					}
				}
				return ret;
			}
		});
		driver.close();
		driver.quit();
		
	}
}
