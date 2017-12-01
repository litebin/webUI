package daoefang.webdriver.day4;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dom4jDataDrivenDemo {

	@Test(dataProvider = "dataDriven")
	public void testAddWithDataDriven(String a, String b, String c) {
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		int c1 = Integer.parseInt(c);
		Assert.assertEquals(a1 + b1, c1);
	}

	@DataProvider(name = "dataDriven")
	public Object[][] generateData() throws DocumentException {
		return convertXmlToParamters("data/TestData.xml");
	}

	public static Object[][] convertXmlToParamters(String fileLocation)
			throws DocumentException {
		File inputXml = new File(fileLocation);
		SAXReader saxReader = new SAXReader();
		Object[][] ret = null;

		Document document = saxReader.read(inputXml);
		Element method = document.getRootElement();
		List<Element> parameters = method.elements();

		ret = new Object[parameters.size()][];

		for (int i = 0; i < parameters.size(); i++) {
			List<Element> parameter = parameters.get(i).elements();
			List<String> list = new ArrayList<String>();
			for (int j = 0; j < parameter.size(); j++) {
				list.add(parameter.get(j).getText());
			}
			ret[i] = list.toArray();
		}
		return ret;
	}
}
