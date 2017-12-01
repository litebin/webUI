package daoefang.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ElementLocation {
	@Test
	public void test() {
		System.setProperty("webdriver.firefox.bin",
				"D:/Program Files (x86)/Mozilla Firefox/firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.findElement(null);
		// By.id(id);
		// By.className(className);
		// By.tagName(name);
		// By,name(name);
		// By.linkText("登录");
		// By.partialLinkText("登");

		// <book class="aaa"/>
		By.cssSelector("book.aaa");
		By.xpath("//book[@class='aaa']");

		// java script
		// <book class="cheese"/>
		WebElement element = (WebElement) ((JavascriptExecutor) driver)
				.executeScript("return $('.cheese')[0]");
		// <label class="">
		// <input/>
		// <input/>
		// </label>
		List<WebElement> labels = driver.findElements(By.tagName("label"));
		((JavascriptExecutor) driver)
				.executeScript(
						"var labels = arguments[0],  inputs =[]; for(var i =0;i< labels.length;i++){inputs.push(document.getElementById(labels[i].getAttrbute('for')));} return inputs;",
						labels);
		// JavaScript + HTML DOM
		List<WebElement> elements = (List<WebElement>) ((JavascriptExecutor) driver)
				.executeScript("return document.getElementByTagName('a')");
	}
}
