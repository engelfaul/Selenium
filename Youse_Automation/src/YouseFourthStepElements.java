import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class YouseFourthStepElements {

	private WebDriver driver;
	
	public WebDriver getDriver()
	{
		return driver;
	}
	
	public void setDriver(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	//******* Web Elements******///
	
	//WebElements Forth Step
	
	public WebElement pickAdapted()
	{
		return getDriver().findElement(By.id("adapted"));
	}
	
	
	public WebElement pickAtrributes()
	{
		return getDriver().findElement(By.id("auto_order_flow_vehicle_data_vehicle_attributes_bullet_proof"));
	}
	
	public WebElement btnNextStep()
	{
		return getDriver().findElement(By.name("commit"));
	}

	
	//******* Services *****//
	public void ClickElement( WebElement element)
	{
		element.click();
	}
	
	public void WriteElement( WebElement element, String text)
	{
		element.sendKeys(text);
	}
	
	public void selectComboValue(WebElement element, String value) {
	    final Select selectBox = new Select(element);
	    selectBox.selectByValue(value);
	}

}