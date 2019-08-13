import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YouseTest {

	
	static YouseIndexElements 		yie = new YouseIndexElements();
	static YouseSecondStepElements 	yse = new YouseSecondStepElements();
	static YouseThirdStepElements 	yte = new YouseThirdStepElements();
	static YouseFourthStepElements 	yfe = new YouseFourthStepElements();
		
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
			yse.WriteElement(yse.txtCEP(), "13562701");
			esperarSegundos(yse.getDriver(), 10);
		
			yse.WriteElement(yse.txtComplement(), "1234");
			esperarSegundos(yse.getDriver(), 10);
			yse.selectComboValue(yse.pickInsured(), "true");
			esperarSegundos(yse.getDriver(), 10);
			yse.WriteElement(yse.txtCpf(), "17442586430");
			esperarSegundos(yse.getDriver(), 5);
			
			yse.WriteElement(yse.txtName(), "Carlos Pabon");
			yse.selectComboValue(yse.pickGender(), "male");
			yse.WriteElement(yse.txtDate(), "22111989");
			yse.selectComboValue(yse.pickNationality(), "DE");
			yse.selectComboValue(yse.pickSalary(), "Minimum");
			yse.selectComboValue(yse.pickMarital(), "single");
			
			yse.selectComboValue(yse.pickInsurance(), "true");
			yse.selectComboValue(yse.pickBonuses(), "true");
			
			yse.selectComboValue(yse.pickInsuredPerson(), "true");
			yse.selectComboValue(yse.pickYoungDriver(), "true");
			yse.ClickElement(yse.btnNextSecondStep());
		}
		
		
		//Test4
		public static void ThirdStepAuto(){
					secondStepAuto();
					yte.setDriver(yse.getDriver());
					
					esperarSegundos(yte.getDriver(), 5);
					yte.ClickElement(yte.btnFirstOption());
					esperarSegundos(yte.getDriver(), 5);
					yte.ClickElement(yte.btnFull());
					yte.ClickElement(yte.btnNext());
					yte.ClickElement(yte.btnNextStep2());
					yte.ClickElement(yte.btnNextStep2());
					
		 }
		
		//Test5
		public static void FourthStepAuto(){
			ThirdStepAuto();
			yfe.setDriver(yte.getDriver());
			
		
			yfe.selectComboValue(yfe.pickAtrributes(), "false");
			esperarSegundos(yfe.getDriver(), 5);
			yfe.ClickElement(yfe.btnNextStep());
			esperarSegundos(yfe.getDriver(), 5);
			
			
		}
		
		
}