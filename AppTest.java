package ToolsQA.DemoMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest
{ WebDriver driver;
@BeforeTest
public void browserTest() {
System.setProperty("webdriver.chrome.driver","E:\\Webdrivers\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
}

@Test
public void test() {
String baseTitle="facebook";
String actualTitle = driver.getTitle();
if(actualTitle.contentEquals(baseTitle)) {
	System.out.println("Test Case passed");
}
else {
	System.out.println("Test Case failed");
}
	
	
}
@AfterTest
public void exit() {
	driver.quit();
}

	
}
