package daoefang.webdriver.day4;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import daoefang.webdriver.day4.Method.Parameters;

public class JaxbDataDrivenDemo {

	@Test(dataProvider = "dataDriven")
	public void testAddWithDataDriven(String a, String b, String c) {
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		int c1 = Integer.parseInt(c);
		Assert.assertEquals(a1 + b1, c1);
	}

	@DataProvider(name = "dataDriven")
	public Object[][] generateData() throws JAXBException {
		return getXmlParatemers("data/TestData.xml");
	}

	public static Object[][] getXmlParatemers(String fileLocation)
			throws JAXBException {
		File file = new File(fileLocation);
		JAXBContext jaxbContext = JAXBContext.newInstance(Method.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Method method = (Method) jaxbUnmarshaller.unmarshal(file);
		// 生成二维数组
		List<Parameters> parameters = method.getParameters();
		Object[][] ret = new Object[parameters.size()][];
		for (int i = 0; i < parameters.size(); i++) {
			ret[i] = parameters.get(i).getParameter().toArray();
		}
		return ret;
	}
}
