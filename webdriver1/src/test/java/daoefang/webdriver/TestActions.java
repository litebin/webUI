package daoefang.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestActions {

	@Test
	public void testActions() {
		System.setProperty("webdriver.firefox.bin",
				"D:/Program Files (x86)/Mozilla Firefox/firefox.exe");
		WebDriver driver = new FirefoxDriver();
		WebElement element = driver.findElement(By.id("123"));
		WebElement target = driver.findElement(By.id("abc"));
		// 模拟器鼠标左键单击
		(new Actions(driver)).click().perform();
		(new Actions(driver)).click(element).perform();
		// 不释放鼠标左键单击
		(new Actions(driver)).clickAndHold().perform();
		(new Actions(driver)).clickAndHold(element).perform();
		// 鼠标拖拽
		(new Actions(driver)).dragAndDrop(element, target).perform();
		// 右键单击
		(new Actions(driver)).contextClick().perform();
		(new Actions(driver)).contextClick(element).perform();
		// 左键双击
		(new Actions(driver)).doubleClick().perform();
		(new Actions(driver)).doubleClick(element).perform();
		// 键盘事件
		(new Actions(driver)).keyDown(null).perform();
		(new Actions(driver)).keyDown(element, Keys.NUMPAD1).perform();
		(new Actions(driver)).keyUp(Keys.NUMPAD1).perform();
		// 鼠标事件
		(new Actions(driver)).moveToElement(element).perform();
		(new Actions(driver)).release().perform();
		(new Actions(driver)).release(element).perform();
		// 输入文本
		(new Actions(driver)).sendKeys("abc").perform();
		(new Actions(driver)).sendKeys(element, "abc").perform();
		// 一系列鼠标模拟动作
		(new Actions(driver)).moveToElement(element).click().build().perform();
	}
}
