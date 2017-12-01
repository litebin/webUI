package daoefang.webdriver.day4;

import org.databene.benerator.anno.Source;
import org.databene.feed4testng.FeedTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Feed4NGDataDrivenDemo extends FeedTest {
	@Test(dataProvider = "feeder")
	@Source("data/TestData.xls")
	public void testAddWithDataDriven(String a, String b, String c) {
		try {
			int a1 = Integer.parseInt(a);
			int b1 = Integer.parseInt(b);
			int c1 = Integer.parseInt(c);
			Assert.assertEquals(a1 + b1, c1);
		} catch (Exception e) {
			String a1 = a;
			String b1 = b;
			String c1 = c;
			Assert.assertEquals(a1 + b1, c1);
		}
	}
}
