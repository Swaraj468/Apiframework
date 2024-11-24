package Apiframework;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class k21fzAPI {
	
	public static void main(String args[]) {
		Response response = given().contentType(ContentType.JSON).queryParam("id","1").get("http://localhost:3000/demo");
		response.prettyPrint();
		
	}

}
