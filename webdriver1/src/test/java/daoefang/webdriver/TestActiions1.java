package daoefang.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestActiions1 {
	@Test
	public void testActions() {
		System.setProperty("webdriver.firefox.bin",
				"D:/Program Files (x86)/Mozilla Firefox/firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com");

		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.id("kw")).isDisplayed();
			}
		});

		WebElement element = driver.findElement(By.id("kw"));
		element.sendKeys("第二次世界大战详细战报的结果");
//		(new Actions(driver)).sendKeys(element, "第二次世界大战详细战报的结果").perform();
		driver.close();
		driver.quit();
	}

}
