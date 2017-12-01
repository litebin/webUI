package daoefang.webdriver.exercise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Execise1 {

	public WebDriver driver = null;

	@BeforeClass
	public void setup() {
		// 初始化并打开浏览器
		System.setProperty("webdriver.firefox.bin",
				"D:/Program Files (x86)/Mozilla Firefox/firefox.exe");
		driver = new FirefoxDriver();
		driver.get("http://localhost/");
	}

	@Test(description = "这是我的第一个WebDriver测试程序")
	public void firstWebDriverMethod() {

		// 点击登录并切换到新窗口
		driver.findElement(By.linkText("登录")).click();
		driver.close();
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}

		// 登录系统
		driver.findElement(By.id("username")).sendKeys("daoexuan");
		WebElement element = driver.findElement(By.id("password"));
		element.sendKeys("daoexuan");
		driver.findElement(By.xpath("//input[@value='登　录']")).click();

		// 等待会员页面中心出现并且加载完成
		System.out.println("页面标题是" + driver.getTitle());

		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.getTitle().toLowerCase().startsWith("我的会员中心");
			}
		});

		System.out.println("页面标题是" + driver.getTitle());

		// Exercise
		driver.findElement(By.name("keyword")).sendKeys("iphone");
		driver.findElement(
				By.xpath("//input[contains(@value,'搜')][contains(@value,'索')]"))
				.click();

		driver.findElement(By
				.xpath("//div[@class='ShopboxR fl']//a[text()='苹果 (Apple) iPhone 6 (A1586) 16GB 金色 移动联通电信4G手机']")).click();;
		driver.close();
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}

		// driver.findElement(By.id("joinCarButton")).click();
		(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.elementToBeClickable(By
						.id("joinCarButton"))).click();

		(new WebDriverWait(driver, 10)).until(
				ExpectedConditions.elementToBeClickable(By
						.className("shopCar_T_span3"))).click();

		(new WebDriverWait(driver, 10)).until(
				ExpectedConditions.elementToBeClickable(By
						.xpath("//div[text()='清空购物车']"))).click();

		Alert alert = driver.switchTo().alert();
		alert.accept();

		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.getPageSource().contains("你的购物车还是空的,赶紧行动吧！");
			}
		});
	}

	@AfterClass
	public void tearDown() {
		// 退出并关闭浏览器
		driver.findElement(By.linkText("[退出]")).click();
		driver.close();
		driver.quit();
	}
}
