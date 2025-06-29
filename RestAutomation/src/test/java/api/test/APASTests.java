package api.test;
import static io.restassured.RestAssured.*;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestConfig.BaseAPITest;
import api.payload.APASRequest;
import api.payload.APASResponse;
import api.utilities.ExcelUtility;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class APASTests extends BaseAPITest {

	@DataProvider(name="ExcelData")
	public Object[][] setData() throws IOException
	{
		Object[][] data=ExcelUtility.getAllRows("C:\\Users\\Admin\\OneDrive\\Documents\\Book1.xlsx");
		return data;
	}
	
	@Test(dataProvider="ExcelData")
	public void SendRequest(String id ,String Username,String firstName, String lastName, String email, String password, String phone , String userStatus)
	{
		
		APASRequest APAS=new APASRequest();
		APAS.setEmail(email);
		APAS.setFirstName(firstName);
		APAS.setId(id);
		APAS.setUsername(Username);
		APAS.setUserStatus(userStatus);
		APAS.setPhone(phone);	
		given().spec(requestSpec).body(APAS).
		when().post().
		then().spec(responseSpec).extract().response().as(APASResponse.class);
	}
	  
	
	@Test()
	public void Test01()
	{
		APASResponse response=new APASResponse();
		Assert.assertTrue(response.getCode().equals(200));
	}
	
	@Test()
	public void Test02()
	{
		APASResponse response=new APASResponse();
		Assert.assertTrue(response.getMessage().equals("Successfull"));
	}
}
