package api.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestConfig.BaseAPITest;

public class dataProvider {

	
	@DataProvider(name="Excel")
	public Object[][] readExcelData(String path) throws IOException
	{
		Object[][] data =ExcelUtility.getAllRows(path);
		return data;
		
	}
	
	@DataProvider(name="SQL")
	public Object[][] readSQLdata(String path) throws IOException
	{
		Object[][] data =ExcelUtility.getAllRows(path);
		return data;
		
	}
}
