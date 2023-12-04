package juiceShop;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//public class juicoCode {
/*	WebDriver driver=new ChromeDriver();
	driver.get("https://juice-shop.herokuapp.com/#/login");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,500)");

	Thread.sleep(4000);
	WebElement dismiss=driver.findElement(By.xpath("//a[@class='cc-btn cc-dismiss']"));
	dismiss.click();
	
	WebElement pop=driver.findElement(By.xpath("//button[@class='mat-focus-indicator close-dialog mat-raised-button mat-button-base mat-primary ng-star-inserted']"));
	pop.click();
	//Maximize and scroll down
	
			WebElement link=driver.findElement(By.linkText("Not yet a customer?"));
			link.click();
			
			//send keys starts here
			WebElement email=driver.findElement(By.id("emailControl"));
			email.sendKeys("dummy4@gmail.com");
			WebElement pwd=driver.findElement(By.id("passwordControl"));
			pwd.sendKeys("Passcode");
			WebElement resetPwd=driver.findElement(By.id("repeatPasswordControl"));
			resetPwd.sendKeys("Passcode");
			WebElement securityQue = driver.findElement(By.xpath("//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c31-15 ng-star-inserted']"));
			securityQue.click();
	       	WebElement que = driver.findElement(By.xpath("//span[@class='mat-option-text']"));
	       	que.click();
	       	WebElement ans = driver.findElement(By.id("securityAnswerControl"));//mat-button-wrapper
	       	ans.sendKeys("dscsac");
	       	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	        js1.executeScript("window.scrollBy(0,500)");
	    	WebElement submit = driver.findElement(By.id("registerButton"));
	    	submit.click();
	    	System.out.println("vdsvs");
	    	
	    	WebElement customer=driver.findElement(By.linkText("Already a customer?"));
	    	customer.click();
	    	//login starts here
	    	WebElement emailLogin=driver.findElement(By.id("email"));
	    	//WebElement emailLogin = driver.findElement(By.xpath("//input[@class='\"mat-input-element mat-form-field-autofill-control ng-tns-c22-18 ng-pristine ng-invalid cdk-text-field-autofill-monitored ng-touched']"));
	    	//*[@id="email"]
	    	
	    	emailLogin.sendKeys("dummy4@gmail.com");
	    	System.out.println("Passcode");
	    	WebElement passLogin = driver.findElement(By.id("password"));
	    	passLogin.sendKeys("Passcode");
	    	WebElement logIn = driver.findElement(By.id("loginButton"));
	    	logIn.click();
	    	Thread.sleep(3000);
	    	// WebElement addCart = driver.findElement(By.cssSelector("mat-focus-indicator btn-basket mat-button mat-raised-button mat-button-base mat-primary ng-star-inserted"));
	    //	WebElement appleJuice=driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[1]/div/mat-card/div[2]/button/span[1]/span"));
	    	//appleJuice.click();
	  //  WebElement applePomace=driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[2]/div/mat-card/div[2]/button"));
	    //applePomace.click();
	    	WebElement bananaJuice=driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[3]/div/mat-card/div[2]/button"));
	    	bananaJuice.click();
	    	WebElement carrotJuice=driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[5]/div/mat-card/div[2]/button"));
	    	carrotJuice.click();
	    	WebElement eggFruitJuice=driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[6]/div/mat-card/div[2]/button"));
	    	eggFruitJuice.click();
	    	//WebElement fruitPress=driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[7]/div/mat-card/div[3]/button"));
	    	//fruitPress.click();
	    	//WebElement greenSmoothie=driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[8]/div/mat-card/div[2]/button"));
	    	//greenSmoothie.click();
	    	//WebElement lemonJuice=driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[10]/div/mat-card/div[2]/button"));
	    	//lemonJuice.click();
	    	//WebElement permaFrost=driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[1]/div/mat-card/div[2]/button"));
	    	//permaFrost.click();
	    	//Checkout
	    	System.out.println("defef");
	    	Thread.sleep(3000);
	    	JavascriptExecutor js11 = (JavascriptExecutor) driver;
	        // Scrolls up by 500 pixels vertically. You can adjust the value as needed.
	        js11.executeScript("window.scrollBy(0, -500)");
	    	WebElement shoppingCart=driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-navbar/mat-toolbar/mat-toolbar-row/button[4]/span[1]/mat-icon"));
	    	shoppingCart.click();
	    	System.out.println("defef2");
	    	JavascriptExecutor js12 = (JavascriptExecutor) driver;
	        // Scrolls up by 500 pixels vertically. You can adjust the value as needed.
	        js12.executeScript("window.scrollBy(0, 500)");
	        Thread.sleep(3000);
	    	WebElement checkOut=driver.findElement(By.id("checkoutButton"));
	    	checkOut.click();
	    	//Add new address
	    	Thread.sleep(3000);
	    	WebElement address=driver.findElement(By.xpath("//div[@id='card']/app-address/mat-card/div/button/span/mat-icon"));
	    	address.click();
	    	Thread.sleep(3000);
	    	WebElement country=driver.findElement(By.id("mat-input-9"));
	    	country.sendKeys("United States of America");
	    	WebElement name=driver.findElement(By.id("mat-input-10"));
	    	name.sendKeys("Jack");	
	    	WebElement phno=driver.findElement(By.id("mat-input-11"));
	    	phno.sendKeys("99999999");	
	    	WebElement zip=driver.findElement(By.id("mat-input-12"));
	    	zip.sendKeys("89654");	
	    	WebElement add=driver.findElement(By.id("address"));
	    	add.sendKeys("Bothell");
	    	WebElement city=driver.findElement(By.id("mat-input-14"));
	    	city.sendKeys("Redmond");	
	    	WebElement state=driver.findElement(By.id("mat-input-15"));
	    	state.sendKeys("Texas");	
	    	WebElement submits=driver.findElement(By.id("submitButton"));
	    	submits.click();
	    	Thread.sleep(5000);
	    	//WebDriverWait wait = new WebDriverWait(driver, 10);
	      //// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='mat-radio-45']/label/span[1]/span[1]")));
////*[@id="mat-radio-45"]/label/span[1]/span[1]
	       
	    	//WebElement radio1=driver.findElement(By.xpath("//*[@id='mat-radio-42']/label/span[1]/span[1]"));//*[@id="mat-radio-46"]/label/span[1]/span[2]
	    	//Thread.sleep(3000);
	    	//radio1.click();
	    WebElement radio1 = driver.findElement(By.xpath("//*[@id='mat-radio-47']/label/span[1]/span[1]")); //starts at 42addby 1
	    	((JavascriptExecutor)driver).executeScript("arguments[0].click();", radio1);
	    	
	    	//WebElement radio1 = driver.findElement(By.xpath("//*[@id='mat-radio-42']/label/span[1]/span[1]"));
	    	//((JavascriptExecutor) driver).executeScript("arguments[0].click();", radio1);
	    	//WebElement rad=driver.findElement(By.xpath("//*[@id=\"mat-radio-43\"]/label/span[1]/span[2]"));
	    	/*WebElement radio1 = driver.findElement(By.xpath("//*[@id='mat-radio-46']/label/span[1]/span[1]"));

	    	// Second radio button
	    	WebElement radio2 = driver.findElement(By.xpath("//*[@id='mat-radio-45']/label/span[1]/span[1]"));

	    	// Your condition to determine which radio button to click
	    	boolean condition = true/* Your condition here */

	    	/*if (condition) {
	    	    // Click on the first radio button
	    	    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radio1);
	    	} else {
	    	    // Click on the second radio button
	    	    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radio2);
	    	}
	    	*/

	    /*	WebElement cont=driver.findElement(By.xpath("//button[@class='mat-focus-indicator btn btn-next mat-button mat-raised-button mat-button-base mat-primary ng-star-inserted']"));
	    	cont.click();
	    	//WebElement standard = driver.findElement(By.xpath("//*[@id=\'mat-radio-61-input\']"));
	    	//((JavascriptExecutor)driver).executeScript("arguments[0].click();", standard);
	    	Thread.sleep(3000);
	    	WebElement standard = driver.findElement(By.id("mat-radio-54-input"));//46 addby 2
	    	((JavascriptExecutor)driver).executeScript("arguments[0].click();", standard);
	    	//Thread.sleep(3000);
	    //	WebElement standard=driver.findElement(By.id("mat-radio-51-input"));
	    	//standard.click();
	    	///html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-delivery-method/mat-card/div[4]/button[2]/span[1]/mat-icon
	    	WebElement del=driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-delivery-method/mat-card/div[4]/button[2]/span[1]/mat-icon"));
	    	del.click();
	    	driver.manage().deleteAllCookies();
	    	driver.get("https://juice-shop.herokuapp.com/#/payment/shop");
	    	System.out.println("sddsvd");
	    	System.out.println("Current URL: " + driver.getCurrentUrl());
	    	System.out.println("Current Title: " + driver.getTitle());
	    	Thread.sleep(3000);
	   // driver.get("https://juice-shop.herokuapp.com/#/payment/shop");
	    	WebElement newCard=driver.findElement(By.xpath("//*[@id=\"mat-expansion-panel-header-0\"]/span[2]"));
	    	newCard.click();
	    	Thread.sleep(2000);
	    	WebElement name1=driver.findElement(By.id("mat-input-16"));
	    	name1.sendKeys("Saranya");
	    	WebElement num1=driver.findElement(By.id("mat-input-17"));
	    	num1.sendKeys("1234567891234567");
	    	WebElement expDate=driver.findElement(By.id("mat-input-18"));
	    	expDate.sendKeys("1");
	    	WebElement expYear=driver.findElement(By.id("mat-input-19"));
	    	expYear.sendKeys("2024");
	    	WebElement addCard=driver.findElement(By.id("submitButton"));
	    	addCard.click();
	    	WebElement newCard1=driver.findElement(By.xpath("//*[@id=\"mat-expansion-panel-header-0\"]/span[2]"));
	    	newCard1.click();
	    	Thread.sleep(3000);
	    	WebElement addRadio = driver.findElement(By.id("mat-radio-56-input"));//starts with 56 addby 3
	    	((JavascriptExecutor)driver).executeScript("arguments[0].click();", addRadio);
	    	Thread.sleep(3000);
	    	/*WebElement addCoupon=driver.findElement(By.id("mat-expansion-panel-header-1"));//"mat-expansion-panel-header-1"
	    	addCoupon.click();
	    	Thread.sleep(3000);
	    	WebElement coupon=driver.findElement(By.id("coupon"));
	    	coupon.sendKeys("adbgjgdsef");
	    	//WebElement applycoupon=driver.findElement(By.id("applyCouponButton"));
	    	//applycoupon.click();
	    	//WebElement errormsg=driver.findElement(By.xpath("//div[class='error ng-star-inserted']"));
	    	//System.out.println("Error Message"+errormsg.getText());
	    //	JavascriptExecutor js2 = (JavascriptExecutor) driver;*/

	        // Scroll up the page
	        // The value 0 indicates scrolling to the top of the page
	    	//Thread.sleep(3000);
	    //	 driver.findElement(By.id("mat-radio-53-input")).sendKeys(Keys.HOME);
	     //   js2.executeScript("window.scrollTo(0,0)");
	        //Thread.sleep(3000);
	     //   WebElement element = driver.findElement(By.id("mat-radio-60-input"));
	       // js2.executeScript("arguments[0].scrollIntoView(true);", element);
	       // WebElement addRadio = driver.findElement(By.id("mat-radio-77-input"));
	    	//((JavascriptExecutor)driver).executeScript("arguments[0].click();", addRadio);
	    	//Thread.sleep(3000);
	    	//WebElement selectCard=driver.findElement(By.id("mat-radio-71-input"));
	    	//selectCard.click();
	    /*	JavascriptExecutor js3 = (JavascriptExecutor) driver;
	        js3.executeScript("window.scrollBy(0,600)");
Thread.sleep(3000);
driver.manage().deleteAllCookies();
Thread.sleep(3000);
	//	WebDriverWait wait = new WebDriverWait(driver, 10);
//WebElement finalCheckout = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='mat-button-wrapper']")));////*[@id="mat-expansion-panel-header-0"]/span[2]
//finalCheckout.click();
//WebDriverWait wait = new WebDriverWait(driver, 30);
//WebElement finalCheckout = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='mat-button-wrapper']")));
//finalCheckout.click();
	  // 	WebElement finalCheckout=driver.findElement(By.xpath("//span[@class='mat-button-wrapper']"));
	    //	finalCheckout.click();

WebDriverWait wait = new WebDriverWait(driver, 20);

try {
WebElement finalCheckout = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='mat-button-wrapper']")));
finalCheckout.click();
} catch (Exception e) {
System.out.println("TimeoutException: Element not clickable within the specified time");
// Handle the exception or add additional logging here
e.printStackTrace();
}
driver.get("https://juice-shop.herokuapp.com/#/order-summary");
System.out.println("dcdc");
WebElement pay=driver.findElement(By.xpath("//button[@class='mat-focus-indicator btn btn-pay mat-button mat-raised-button mat-button-base mat-primary']"));
	    	//WebElement pay=driver.findElement(By.id("checkoutButton"));
	    	pay.click();
	    	System.out.println("cghckj");
	    	
}

}

	

}*/