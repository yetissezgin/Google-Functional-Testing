package GooglePages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
	
	
	public MainPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID_OR_NAME, using="q")
	private WebElement searchingbox;
	
	
	public void Search(String keyword) 
	{
		searchingbox.sendKeys(keyword + Keys.ENTER);
	}
	
	
}
