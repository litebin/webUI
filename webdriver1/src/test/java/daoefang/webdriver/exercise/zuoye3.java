package daoefang.webdriver.exercise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class zuoye3 {
	@Test(description = "这是第三天课程的作业")
	public void zuoye3() {
		WebDriver v_driver = new FirefoxDriver();
		v_driver.get("http://localhost/");

		// 点击登录按钮并切换至登录页面
		v_driver.findElement(By.linkText("登录")).click();
		v_driver.close();
		for (String v_handle : v_driver.getWindowHandles()) {
			v_driver.switchTo().window(v_handle);
		}

		// 输入合法的用户名，密码
		String v_username = "daoexuan";
		String v_password = "daoexuan";
		v_driver.findElement(By.id("username")).sendKeys(v_username);
		v_driver.findElement(By.id("password")).sendKeys(v_password);

		// 点击登录按钮
		v_driver.findElement(By.xpath("//input[@class='login_btn fl']"))
				.click();

		// 等 待页面加载完成，以页头右上解是否出现您好xx字样为准
		(new WebDriverWait(v_driver, 20))
				.until(new ExpectedCondition<Boolean>() {
					public Boolean apply(WebDriver driver) {
						return driver.findElement(
								By.xpath("//a[text()='您好 daoexuan']"))
								.isDisplayed();
					}
				});

		// 等待我的中心页面加载完成

		(new WebDriverWait(v_driver, 30))
				.until(new ExpectedCondition<Boolean>() {
					public Boolean apply(WebDriver driver) {
						return driver.findElement(
								By.xpath("//strong[text()='正在进行中的交易']"))
								.isDisplayed();
					}
				});

		// 在上方搜索框中输入iPhone关键字并点击搜索按钮
		v_driver.findElement(By.xpath("//input[@name='keyword']")).sendKeys(
				"iPhone");
		v_driver.findElement(By.xpath("//input[@type='submit']")).click();

		// 等待目标加载完成并点击商品名为“苹果 (Apple) iPhone 6 (A1586) 16GB 金色 移动联通电信4G手机”的链接
		(new WebDriverWait(v_driver, 10))
				.until(new ExpectedCondition<Boolean>() {
					public Boolean apply(WebDriver driver) {
						return driver
								.findElement(
										By.xpath("//p[@class='p1']/a[text()='苹果 (Apple) iPhone 6 (A1586) 16GB 金色 移动联通电信4G手机']"))
								.isDisplayed();
					}
				});

		v_driver.findElement(
				By.xpath("//p[@class='p1']/a[text()='苹果 (Apple) iPhone 6 (A1586) 16GB 金色 移动联通电信4G手机']"))
				.click();
		// 关掉上一个搜索窗口，跳至新窗口执行后面的操作
		v_driver.close();
		for (String v_handle : v_driver.getWindowHandles()) {
			v_driver.switchTo().window(v_handle);

			// 点击“加入购物车”按钮
			v_driver.findElement(By.xpath("//span[@id='joinCarButton']"))
					.click();
			// 等待去购物车结算按钮出现
			(new WebDriverWait(v_driver, 10))
					.until(new ExpectedCondition<Boolean>() {
						public Boolean apply(WebDriver driver) {
							return driver
									.findElement(
											By.xpath("//span[@class='shopCar_T_span3']"))
									.isDisplayed();
						}
					});

			// 点击“去购物车结算”按钮
			v_driver.findElement(By.xpath("//span[@class='shopCar_T_span3']"))
					.click();

			// 等待清空购物车按钮出现
			(new WebDriverWait(v_driver, 10))
					.until(new ExpectedCondition<Boolean>() {
						public Boolean apply(WebDriver driver) {
							return driver
									.findElement(
											By.xpath("//div[@class='shopCar_btn_02 fl']"))
									.isDisplayed();
						}
					});
			// 点击“清空购物车”按钮
			v_driver.findElement(By.xpath("// div[@class='shopCar_btn_02 fl']"))
					.click();

			// 点击“是”或“OK”按钮

			Alert alert = v_driver.switchTo().alert();
			alert.accept();

			// 退出浏览器
			v_driver.close();
			v_driver.quit();

		}

	}

}
