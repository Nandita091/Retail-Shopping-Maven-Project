package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	public static WebDriver startBrowser(String browsertype, String url) {
		// TODO Auto-generated method stub
		
		String chromePath="C:\\Users\\nitu2\\Downloads\\chromedriver_win32\\chromedriver.exe";
		String fireFoxPath = "C:\\Users\\nitu2\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe";
		
		WebDriver driver=null;
		switch (browsertype)
		{
		case "firefox":
			
			System.setProperty("webdriver.gecko.driver", fireFoxPath);
			driver=new FirefoxDriver();
			break;
		case "chrome":
			 System.setProperty("webdriver.chrome.driver",chromePath);
			driver=new ChromeDriver();
			
			break;
		default:
			break;
		}	
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
		return driver;
	}

}

