package Api_tests;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utils.BrowserUtils;
import Utils.DB_Utils;
import Utils.DataReader;
import groovyjarjarantlr4.v4.misc.Utils;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Items_management_api {
	BrowserUtils utils = new BrowserUtils();
	DB_Utils db = new DB_Utils();
	
	String token;
	String baseurl= "http://crater.primetech-apps.com";
	Response response;
	int item_id;
	//login test
	@Test  (groups= {"smoke-tests"})
	
	public void login_crater() {
		
		String body = "{\n"
				+ "    \"username\": \""+ DataReader.getProperty("crater_email")+"\",\n"
				+ "    \"password\": \""+ DataReader.getProperty("crater_password")+"\",\n"
				+ "    \"device_name\": \"mobile_app\"\n"
				+ "}";


		response = RestAssured
		.given().contentType("application/json").body(body)
			.when().post(baseurl+"/api/v1/auth/login");
		
		response.prettyPrint();
		token = response.jsonPath().get("token");
		
	
		}
	
	
	
	@Test (dependsOnMethods="login_crater") 	
	public void list_all_items() {
		 response= RestAssured
			.given().accept("application/json").auth().oauth2("Bearer  " + token)
			.when().get(baseurl +"/api/v1/items");
		//response.prettyPrint();
		response.then().statusCode(200).contentType("application/json");
		
	}
	
	
	
	// create an item and verify the item input is correct in response
//		@Test (dependsOnMethods="login_crater")
//		public void create_item() {
//
//			
//			String itemName = "Watch" + utils.randomNumber();
//			
//			Map<String, Object> payload = new HashMap <>();
//			payload.put("name", itemName);
//			payload.put("price", 3800);
//			payload.put("unit_id", 11);
//			payload.put("description", "Smart Watch");
//			
//			response = RestAssured.
//					given().auth().oauth2("Bearer " + token).body(payload).contentType("application/json")
//					.when().post(baseurl + "/api/v1/items");
//			
//			item_id = response.jsonPath().get("data.id");
//			
//			String item_name = response.jsonPath().get("data.name");
//
//			System.out.println(" Name of the item created is: " + item_name);
//			
//			
//			
//			String query = "Select * From items Where name='"+itemName+"'";
//			
//			List<String> item_info = db.selectARecord(query);
//			
//			for (String string : item_info) {
//				System.out.println(string);
//			}
//			
//			System.out.println("First index is: " + item_info.get(1));
//			Assert.assertEquals(itemName, item_info.get(1));
//	
//	
//	
//}
}
