package daoefang.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PageNavigation {

	@Test
	public void test(){
		System.setProperty("webdriver.firefox.bin",
				"D:/Program Files (x86)/Mozilla Firefox/firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com");
		driver.navigate().to("http://www.baidu.com");
		driver.navigate().back();
		driver.navigate().forward();
	}
}
