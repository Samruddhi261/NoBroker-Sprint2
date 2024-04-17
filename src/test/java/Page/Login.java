//
//package Page;
// 
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
// 
//public class Login {
// 
//	static WebDriver driver;
//	@FindBy(xpath="//div[@class=\"px-1p border-l-1 border-l-solid border-l-header-grey cursor-pointer\"]")
//	WebElement loginbtn;
//	@FindBy(xpath="//input[@id='signUp-phoneNumber']")
//	WebElement phoneno;
//	@FindBy(id="login-signup-form-login-radio-password")
//	WebElement passRadio;
//	@FindBy(id ="login-signup-form__password-input")
//	WebElement passinput ;
////	@FindBy(xpath="//div[@class=\"nb-switch-toggle xs\"]")
////	WebElement togglebtn;
//	@FindBy(id="signUpSubmit")
//	WebElement continuebtn;
//
// 
// 
//	//constructor
//	public Login(WebDriver driver) 
//	{
//				 this.driver=driver;
//				 PageFactory.initElements(driver, this);
//	}
//	public void userLogin() throws InterruptedException {
//		loginbtn.click();
////		driver.navigate().to("https://www.nobroker.in/#signup-login");
////        System.out.println(driver.getCurrentUrl());
//         Thread.sleep(2000);
//	 phoneno.click();	
//     phoneno.sendKeys("8698395423");
//     Thread.sleep(1000);
//     passRadio.click();
////     togglebtn.click();
//     Thread.sleep(1000);
//     passinput.sendKeys("samr3965");
//     Thread.sleep(1000);
//     continuebtn.click();
//    Thread.sleep(3000);
//
//
//	}
// 
//}




//package Page;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//public class Login {
//	WebDriver driver;
//	@FindBy(xpath="//div[@class=\"px-1p border-l-1 border-l-solid border-l-header-grey cursor-pointer\"]")
//	WebElement loginbtn;
//	@FindBy(xpath="//input[@placeholder=\"Enter Mobile Number\"]")
//	WebElement phoneno;
//	@FindBy(id="login-signup-form-login-radio-password")
//	WebElement passRadio;
////	@FindBy(xpath="//div[@class=\"nb-switch-toggle xs\"]")
////	WebElement togglebtn;
//	@FindBy(id="signUpSubmit")
//	WebElement continuebtn;
//	public Login(WebDriver driver) 
//	{
//		this.driver=driver;
//		PageFactory.initElements(driver, this);
//	}                        
//	public void userLogin() throws InterruptedException 
//	{
//		loginbtn.click();
// 
//		driver.navigate().to("https://www.nobroker.in/#signup-login");
//        Thread.sleep(2000);
//        phoneno.click();	
//        phoneno.sendKeys("7030026071");
//        Thread.sleep(15000);
// 
//        //passRadio.click();
////        togglebtn.click();
//        Thread.sleep(1000);
//        continuebtn.click();
////      driver.navigate().to("https://www.nobroker.in/");
//	}
//}
//


//package Page;
//
//import java.util.Set;
// 
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
// 
//public class Login {
//	static WebDriver driver;
//	@FindBy(xpath="//div[@class=\"px-1p border-l-1 border-l-solid border-l-header-grey cursor-pointer\"]")
//	WebElement loginbtn;
//	@FindBy(xpath="//input[@id='signUp-phoneNumber']")
//	WebElement phoneno;
//	@FindBy(id="login-signup-form-login-radio-password")
//	WebElement passRadio;
//	@FindBy(xpath="//div[@class=\"nb-switch-toggle xs\"]")
//	WebElement togglebtn;
//	@FindBy(id="signUpSubmit")
//	WebElement continuebtn;
//	//constructor
//	public Login(WebDriver driver) 
//	{
//				 this.driver=driver;
//				 PageFactory.initElements(driver, this);
//	}
// 
//	public void userLogin() throws InterruptedException {
//		loginbtn.click();
////		System.out.println(driver.getCurrentUrl());
//		//get the handle of main window
////		String mainWindowHandle = driver.getWindowHandle();
////
////        // Get the handles of all open windows
////        Set<String> allWindowHandles = driver.getWindowHandles();
////
////        // Switch to the popup window
////        for (String handle : allWindowHandles) {
////            if (!handle.equals(mainWindowHandle)) {
////                driver.switchTo().window(handle);
////                break;
////            }
////        }
//		driver.navigate().to("https://www.nobroker.in/#signup-login");
////        System.out.println(driver.getCurrentUrl());
// 
//         Thread.sleep(2000);
//	 phoneno.click();	
//     phoneno.sendKeys("7030026071");
//     Thread.sleep(1000);
//
//     //passRadio.click();
//     togglebtn.click();
//     Thread.sleep(30000);
//     continuebtn.click();
//     driver.navigate().to("https://www.nobroker.in/");
//
// 
//     
//
//	}
// 
//}


package Page;
 
import java.util.Set;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class Login {
	static WebDriver driver;
	@FindBy(xpath="//div[@class=\"px-1p border-l-1 border-l-solid border-l-header-grey cursor-pointer\"]")
	WebElement loginbtn;
	@FindBy(xpath="//input[@id='signUp-phoneNumber']")
	WebElement phoneno;
	@FindBy(id="login-signup-form-login-radio-password")
	WebElement passRadio;
	@FindBy(xpath="//div[@class=\"nb-switch-toggle xs\"]")
	WebElement togglebtn;
	@FindBy(id="signUpSubmit")
	WebElement continuebtn;
	@FindBy(xpath="//div[@class=\"flex ml-auto\"]//div")
	WebElement shortlist;
	@FindBy(xpath="//button[text()=\"Shortlist Project Now\"]")
	WebElement shortlistbtn;
	@FindBy(id="login-signup-form__password-input")
	WebElement password;
	//constructor
	public Login(WebDriver driver) 
	{
				 this.driver=driver;
				 PageFactory.initElements(driver, this);
	}
 
	public void userLogin() throws InterruptedException {
		loginbtn.click();
//		shortlist.click();
 
//		driver.navigate().to("https://www.nobroker.in/#signup-login");
 
 
         Thread.sleep(2000);
	 phoneno.click();	
     phoneno.sendKeys("8080191093");
//	 phoneno.sendKeys("7030026071");
     Thread.sleep(1000);

//     togglebtn.click();
     passRadio.click();

    password.sendKeys("Sarnk@1234");
//     password.sendKeys("samr3965");
     Thread.sleep(1000);
     continuebtn.click();
     Thread.sleep(2000);
//     shortlistbtn.click();
     //driver.navigate().to("https://www.nobroker.in/");

 
     

	}
 
}


