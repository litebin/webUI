package daoefang.webdriver;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.JavascriptLibrary;

public class ElementOperation {

	@Test
	public void test() {
		WebDriver driver = new FirefoxDriver();
		driver.findElement(By.id("abc")).click();
		driver.findElement(By.id("abc")).sendKeys("文本信息");
		driver.findElement(By.id("abc")).clear();

		// <select/>
		Select select = new Select(driver.findElement(By.tagName("select")));
		// select.selectByIndex(index);
		// select.selectByValue(value);
		select.selectByVisibleText("30");
		select.deselectAll();

		List<WebElement> elements = select.getOptions();
		select.getFirstSelectedOption();
		select.getAllSelectedOptions();

		// 提交表单
		driver.findElement(By.id("username")).submit();

		// 切换窗口
		// driver.switchTo().window(nameOrHandle);
		driver.getWindowHandle();
		driver.getWindowHandles();
		// driver.switchTo().frame(frameElement);

		// JavaScript弹框
		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		alert.getText();
		alert.sendKeys("prompt文本信息");

		// ====================================
		// 元素高级操作
		WebElement element = driver.findElement(By.id("123"));
		// 获取表格中元素所在列
//		long a = (long) ((JavascriptExecutor) driver).executeScript(
//				"return arguments[0].cellIndex", element) + 1;
//		// 获取表格中元素所在行
//		long b = (long) ((JavascriptExecutor) driver).executeScript(
//				"return arguments[0].rowIndex", element) + 1;
//		// 获取表格的行数
//		long c = (long) ((JavascriptExecutor) driver).executeScript(
//				"return arguments[0].row.length", element);
		// 获取父元素
		WebElement d = (WebElement) ((JavascriptExecutor) driver)
				.executeScript("return arguments[0].parentNode", element);
		// 获取所有子元素
		List<WebElement> e = (List<WebElement>) ((JavascriptExecutor) driver)
				.executeScript("return arguments[0].childNodes", element);
		// 触发DOM事件
		// Selenium 1.0
		(new JavascriptLibrary()).callEmbeddedSelenium(driver, "triggerEvent",
				element, "onmouseover");
		// Selenium 2.0
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].fireEvent('onmouseover')", element);
		// 增加或修改DOM属性
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].setAttribute('name', 'hello')", element);
		// 删除DOM属性
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].removeAttribute('name')", element);
		// 修改DOM文本
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].innerText='这个是一个测试'", element);

		// 关闭当前网页
		driver.close();
		// 关闭所有网页并且释放资源
		driver.quit();

		// 添加验证点
		// 获取元素文本
		driver.findElement(By.id("123")).getText();
		// 判断元素可见
		driver.findElement(By.id("123")).isDisplayed();
		// 获取元素DOM属性
		driver.findElement(By.id("123")).getAttribute("name");
		// 获取元素CSS属性
		driver.findElement(By.id("123")).getCssValue("color"); // rgb(255, 255,
																// 255) rgb(0,
																// 0, 0)

		// 断言
		// Assert.assertTrue(null);
		// Assert.assertFalse
		// Assert.fail //+ if clause
		// Assert.assertEquals
		// Assert.assertNotEquals
		// Assert.assertArrayEqauls
		// Assert.assertNull
		// Assert.assertNotNull

		// 验证Validation
		// @AfterMethod 或 @AfterClass 结合Assert
	}
}
