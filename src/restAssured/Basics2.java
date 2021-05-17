package restAssured;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.equalTo;

public class Basics2 {
	String b="{"+

	  "\"location\": {"+

	    "\"lat\": -33.8669710,"+

	    "\"lng\": 151.1958750"+

	  "},"+

	  "\"accuracy\": 50,"+

	  "\"name\": \"Google Shoes!\","+

	  "\"phone_number\": \"(02) 9374 4000\","+

	  "\"address\": \"48 Pirrama Road, Pyrmont, NSW 2009, Australia\","+

	  "\"types\": [\"shoe_store\"],"+

	  "\"website\": \"http://www.google.com.au/\","+

	  "\"language\": \"en-AU\""+

	"}";
	
	@Test
	public void createPlaceAPI()

	{
		

	RestAssured.baseURI="http://216.10.245.166";

	Response res=given().
	queryParam("key","qaclick123").
	body(b).
	when().
	post("/maps/api/place/add/json").
	then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
	body("status",equalTo("OK")).extract().response();
	
	String responsestring=res.asString();
	System.out.println("Response string is "+responsestring);
	
	

	// Create a place =response (place id)

	// delete Place = (Request - Place id)



	}

}
