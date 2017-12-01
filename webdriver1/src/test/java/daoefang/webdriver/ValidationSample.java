package daoefang.webdriver;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ValidationSample {

	public String errorMsg = null;

	@Test
	public void validation() {
		if (true != false)
			errorMsg = "验证失败，true ！=false";
		// Assert.assertTrue(false);
		if (1 != 2)
			errorMsg += "\n验证失败，1 ！=2";
		// Assert.assertEquals(1, 2);
	}

	@AfterMethod
	public void afterMethod() {
		if (errorMsg !=null)
			Assert.fail(errorMsg);
	}
}
