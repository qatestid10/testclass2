import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Mainclass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","D:\\qatestid12\\Gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
						
		//System.setProperty("webdriver.ie.driver", "D:\\qatestid12\\32bit\\New folder\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.google.com/");		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement username;
		username = driver.findElement(By.id("lst-ib"));
		username.sendKeys("hello World");
		
		 
		String pagetile = driver.getTitle();
		System.out.println(pagetile);
		
		//driver.close();
		//driver.quit();
		
	}

}
