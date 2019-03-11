package test.page;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import io.restassured.response.Response;


public class APITest {
	static String placeid;
	public void createPlaceAPI()
	{
		RestAssured.baseURI="http://216.10.245.166";
		Response res=given().

				queryParam("key","qaclick123").
				body("{"+
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
						"}").
				when().
				post("/maps/api/place/add/json").
				then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
				body("status",equalTo("OK")).extract().response();
		String responseString=res.asString();
		System.out.println(responseString);
		JsonPath js= new JsonPath(responseString);
		placeid=js.get("place_id");
		System.out.println(placeid);
	}


	public void checkPlaceFirstApi() {
		RestAssured.baseURI="http://216.10.245.166";
		given().
		param("location","-33.8669710,151.1958750").
		param("radius","500").
		param("key","qaclick123").
		when().
		get("/map/api/place/nearbysearch/jsoan").
		then().assertThat().statusCode(200);

		System.out.println("User able to find that place");

	}

	public void deleteplace() {
		RestAssured.baseURI="http://216.10.245.166";
		given().
		queryParam("key","qaclick123").

		body("{"+
				"\"place_id\": \""+placeid+"\""+
				"}").
		when().
		post("/maps/api/place/delete/json").
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
		body("status",equalTo("OK"));

		System.out.println("User delete that place");
	}

}
