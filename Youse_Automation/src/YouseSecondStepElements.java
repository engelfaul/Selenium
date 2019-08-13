import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class YouseSecondStepElements {

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
	
	//WebElements Second Step
	public WebElement txtIdAuto()
	{
		return getDriver().findElement(By.xpath("//*[@id='auto_order_flow_pricing_requirements_vehicle_attributes_license_plate_or_vin']"));
	}
	
	public WebElement pickAuto()
	{
		
		return getDriver().findElement(By.cssSelector("li.box-flexible__title:nth-child(1) > div:nth-child(1)"));

	}
	
	
	public WebElement pickUse()
	{
		return getDriver().findElement(By.cssSelector("#auto_order_flow_pricing_requirements_vehicle_attributes_usage"));
	}
	
	public WebElement pickOwner()
	{
		return getDriver().findElement(By.cssSelector("#auto_order_flow_pricing_requirements_vehicle_attributes_ownership_status"));
	}
	
	public WebElement txtCEP()
	{
		return getDriver().findElement(By.xpath("//*[@id='auto_order_flow_pricing_requirements_insured_person_attributes_address_attributes_zipcode']"));
	}
	
	public WebElement txtNeighborhood()
	{
		//return getDriver().findElement(By.xpath("//*[@id='auto_order_flow_pricing_requirements_insured_person_attributes_address_attributes_neighborhood']"));
		//return getDriver().findElement(By.name("auto_order_flow_pricing_requirements[insured_person_attributes][address_attributes][neighborhood]"));
		return getDriver().findElement(By.id("auto_order_flow_pricing_requirements_insured_person_attributes_address_attributes_neighborhood"));
	}
	
	public WebElement txtCity()
	{
		return getDriver().findElement(By.xpath("//*[@id='auto_order_flow_pricing_requirements_insured_person_attributes_address_attributes_city']"));
	}
	
	public WebElement txtStreet()
	{
		return getDriver().findElement(By.xpath("//*[@id='auto_order_flow_pricing_requirements_insured_person_attributes_address_attributes_street']"));
	}
	
	public WebElement txtComplement()
	{
		return getDriver().findElement(By.xpath("//*[@id='auto_order_flow_pricing_requirements_insured_person_attributes_address_attributes_complement']"));
	}
	
	public WebElement pickInsured()
	{
		return getDriver().findElement(By.cssSelector("#auto_order_flow_pricing_requirements_same_zipcode_insured_vehicle"));
	}
	
	public WebElement txtName()
	{
		return getDriver().findElement(By.id("auto_order_flow_pricing_requirements_insured_person_attributes_name"));
	}
	
	public WebElement txtCpf()
	{
		return getDriver().findElement(By.xpath("//*[@id='auto_order_flow_pricing_requirements_insured_person_attributes_cpf']"));
	}
	
	public WebElement pickGender()
	{
		return getDriver().findElement(By.xpath("//*[@id='auto_order_flow_pricing_requirements_insured_person_attributes_gender']"));
		
	}
	
	
	public WebElement txtDate()
	{
		return getDriver().findElement(By.id("auto_order_flow_pricing_requirements_insured_person_attributes_date_of_birth"));
		
	}
	
	public WebElement pickNationality()
	{
		return getDriver().findElement(By.cssSelector("#auto_order_flow_pricing_requirements_insured_person_attributes_nationality"));
	}
	
	public WebElement pickSalary()
	{
		return getDriver().findElement(By.id("auto_order_flow_pricing_requirements_insured_person_attributes_salary_range"));
	}
	
	public WebElement pickMarital()
	{
		return getDriver().findElement(By.cssSelector("#auto_order_flow_pricing_requirements_insured_person_attributes_marital_status"));
	}

	
	public WebElement pickInsurance()
	{
		return getDriver().findElement(By.cssSelector("#auto_order_flow_pricing_requirements_driver_attributes_has_insurance"));
	}
	
	public WebElement pickBonuses()
	{
		return getDriver().findElement(By.cssSelector("#auto_order_flow_pricing_requirements_driver_attributes_has_bonuses_class"));
	}
	
	public WebElement pickInsuredPerson()
	{
		return getDriver().findElement(By.cssSelector("#auto_order_flow_pricing_requirements_driver_attributes_same_as_insured_person"));
	}
	
	public WebElement pickYoungDriver()
	{
		return getDriver().findElement(By.id("auto_order_flow_pricing_requirements_driver_attributes_young_driver"));
	}
	
	public WebElement btnNextSecondStep()
	{
		return getDriver().findElement(By.cssSelector("input.button"));
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
