package daoefang.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestWait {
	@Test
	public void testwait() {
		System.setProperty("webdriver.firefox.bin",
				"D:/Program Files (x86)/Mozilla Firefox/firefox.exe");
		WebDriver driver = new FirefoxDriver();
		//窗口最大化
		driver.manage().window().maximize();
		
		// 强制等待pause
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}

		// 隐式等待 Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// 显示等待 Explicit wait = WebDriverWait + ExpectedCondition (ExpectedCondtions)
		Wait<WebDriver> wait = new WebDriverWait(driver, 30, 5);
		WebElement element = driver.findElement(By.id("123"));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		

	}
}
