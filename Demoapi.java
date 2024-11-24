package Apiframework;
import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class Demoapi {
	
	@Test
	public void test1()
	{
		Response response = given().contentType(ContentType.JSON).queryParam("id","1").get("http://localhost:3000/demo");
		response.prettyPrint();
		System.out.println(response.jsonPath().getString("S_Name"));
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	@Test
	
	public void test2() {
		Response response = given().contentType(ContentType.JSON).queryParam("id","1").get("http://localhost:3000/demo");
	Object actual =	response.jsonPath().getString("username").toString();
		Assert.assertEquals(actual, "[Swaraj]");
		
	}

}
