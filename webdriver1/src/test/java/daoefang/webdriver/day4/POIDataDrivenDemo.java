package daoefang.webdriver.day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class POIDataDrivenDemo {
	@Test(dataProvider = "dataDriven")
	public void testAddWithDataDriven(double a, double b, double c) {
		Assert.assertEquals(a + b, c);
	}

	@DataProvider(name = "dataDriven")
	public Object[][] generateData() throws IOException {
		return getTestDataFromXlsx("data/TestData.xlsx");
	}

	public static Object[][] getTestDataFromXlsx(String fileLocation)
			throws IOException {
		// 读取文件输入流
		File file = new File(fileLocation);
		FileInputStream fis = new FileInputStream(file);
		// 访问工作簿
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		// 访问电子表格
		XSSFSheet sheet = workbook.getSheetAt(0);
		// 获取电子表格的行数
		int rowCount = sheet.getPhysicalNumberOfRows();
		// 获取电子表格的列数
		int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		// 创建二维数组
		Object[][] ret = new Object[rowCount - 1][colCount];
		// 读取电子表格数据并赋值给二维数组
		for (int i = 0; i < rowCount - 1; i++) {
			for (int j = 0; j < colCount; j++) {
				Cell cell = sheet.getRow(i + 1).getCell(j);
				switch (cell.getCellType()) {
				case Cell.CELL_TYPE_NUMERIC:
					ret[i][j] = cell.getNumericCellValue();
					break;
				case Cell.CELL_TYPE_STRING:
					ret[i][j] = cell.getStringCellValue();
					break;
				default:
					System.out.println("单元格里的值既不是数字类型也不是字符串类型");
				}
			}
		}
		// 关闭文件数据流
		fis.close();
		return ret;
	}
	
	public static Object[][] getTestDataFromXls(String fileLocation)
			throws IOException {
		// 读取文件输入流
		File file = new File(fileLocation);
		FileInputStream fis = new FileInputStream(file);
		// 访问工作簿
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		// 访问电子表格
		HSSFSheet sheet = workbook.getSheetAt(0);
		// 获取电子表格的行数
		int rowCount = sheet.getPhysicalNumberOfRows();
		// 获取电子表格的列数
		int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		// 创建二维数组
		Object[][] ret = new Object[rowCount - 1][colCount];
		// 读取电子表格数据并赋值给二维数组
		for (int i = 0; i < rowCount - 1; i++) {
			for (int j = 0; j < colCount; j++) {
				Cell cell = sheet.getRow(i + 1).getCell(j);
				switch (cell.getCellType()) {
				case Cell.CELL_TYPE_NUMERIC:
					ret[i][j] = cell.getNumericCellValue();
					break;
				case Cell.CELL_TYPE_STRING:
					ret[i][j] = cell.getStringCellValue();
					break;
				default:
					System.out.println("单元格里的值既不是数字类型也不是字符串类型");
				}
			}
		}
		// 关闭文件数据流
		fis.close();
		return ret;
	}
}
