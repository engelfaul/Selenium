import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				//Create Driver Object from Firefox browser
				//Invoke .exe file
				System.setProperty("webdriver.gecko.driver", "A:\\Selenium\\Drivers\\Firefox\\geckodriver.exe");
				WebDriver driver =  new FirefoxDriver();
				driver.get("https://www.google.com/");
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
	}

}
