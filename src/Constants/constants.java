package Constants;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class constants {
	

		public static WebDriver driver;
		public static String appurl="http://webapp.qedge.com/login.php";
		
		
		@BeforeTest
		public static void launchApp()
		{
			System.setProperty("webdriver.chrome.driver", "e:\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(appurl);		
		}
		
		@AfterTest
		public static void closeApp()
		{
			driver.close();
		}
	

}
