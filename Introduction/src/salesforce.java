import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "A:\\Selenium\\Drivers\\chrome\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=mx");
		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.name("pw")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@id='Login']")).click();;
		//driver.findElement(By.id("email")).sendKeys("myfisrt code");
		//driver.findElement(By.name("pass")).sendKeys("1234");
		//driver.findElement(By.linkText("�Has olvidado los datos de la cuenta?")).click();

	}

}