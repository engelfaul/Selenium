import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouseRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YouseTest bs = new YouseTest();
		
		//prueba completa
		bs.FourthStepAuto();
		bs.yfe.getDriver().close();
	}

}
