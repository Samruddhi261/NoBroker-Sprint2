package StepDefinition;

import java.awt.AWTException;
import java.net.MalformedURLException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DriverSetup.SetupDriver;
import Page.BuyPageFactory;
import Page.Login;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BuyStepDefinition {

	static WebDriver driver;
	Login log;
//	PostComment lp;
//	SearchProperty sp;
//	LoanTransfer lt;
//	ContactUs cu;
//	ShortlistProperty property;
	
	BuyPageFactory buy;
	
	
	@Given("User is on the homepage of NoBroker website")
	public void user_is_on_the_no_broker_website() throws InterruptedException {
		driver=SetupDriver.chromedriver();
	}
	

    //=====================================Scenario1=======================================
	
	
	@When("user selects the buy option")
	public void user_selects_the_buy_option()  {
		buy= new BuyPageFactory(driver);
		buy.buyclick();
	}

	@And("user selects the city name from the dropdown list")
	public void user_selects_the_city_name_from_the_dropdown_list() throws AWTException, InterruptedException {
		buy.selectCity();
	}

	@And("user types the localities")
	public void user_types_the_localities() throws InterruptedException, AWTException {
		buy.selectLocalities();
	}

	@And("User select a Full House radio button")
	public void user_select_a_full_house_radio_button() {
		buy.selectPropertyType();  
	}

	@And("user User selects BHK type from the dropdown list")
	public void user_user_selects_bhk_type_from_the_dropdown_list() throws InterruptedException, AWTException {
		buy.selectBHKType();
	}

	@And("User selects the property status from the dropdown list")
	public void user_selects_the_property_status_from_the_dropdown_list() throws AWTException, InterruptedException {
		buy.selectPropertyStatus();
	}

	@And("User clicks on checkbox for additional features")
	public void user_clicks_on_checkbox_for_additional_features() {
		buy.clickAdditionalFeaturesCheckbox();
	}

	@And("User clicks on the search button")
	public void user_clicks_on_the_search_button() throws InterruptedException {
		buy.search();
	}

	@Then("User should see a list of properties matching the search criteria")
	public void user_should_see_a_list_of_properties_matching_the_search_criteria(){
		String actual = driver.getCurrentUrl();
		String expected = "https://www.nobroker.in/new-projects?searchParam=W3sibGF0IjoxOS4yMTM5ODQsImxvbiI6NzIuODM3MzE1LCJwbGFjZUlkIjoiQ2hJSk1VYXEwYzIyNXpzUmdzWjI5akJvdzhrIiwicGxhY2VOYW1lIjoiS2FuZGl2YWxpIChXZXN0KSJ9XQ==&radius=20.0&city=mumbai&orderBy=priority,desc&nbFr=search_builder_list&type=BHK2&propertyStatus=READY&pageNo=1";
		Assert.assertEquals(expected, actual);
	}


    //=====================================Scenario2=======================================
	
	
	@When("User click on the Menu tab")
	public void user_click_on_the_menu_tab() throws InterruptedException {
		buy=new BuyPageFactory(driver);
		buy.clickMenuTab();
	}

	@And("User click on Blog option")
	public void user_click_on_blog_option() {
		buy.clickBlogOption();
	}

	@And("User click on P & M option")
	public void user_click_on_p_m_option()  {
		buy.clickPAndMOption();
		buy.scroll4();
	}

	@And("User select one of the project")
	public void user_select_one_of_the_project() {
		buy.selectProject1();
	}

	@And("user click on Comment option")
	public void user_click_on_comment_option()  {
		buy.clickCommentOption();
	}
	
	@And("^User post comment with (.*),(.*),(.*),(.*)$")
	public void user_post_comment_with(String Comment, String Name, String Email, String Website) throws InterruptedException{
		buy.enterCommentDetails(Comment, Name, Email, Website);
	}

	@And("User click on post comment")
	public void user_click_on_post_comment() throws InterruptedException {
		buy.scroll1();
		buy.clickPostCommentButton();
	}

	@Then("User should receive a confirmation message")
	public void user_should_receive_a_confirmation_message() throws InterruptedException {
		String text="Your comment is awaiting moderation. This is a preview; your comment will be visible after it has been approved.";
		 String msg1=buy.MessageDisplayed1();
		 Assert.assertEquals(text, msg1);
	}
	

    //=====================================Scenario3=========================================
	
		@When("User is on home loan page")
		public void user_looking_to_transfer_home_loan() {
			driver.get("https://www.nobroker.in/home-loan/balance-transfer/");
			buy=new BuyPageFactory(driver);
			buy.click1();
			
		}
		
		@And("User enter details with Name, Mobile Number, Outstanding Principal Amount and Current Interest Rate")
		public void user_enter_details_with_name_mobile_number_outstanding_principal_amount_and_current_interest_rate(io.cucumber.datatable.DataTable credentials) throws InterruptedException {
			List<List<String>> cells = credentials.cells();
			buy.enterName(cells.get(0).get(0), cells.get(0).get(1), cells.get(0).get(2), cells.get(0).get(3));
		}


		@And("User select Primary Bank Account")
		public void user_select_primary_bank_account() throws AWTException, InterruptedException {
			buy.tab();
			buy.selectPrimaryBankAccount();
		}

		
		@And("User click on submit button")
		public void user_click_on_submit_button() {
			buy.clickSubmitButton1();
		}

		@Then("User should see Congratulation! message")
		public void user_should_see_congratulation_message() throws InterruptedException {
		 String text="Loan application has been successfully submitted .";
		 String msg2=buy.MessageDisplayed2();
		 Assert.assertEquals(text, msg2);
			
		}
		
		
        //=====================================Scenario4=========================================
		
		
		@When("User click on Menu tab")
		public void user_click_on_menu_tab() throws InterruptedException {
			buy=new BuyPageFactory(driver);
			buy.clickMenuTab1();
		}

		@And("User click on the Blog option")
		public void user_click_on_the_blog_option() {
			buy.clickBlogOption1();
		}

		@And("User click on the NRI option")
		public void user_click_on_the_nri_option()  {
			buy.clickNriOption();
		}

		@And("User selects one of the project")
		public void user_selects_one_of_the_project() throws InterruptedException {
			buy.selectProjects();
			buy.scroll();
		}

		@When("^User enter their (.*)$")
		public void user_enter_their(String name) {
			buy.Name(name);
		}
		
		@And("User select City and Service")
		public void user_select_city_and_service(){
			buy.CityService();
		}
		
		@When("^User enters (.*) and (.*)$")
		public void user_enters_and(String mobile2, String email2) throws InterruptedException {
			buy.details(mobile2, email2);
		}
		
		@When("User click on Submit")
		public void user_click_on_submit() {
			buy.clickSubmitButton();
		}

		@Then("User should receive a confirmation message that Thanks for your Response")
		public void user_should_receive_a_confirmation_message_that_thanks_for_your_response() throws InterruptedException {
			String text="Thanks for your Response";
			 String msg=buy.MessageDisplayed3();
			 Assert.assertEquals(text, msg);
		}
		
        //=====================================Scenario5=======================================
			
		@When("user first login using id and password")
		public void user_first_login_using_id_and_password() throws InterruptedException {
			log = new Login(driver);
			log.userLogin(); 
		}

		@When("user navigate to the Property page")
		public void user_navigate_to_the_property_page() {
			driver.get("https://www.nobroker.in/new-projects?searchParam=W3sibGF0IjoxOS4xOTk4MjExLCJsb24iOjcyLjg0MjU5Mzk5OTk5OTk5LCJwbGFjZUlkIjoiQ2hJSkg3SUFIc2UyNXpzUkUxVlhmZld4ZFBvIiwicGxhY2VOYW1lIjoiS2FuZGl2YWxpIFdlc3QifV0=&radius=20.0&city=mumbai&orderBy=priority,desc&nbFr=search_builder_list&type=BHK2&propertyStatus=READY&pageNo=1&localityNearByPageNo=1");
		}

		@When("user clicks the wishlist option to add the property to their wishlist")
		public void user_clicks_the_wishlist_option_to_add_the_property_to_their_wishlist() throws InterruptedException {
			buy=new BuyPageFactory(driver);
			buy.clickOnshortlist();
		}

		@When("user clicks on My Dashboard and select shortlist")
		public void user_clicks_on_my_dashboard_and_select_shortlist() throws InterruptedException {
			buy.hover();
			buy.clickonmydashboard();
		}

		@When("user checks their shortlisted properties in their profile")
		public void user_checks_their_shortlisted_properties_in_their_profile() {
			buy.clickonyourShortlist();
			buy.clickonyourShortlisted();
		}

		@Then("selected property should be visible in the shortlist section")
		public void selected_property_should_be_visible_in_the_shortlist_section() throws InterruptedException {
			String actual = "";
			 String expected =buy.MessageDisplayed();
			 Assert.assertEquals(actual, expected);
			 
		}

		@AfterStep
		public static void takeScreendown(Scenario scenerio) {
			   TakesScreenshot ts= (TakesScreenshot) driver;
			   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
			   scenerio.attach(src, "image/png",scenerio.getName());
		}


}
