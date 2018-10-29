package GooglePages;

import static org.junit.Assert.assertTrue;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test {
	WebDriver driver;
	
	@Before
	public void SetUP() {
		driver=new ChromeDriver();
	}
	
	@After
	public void TearUpTheSeccion() {
		driver.close();
	}
	
	@Given("^User is on google home page$")
	public void user_is_on_google_home_page() {
		driver.get("http://www.google.com/");
	}

	@When("^User types ([^\"]*) and click the search button$")
	public void user_types_one_of_keywords_and_click_the_search_button(String keyword) {
		MainPage mainpage=new MainPage(driver);
		mainpage.Search(keyword);
	}

	@Then("^User checks if the titles of the websites listed contain ([^\"]*)$")
	public void user_checks_if_the_titles_of_the_websites_listed_contain_the_keyword(String keyword) {
		ResultPage resultpage=new ResultPage(driver);
		List<String> list=resultpage.checkTitles();
		list.forEach(x->assertTrue(x.toLowerCase().contains(keyword.toLowerCase())));
	}


	
}
