package TestConfig;
import static io.restassured.RestAssured.*;
import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import api.payload.APASRequest;
import api.utilities.ExcelUtility;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
public class BaseAPITest {

	public RequestSpecification requestSpec;
	public ResponseSpecification responseSpec;
	
	@BeforeClass
	public void setUp()
	{
		requestSpec = new RequestSpecBuilder()
	            .setContentType("application/json")
	            .build();

	        responseSpec = new ResponseSpecBuilder()
	            .expectStatusCode(200)
	            .build();
	}
}


