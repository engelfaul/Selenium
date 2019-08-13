import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YouseTest {

	
	static YouseIndexElements yie = new YouseIndexElements();
	static YouseSecondStepElements yse = new YouseSecondStepElements();
	
		public enum MyDrivers
		{
			Chrome,
			Firefox,
			Iexplorer
		}
		
		public static WebDriver CreateMyDriver (MyDrivers mydriver)
		{
			switch (mydriver) {
			case Chrome:
				System.setProperty("webdriver.chrome.driver", "A:\\Selenium\\Drivers\\chrome\\chromedriver.exe");
				return new ChromeDriver();
			case Iexplorer:
				return new InternetExplorerDriver();
			default:
				return new ChromeDriver();
				
			}
		}
		
		 public static void esperarSegundos(WebDriver driver, int segundos){
		       
		      synchronized(driver){
		         try {
		            driver.wait(segundos * 1000);
		         } catch (InterruptedException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		         }
		      }
		   }
		//Test1
		public static void openYousePage() {
			
			
			yie.setDriver(CreateMyDriver(MyDrivers.Chrome));
			String url = "https://www.youse.com.br/";
			
			yie.getDriver().get(url);
			
			//yie.getDriver().close();
			
		}
		
		//Test2
		public static void firstStepAuto() {
			openYousePage();
			yie.ClickElement(yie.btnOnlineContactAuto());
			yie.WriteElement(yie.txtName(), "prueba");
			yie.WriteElement(yie.txtEmail(), "prueba@prueba.com");
			yie.WriteElement(yie.txtPhoneNumber(), "12345678901");
			yie.ClickElement(yie.btnNextFirstStep());
		}
		
		//Test3
		public static void secondStepAuto(){
			firstStepAuto();
			yse.setDriver(yie.getDriver());
			yse.WriteElement(yse.txtIdAuto(),"LTB4060");
			
			
			//yse.getDriver().manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
			esperarSegundos(yse.getDriver(), 5);
		
			yse.ClickElement(yse.pickAuto());
	
			yse.selectComboValue(yse.pickUse(), "auto|private and commercial use");
			yse.selectComboValue(yse.pickOwner(), "owned_by_person");
			yse.WriteElement(yse.txtCEP(), "12345678");
			esperarSegundos(yse.getDriver(), 10);
			yse.txtNeighborhood().sendKeys("asdaasd");
			esperarSegundos(yse.getDriver(), 10);
			yse.WriteElement(yse.txtNeighborhood(), "prueba");
			esperarSegundos(yse.getDriver(), 10);
			yse.WriteElement(yse.txtCity(), "city");
			esperarSegundos(yse.getDriver(), 10);
			yse.WriteElement(yse.txtStreet(), "Street123");
			esperarSegundos(yse.getDriver(), 10);
			yse.WriteElement(yse.txtComplement(), "1234");
			esperarSegundos(yse.getDriver(), 10);
			yse.selectComboValue(yse.pickInsured(), "true");
			esperarSegundos(yse.getDriver(), 10);
			yse.WriteElement(yse.txtCpf(), "11111111111");
			esperarSegundos(yse.getDriver(), 5);
			
			yse.selectComboValue(yse.pickGender(), "male");
			yse.selectComboValue(yse.pickNationality(), "DE");
			yse.selectComboValue(yse.pickMarital(), "single");
			
			yse.selectComboValue(yse.pickInsurance(), "true");
			yse.selectComboValue(yse.pickBonuses(), "true");
			
			yse.selectComboValue(yse.pickInsuredPerson(), "true");
			yse.ClickElement(yse.btnNextSecondStep());
			//yie.ClickElement(yie.btnOnlineContactAuto());
			//yie.WriteElement(yie.txtName(), "prueba");
			//yie.WriteElement(yie.txtEmail(), "prueba@prueba.com");
			//yie.WriteElement(yie.txtPhoneNumber(), "12345678901");
			//yie.ClickElement(yie.btnNextFirstStep());
		}
}
