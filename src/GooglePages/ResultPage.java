package GooglePages;

import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ResultPage {

	public ResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.CSS, using=".g h3")
	private List<WebElement> titles;
	
	public List checkTitles()
	{
		List titlelist=titles.stream().map(x-> x.getText())
			.collect(Collectors.toList());
		return titlelist;
	}
	
}
