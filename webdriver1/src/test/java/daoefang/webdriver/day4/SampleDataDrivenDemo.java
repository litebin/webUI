package daoefang.webdriver.day4;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleDataDrivenDemo {

	@Test(enabled = false)
	public void testAdd() {
		Assert.assertEquals(5 + 3, 8);
		Assert.assertEquals(5 - 3, 2);
		Assert.assertEquals(15 - 3, 12);
		Assert.assertEquals(22 - 3, 19);
		Assert.assertEquals(5 - 9, -4);
	}
//================我是分割线=================
	@Test(dataProvider = "dataDriven")
	public void testAddWithDataDriven(int a, int b, int c) {
		Assert.assertEquals(a + b, c);
	}

	@DataProvider(name = "dataDriven")
	public Object[][] generateData() {
		Object[][] ret = { { 5, 3, 8 }, { 5, -3, 2 }, { 15, -3, 12 },
				{ 22, -3, 19 }, { 5, -9, -4 } };
		return ret;
	}
}
