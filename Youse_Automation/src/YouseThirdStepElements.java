import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class YouseThirdStepElements {

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
	
	//WebElements Third Step
	
	public WebElement btnFirstOption()
	{
		return getDriver().findElement(By.cssSelector("#preformatted-coverages-auto-plans-1 > div.preformatted-coverages__content > a"));
	}
	
	public WebElement btnFull()
	{
		return getDriver().findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Servi�os da Cobertura'])[1]/following::label[1]"));
	}
	
	public WebElement btnNext()
	{
		return getDriver().findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Servi�os da Cobertura'])[1]/following::label[1]"));
	}
	
	public WebElement btnNextStep2()
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
