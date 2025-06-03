package api.test;

import io.restassured.response.Response;
import api.payload.*;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import api.utilities.APIUtils;
import api.utilities.ExcelUtility;

public class CRUDTests {

	@DataProvider(name="ExcelData")
	public Object[][] setData() throws IOException
	{
		Object[][] data=ExcelUtility.getAllRows("C:\\Users\\Admin\\OneDrive\\Documents\\productsData.xlsx");
		return data;
	}
	
    @Test
    public void testGetRequest() {
        Response response = APIUtils.getRequest("/objects");
        Assert.assertEquals(response.getStatusCode(), 200, "Status code should be 200");
        Assert.assertTrue(response.asString().contains("name"), "Response should contain user name");
    }

    @Test(dataProvider="ExcelData")
    public void testPostRequest(String name,int year, double price, String CPU , String HardDisk ) {
    	products payload= new products();
    	payload.setName("Apple MacBook Pro 16");
    	Data details= new Data();
    	details.setPrice(1849.99);
    	details.setYear(2019);
    	details.setCPU_model("Intel Core i9");
    	details.setHard_disk_size("1 TB");
    	payload.setData(details);
        Response response = APIUtils.postRequest("/objects", payload);
        Assert.assertEquals(response.getStatusCode(), 200, "Status code should be 201");
    }
    
    
}