package daoefang.webdriver.exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WebDriverDemo {

	public WebDriver driver = null;

	// @Test(description = "测试后台管理员登录")
	@BeforeClass
	public void testLogin() {
//		System.setProperty("webdriver.firefox.bin",
//				"D:/Program Files (x86)/Mozilla Firefox/firefox.exe");
//		driver = new FirefoxDriver();
		 System.setProperty("webdriver.chrome.driver",
		 "D:/work/selenium/b2c/bin/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/index.php?&m=admin&c=public&a=login");

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("userpass")).sendKeys("password");
		driver.findElement(By.name("userverify")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("正在登录过程中");

		// 等待页面加载完成
		// (new WebDriverWait(driver, 10)).until(new
		// ExpectedCondition<Boolean>() {
		// public Boolean apply(WebDriver driver) {
		// return driver.getTitle().toLowerCase().startsWith("后台管理中心");
		// }
		// });
		//
		// Assert.assertTrue(driver.findElement(
		// By.xpath("//a[text()='欢迎您 admin']")).isDisplayed());

		// waitFor
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.xpath("//a[text()='欢迎您 admin']"))
						.isDisplayed();
			}
		});
	}

	@Test(description = "测试后台添加会员功能", dataProvider = "data")
	public void addMemeber(String username, String phone, String sex,
			String birthday, String email, String qq) {
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("会员管理")).click();

		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.linkText("添加会员")).isDisplayed();
			}
		});

		driver.findElement(By.linkText("添加会员")).click();

		// 输入会员信息
		driver.switchTo().frame("mainFrame");

		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.name("username")).isDisplayed();
			}
		});

		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("mobile_phone")).sendKeys(phone);
		if (sex.equals("男")) {
			driver.findElement(By.xpath("//input[@value='0']")).click();
		} else if (sex.equals("女")) {
			driver.findElement(By.xpath("//input[@value='1']")).click();
		}
		driver.findElement(By.name("birthday")).sendKeys(birthday);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("qq")).sendKeys(qq);
		driver.findElement(By.xpath("//input[@value='提交']")).click();

		String xpath = "//tr[td/div='" + username + "'][td/div='" + phone
				+ "'][td/div='" + email + "']";
		(new WebDriverWait(driver, 10)).until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(xpath)));
		// Assert.assertTrue(driver
		// .findElement(
		// By.xpath("//tr[td/div='daoefang'][td/div='18112345678'][td/div='daoefang@kengni.com']"))
		// .isDisplayed());

		driver.findElement(By.xpath("//input[@name='id']")).click();
		driver.findElement(By.xpath("//span[text()='删除']")).click();
		driver.findElement(
				By.xpath("//div[@class='messager-button']//span[text()='取消']"))
				.click();

		Assert.assertTrue(driver.findElement(By.xpath(xpath)).isDisplayed());

		driver.findElement(
				By.xpath("//tr[td/div='" + username + "']//a[text()='删除']"))
				.click();
		driver.findElement(
				By.xpath("//div[@class='messager-button']//span[text()='确定']"))
				.click();
		(new WebDriverWait(driver, 10)).until(ExpectedConditions
				.invisibilityOfElementLocated(By.xpath(xpath)));
	}

	// @Test(dependsOnMethods = { "deleteMember" }, description = "测试后台退出功能")
	@AfterClass
	public void testLogout() {
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("退出系统")).click();
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.id("verify")).isDisplayed();
			}
		});
		driver.close();
		driver.quit();
	}

	@DataProvider(name = "data")
	public Object[][] generateData() {
		Object[][] ret = {
				{ "daoefang", "18112345678", "男", "1978-07-08",
						"daoefang@def.com", "12345678" },
				{ "daoehua", "18112345679", "女", "2000-01-01",
						"daoehua@def.com", "87654321" } };
		return ret;
	}
}
