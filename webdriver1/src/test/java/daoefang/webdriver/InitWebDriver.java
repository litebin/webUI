package daoefang.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class InitWebDriver {
	@Test(description = "初始化firefox")
	public void initFirefox() {
		System.setProperty("webdriver.firefox.bin",
				"D:/Program Files (x86)/Mozilla Firefox/firefox.exe");
		WebDriver driver = new FirefoxDriver();
	}

	@Test(description = "初始化ie")
	public void initIe() {
		System.setProperty("webdriver.ie.driver",
				"D:/work/selenium/b2c/bin/x86/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
	}

	@Test(description = "初始化chrome")
	public void initChrome() {
		System.setProperty("webdriver.chrome.driver",
				"D:/work/selenium/b2c/bin/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	}
}
