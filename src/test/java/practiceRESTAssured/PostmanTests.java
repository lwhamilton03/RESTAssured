//package practiceRESTAssured;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.restassured.RestAssured;
//import io.restassured.http.ContentType;
//
//import static org.hamcrest.Matchers.*;
//import static org.hamcrest.Matchers.equalTo;
//
//
//public class PostmanTests {
//
////	WebDriver driver = null; 
////	
////	
////	@Before
////	public void setUp() 
////	{
////		System.getProperty("webdriver.chrome.driver", Constants.CHROMEDRIVER);
////		driver = new ChromeDriver();
////		driver.manage().window().maximize();
////	}
//	
//	@Test
//	public void responseCode()
//	{
//		RestAssured.given().contentType(ContentType.JSON)
//		.when().get(Constants.APILINK + "&t=IT")
//		.then().statusCode(200);
//	}
//	
//	@Test
//	public void expectedValuesInBody()
//	{
//		RestAssured.given().contentType(ContentType.JSON)
//		.when().get(Constants.APILINK + "&t=batman")
//		.then().body("imdbRating", equalTo("7.6"));
//		//.then().body("", equalTo("")) by leaving it empty then it does the body
//	}
//	
////	@After
////	public void tearDown()
////	{
////		driver.quit();
////	}
//}
