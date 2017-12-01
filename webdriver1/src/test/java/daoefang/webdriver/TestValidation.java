package daoefang.webdriver;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestValidation {

	public String errorMsg = null;

	@BeforeMethod
	public void beforeMethod() {
		errorMsg = null;
	}

	@AfterMethod
	public void afterMethod() {
		if (errorMsg != null) {
			Assert.fail(errorMsg);
		}
	}

	@Test
	public void test1() {
		// Assert.assertTrue(false);
		if (true != false)
			errorMsg = "test1方法验证true=false失败\n";
		System.out.println("test1");
	}

	@Test
	public void test2() {
		Assert.assertEquals(1, 2);
		System.out.println("test2");
	}

	@Test
	public void test3() {
		Assert.assertEquals(2, 2);
		System.out.println("test3");
	}
}
