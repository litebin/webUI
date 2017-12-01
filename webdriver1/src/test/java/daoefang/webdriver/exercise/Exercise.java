package daoefang.webdriver.exercise;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Exercise {

	WebDriver driver = null;

	// 切换windowhandle函数
	public void switchHandle(String windowTitle1, WebDriver driver) {
		try {
			String currentHandl = driver.getWindowHandle();
			Set<String> handls = driver.getWindowHandles();
			for (String s : handls) {
				if (!s.equals(currentHandl)) {
					driver.switchTo().window(s);
					if (driver.getTitle().contains(windowTitle1))
						break;
				}
			}
		} catch (NoSuchWindowException e) {
			e.printStackTrace();
		}
	}

	@BeforeClass
	public void login() {
		driver = new FirefoxDriver();
		driver.navigate().to("http://localhost:888");
		driver.findElement(By.linkText("登录")).click();
		switchHandle("用户登录 - 道e坊商城 - Powered by Haidao", driver); // 切换窗口句柄至登录页面
		// 等待进入登录页面
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(
						By.xpath("//div/h3[text()='欢迎登录道e坊商城']")).isDisplayed();
			}
		});
		driver.findElement(By.id("username")).sendKeys("121212");
		driver.findElement(By.id("password")).sendKeys("121212");
		driver.findElement(By.xpath("//input[@class='login_btn fl']")).click();
	}

	@Test
	public void exec() {
		// System.setProperty("webdriver.firefox.bin",
		// "C:/Program Files (x86)/Mozilla Firefox/firefox.exe");

		// 等待进入我的会员中心
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.linkText("我的会员中心")).isDisplayed();
			}
		});
		driver.findElement(
				By.xpath("//div[@class='search fl']//input[@name='keyword']"))
				.sendKeys("iphone");
		;
		driver.findElement(
				By.xpath("//div[@class='search fl']//input[@type='submit']"))
				.click();
		// 等待进入iphone搜索结果页面
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.xpath("//span[text()='搜索结果']"))
						.isDisplayed();
			}
		});
		// 单击苹果6，进入其商品介绍页面
		driver.findElement(
				By.xpath("//div[@class='protect_con']//a[text()='苹果 (Apple) iPhone 6 (A1586) 16GB 金色 移动联通电信4G手机']"))
				.click();
		// 切换窗口句柄值商品介绍页面
		switchHandle(
				"苹果 (Apple) iPhone 6 (A1586) 16GB 金色 移动联通电信4G手机 - 苹果 (Apple) - 道e坊商城 - Powered by Haidao",
				driver);
		// 等待商品介绍并加载完成
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.xpath("//span[text()='加入购物车']"))
						.isDisplayed();
			}
		});
		driver.findElement(By.xpath("//span[text()='加入购物车']")).click();
		// 等待成功加入购物车页面出现，并加载页面完成
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(
						By.xpath("//span[text()='商品已成功加入购物车']")).isDisplayed();
			}
		});
		driver.findElement(By.xpath("//span[@class='shopCar_T_span3']"))
				.click();
		// 等待成功进入购物车页面，并加载页面完成
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.xpath("//div[text()='购物车']"))
						.isDisplayed();
			}
		});
		driver.findElement(By.xpath("//div[text()='清空购物车']")).click();
		driver.switchTo().alert().accept();
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(
						By.xpath("//div[text()='你的购物车还是空的,赶紧行动吧！']"))
						.isDisplayed();
			}
		});
		System.out.println("购物车已经清空");
	}

	@AfterClass
	public void logOut() {
		System.out.println("退出登录并关闭浏览器");
		driver.findElement(By.linkText("[退出]"));
		driver.close();
		driver.quit();
	}
}
