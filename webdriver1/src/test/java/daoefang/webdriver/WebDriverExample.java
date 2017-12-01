package daoefang.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WebDriverExample {

	@Test(description = "这是我的第一个WebDriver测试程序")
	public void firstWebDriverMethod() {
		// 初始化并打开浏览器
		System.setProperty("webdriver.chrome.driver",
				"D:/work/selenium/b2c/bin/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/");

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
		element.submit(); // driver.findElement(By.className("login_btn fl")).click();

		// 等待会员页面中心出现并且加载完成
		System.out.println("页面标题是" + driver.getTitle());
		
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.getTitle().toLowerCase().startsWith("我的会员中心");
			}
		});

		System.out.println("页面标题是" + driver.getTitle());

		// 退出并关闭浏览器
		driver.findElement(By.linkText("[退出]")).click();		
		driver.close();
		driver.quit();
	}
}
