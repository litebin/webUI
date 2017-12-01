package daoefang.webdriver;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestCookie {
	@Test
	public void testcookie() {
		System.setProperty("webdriver.firefox.bin",
				"D:/Program Files (x86)/Mozilla Firefox/firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com");
		driver.manage().window().maximize();
		System.out.println(driver.manage().getCookieNamed("BD_UPN").getValue());
		driver.close();
		driver.quit();
		
		// 增加Cookie
		Cookie cookie = new Cookie("key", "value");
		driver.manage().addCookie(cookie);
		// 删除Cookie
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookie(cookie);
		driver.manage().deleteCookieNamed("key");
	}
}
