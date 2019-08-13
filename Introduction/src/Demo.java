import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create Driver Object from Chrome browser
		//Invoke .exe file
		System.setProperty("webdriver.chrome.driver", "A:\\Selenium\\Drivers\\chrome\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.get("http://yahoo.com");
		driver.navigate().back();
		driver.close();
	}

}
