package Page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuyPageFactory {
	WebDriver driver;
	WebDriverWait wait;
	
    //============================  XPATH FOR LOCATING THE ELEMENT ==================================
	
	//========================================  Scenario1  ==========================================
	
	@FindBy(xpath="//div[text()=\"Buy\"]" )
	WebElement Buy;
	
	@FindBy(xpath = "//div[@class=\"css-1hwfws3 nb-select__value-container nb-select__value-container--has-value\"]")
    WebElement City;

    @FindBy(id= "BUY")
	WebElement propertyTypeDropdown;
    
    @FindBy(xpath="(//div[@class=\"css-16pqwjk-indicatorContainer nb-select__indicator nb-select__dropdown-indicator\"])[2]" )
    WebElement bhkTypeDropdown;
    
    @FindBy(xpath = "//div[text()=\"Ready\"]")
	WebElement propertyStatusDropdown;
	
	@FindBy(xpath = "//span[text()=\"New Builder Projects\"]")
	WebElement additionalFeaturesCheckbox;
	
	@FindBy(xpath = "//button[@class=\"prop-search-button flex items-center justify-center btn btn-primary btn-lg\"]")
	WebElement searchButton;
	
	
	//========================================  Scenario2  ==========================================
	
	@FindBy(xpath ="//img[@alt=\"hamburger\"]")
	WebElement menuTab1;
	
	@FindBy(xpath = "//a[text()=\"Blog\"]")
	WebElement blogOption1;
	
	@FindBy(xpath = "//a[text()=\"P & M\"]")
	WebElement packandmove;
	
	@FindBy(xpath = "//a[text()=\"Griha Pravesh Muhurat in April 2024: Month Wise Date & Time\"]")
	WebElement shiftingpackage;
	
	@FindBy(xpath = "//div[@class=\"userCommnet\"]")
	WebElement comment;
	
	@FindBy(xpath = "//em[@class=\"comment-awaiting-moderation\"]")
	WebElement msg1;
	
	@FindBy(xpath = "//textarea[@id=\"comment\"]")WebElement comments;
	@FindBy(xpath = "//input[@placeholder=\"Name*\"]")WebElement name;
	@FindBy(xpath = "//input[@placeholder=\"Email*\"]")WebElement email;
	@FindBy(xpath = "//input[@placeholder=\"Website\"]")WebElement website;
	@FindBy(xpath = "//input[@type=\"submit\"]")WebElement postcomment;
	
	
	//========================================  Scenario3  ==========================================
	
	@FindBy(xpath="//img[@alt=\"Mumbai\"]")
	WebElement location;

	@FindBy(xpath="(//input[@class=\"nb__3XfJn\"])[1]" )
	WebElement Name;
	
	@FindBy(xpath="(//input[@class=\"nb__3XfJn\"])[2]" )
	WebElement MobileNumber;
	
	@FindBy(xpath="(//input[@class=\"nb__3XfJn\"])[3]" )
	WebElement PrincipalAmount;
	
	@FindBy(xpath="(//input[@class=\"nb__3XfJn\"])[4]" )
	WebElement InterestRate;
	
	
	@FindBy(xpath="(//div[@class=\"nb__3z8Y5\"])[2]" )
	WebElement DropDownbtn;
	
	@FindBy(xpath="//div[text()=\"ICICI Bank\"]" )
	WebElement BankAccount ;
	
	@FindBy(xpath="//button[text()=\"Submit\"]" )
	WebElement Submit;
	
	@FindBy(xpath="//p[@class=\"nb__2AOFV\"]" )
	WebElement msg2;
	
	
	
	//========================================  Scenario4  ==========================================
	
	@FindBy(xpath ="//img[@alt=\"hamburger\"]")
	WebElement menuTab;
	
	@FindBy(xpath = "//a[text()=\"Blog\"]")
	WebElement blogOption;
	
	@FindBy(xpath = "//a[@title=\"NRI\"]")
    WebElement nriOption;
    
    @FindBy(xpath = "//a[text()=\"Essential Legal Services for NRIs: A Comprehensive Run Guide\"]")
    WebElement projectSelection;
    
    @FindBy(xpath = "(//input[@placeholder=\"Name\"])[3]")
    WebElement nameInput;
    
    @FindBy(xpath = "(//select[@title=\"Choose a City\"])[2]")
    WebElement cityInput;
    
    @FindBy(xpath = "(//select[@title=\"Choose a Service\"])[2]")
    WebElement service;
    
    @FindBy(xpath = "(//input[@placeholder=\"Mobile Number\"])[3]")
    WebElement mobileInput;
    
    @FindBy(xpath = "(//input[@placeholder=\"Email Id\"])[3]")
    WebElement email1;
    
    @FindBy(xpath= "(//input[@class=\"input_tags_btn_sidebar\"])[2]")
    WebElement submitButton;
    
    @FindBy(xpath = "//p[text()=\"Thanks for your Response\"]")
    WebElement msg;
    
	
  //========================================  Scenario5  ==========================================
    
    @FindBy(xpath="(//div[@class=\"flex flex-2 flex-col py-1.5 px-2.5 cursor-pointer tp:p-2.5 custom-content nb__wgqfs\"])[1]")
	WebElement property;
	
	@FindBy(xpath="//div[@class=\"flex ml-auto\"]//div")
	WebElement wishlist;
			
	@FindBy(xpath="//div[@class=\"flex items-center justify-center p-0.8p relative focus:outline-none\"]//span[@class=\"whitespace-nowrap truncate overflow-hidden max-w-10p text-header-text-color\"]")
	WebElement hoverprofile;			
	
	@FindBy(xpath="//span[text()=\"My Dashboard\"]")
	WebElement mydashboard;
	
	@FindBy(xpath="//a[text()=\"Shortlist\"]")
	WebElement shortlist;
	
	@FindBy(xpath="(//div[@class=\"summary_count\"])[2]")
	WebElement shortlisted;
	
	@FindBy(xpath="(//h1[text()=\"Lotus Sky Garden\"])[1]")
	WebElement msg3;
	
	
	//Constructor to initialize the driver and Page Factory
	
	public BuyPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	//----------------------------/*METHODS FOR LOCATING THE ELEMENT*/-------------------------------
	
	//========================================  Scenario1  ==========================================
	
	public void buyclick() 
    {
	Buy.click();	
	}    
    
	public void selectCity() throws AWTException 
	{
	 City.click();
	
	 Robot robot = new Robot();
	  robot.keyPress(KeyEvent.VK_UP);
	  robot.keyRelease(KeyEvent.VK_UP);
	  
	  robot.keyPress(KeyEvent.VK_UP);
	  robot.keyRelease(KeyEvent.VK_UP);
	  
	  robot.keyPress(KeyEvent.VK_ENTER);  
	  robot.keyRelease(KeyEvent.VK_ENTER);
	  
	  robot.keyPress(KeyEvent.VK_TAB);
	  robot.keyRelease(KeyEvent.VK_TAB);
	}
	  
	  public void selectLocalities() throws InterruptedException, AWTException {
		  Robot robot = new Robot();
	  driver.findElement(By.id("listPageSearchLocality")).sendKeys("Kandivali West");
	  Thread.sleep(1000);
	  robot.keyPress(KeyEvent.VK_DOWN);
	  robot.keyRelease(KeyEvent.VK_DOWN);
	  
	  robot.keyPress(KeyEvent.VK_DOWN);
	  robot.keyRelease(KeyEvent.VK_DOWN);
	 
	  robot.keyPress(KeyEvent.VK_ENTER); 
	  robot.keyRelease(KeyEvent.VK_ENTER);
	  Thread.sleep(1000); 
	  }
	  
	
	
	public void selectPropertyType() {
	    propertyTypeDropdown.click();
	}

	public void selectBHKType() throws InterruptedException, AWTException {
	    bhkTypeDropdown.click(); 
		
		  Robot robot = new Robot();
		  robot.keyPress(KeyEvent.VK_DOWN);
		  robot.keyRelease(KeyEvent.VK_DOWN);
		  Thread.sleep(1000);
		  robot.keyPress(KeyEvent.VK_DOWN);
		  robot.keyRelease(KeyEvent.VK_DOWN);
		  Thread.sleep(1000);
		  robot.keyPress(KeyEvent.VK_ENTER);  
		  robot.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(1000);
		  
		  bhkTypeDropdown.click(); 
	}
	
	public void selectPropertyStatus() throws AWTException, InterruptedException {
	    propertyStatusDropdown.click(); 
	    
	    Robot robot = new Robot();
		  robot.keyPress(KeyEvent.VK_DOWN);
		  robot.keyRelease(KeyEvent.VK_DOWN);
		  robot.keyPress(KeyEvent.VK_ENTER);  
		  robot.keyRelease(KeyEvent.VK_ENTER);
		  
		  propertyStatusDropdown.click(); 
	}

	public void clickAdditionalFeaturesCheckbox() {
	    additionalFeaturesCheckbox.click();
	}

	public void search() 
    {
	  searchButton.click();	
	}
	
	
	//========================================  Scenario2  ==========================================
	
	public void clickMenuTab() throws InterruptedException {
	    menuTab.click();
	    Thread.sleep(1000);
	}
	
	public void scroll3() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scroll(0,200)");
	}
	
	public void clickBlogOption()  {
		wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.elementToBeClickable(blogOption));
	    blogOption.click();
	}
	
	public void clickPAndMOption() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.elementToBeClickable(packandmove));
		packandmove.click();
    }
	
	public void scroll4() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scroll(0,200)");
	}

    public void selectProject1() {
    	wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.elementToBeClickable(shiftingpackage));
    	shiftingpackage.click();
    }

    public void clickCommentOption() {
    	wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.elementToBeClickable(comment));
    	comment.click();
    }

    public void enterCommentDetails(String commentTitle, String name1, String email1, String web) throws InterruptedException {
        comments.sendKeys(commentTitle);
        Thread.sleep(1000);
        name.sendKeys(name1);
        Thread.sleep(1000);
        email.sendKeys(email1);
        Thread.sleep(1000);
        website.sendKeys(web);
        Thread.sleep(1000);
    }
    
    public void scroll1() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scroll(0,10000)");
	}

    public void clickPostCommentButton() {
    	wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.elementToBeClickable(postcomment));
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", postcomment);
    }

    public String MessageDisplayed1() throws InterruptedException {
    	Thread.sleep(6000);
    	return msg1.getText();
    }
    
    
    
  //========================================  Scenario3  ==========================================
    
    public void click1() {
    	wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.elementToBeClickable(location));
		location.click();
    }
	
	public void enterName(String name,String mobileNumber,String amount,String interestRate) throws InterruptedException {
		Name.sendKeys(name);
		MobileNumber.sendKeys(mobileNumber); 
		PrincipalAmount.sendKeys(amount);
		InterestRate.sendKeys(interestRate);
		Thread.sleep(1000);
    }
	
	public void tab() throws AWTException {
		Robot robot = new Robot();
		  robot.keyPress(KeyEvent.VK_TAB);
		  robot.keyRelease(KeyEvent.VK_TAB);
	}

    public void selectPrimaryBankAccount() throws InterruptedException {
    	DropDownbtn.click();
  	    Thread.sleep(1000); 
    	BankAccount.click();
  	    Thread.sleep(1000); 
    }
	
    public void clickSubmitButton1(){
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Submit);
    }
    
    public String MessageDisplayed2() throws InterruptedException {
//    	Thread.sleep(6000);
    	wait = new WebDriverWait(driver,Duration.ofSeconds(6));
	    wait.until(ExpectedConditions.elementToBeClickable(msg2));
    	return msg2.getText();
    }
    
    
    
    //========================================  Scenario4  ==========================================
    
    public void clickMenuTab1() throws InterruptedException {
	    menuTab.click();
	    Thread.sleep(1000);
	}
	
	public void clickBlogOption1() {
	    blogOption.click();
	}
	
	public void clickNriOption() {
        nriOption.click();
    }
    
    public void selectProjects() throws InterruptedException {
    	projectSelection.click();
  	    Thread.sleep(1000);  
    }
    
    public void scroll() {
  		JavascriptExecutor js=(JavascriptExecutor)driver;
  	    js.executeScript("window.scroll(0,800)");
  	}
    
    public void Name(String name)  {
        nameInput.sendKeys(name);
    }
    
    public void CityService() {
    	Select select=new Select(cityInput);
    	select.selectByVisibleText("Mumbai");
    	
    	Select select1=new Select(service);
    	select1.selectByVisibleText("Buy Property");
    }
    
    public void details(String mobile, String email2) throws InterruptedException {
        mobileInput.sendKeys(mobile);
        Thread.sleep(1000);
        email1.sendKeys(email2);
   }
    
    public void clickSubmitButton() {
//        submitButton.click();
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", submitButton);
        
    }
    
    public String MessageDisplayed3() throws InterruptedException {
    	Thread.sleep(6000);
    	return msg.getText();
    }
    
    
    
    //========================================  Scenario5  ==========================================
    
    public void clickOnshortlist() throws InterruptedException {
		wishlist.click();
		Thread.sleep(1000);
    }
	
	public void hover() throws InterruptedException {
		Actions act=new Actions(driver);
		act.moveToElement(hoverprofile).build().perform();
		Thread.sleep(1000);
	}
	
	public void clickonmydashboard() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("arguments[0].click();",mydashboard );
		   Thread.sleep(1000);
    }
	
	public void clickonyourShortlist(){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("arguments[0].click();", shortlist);
    }
	
	public void clickonyourShortlisted(){
			   JavascriptExecutor js = (JavascriptExecutor) driver;
			   js.executeScript("arguments[0].click();", shortlisted);
	    }
	
	
	public String MessageDisplayed(){
//    	Thread.sleep(6000);
    	return msg3.getText();
    }
	
}
