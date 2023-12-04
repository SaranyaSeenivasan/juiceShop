package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testDemo {
	WebDriver driver=new ChromeDriver();;
	@Test
	public void register() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
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
	}
	@Test
	public void registerCustomer() throws InterruptedException {
		WebElement emailLogin=driver.findElement(By.id("email"));
    	//WebElement emailLogin = driver.findElement(By.xpath("//input[@class='\"mat-input-element mat-form-field-autofill-control ng-tns-c22-18 ng-pristine ng-invalid cdk-text-field-autofill-monitored ng-touched']"));
    	//*[@id="email"]
    	
    	emailLogin.sendKeys("dummy4@gmail.com");
    	System.out.println("Passcode");
    	WebElement passLogin = driver.findElement(By.id("password"));
    	passLogin.sendKeys("Passcode");
    	WebElement logIn = driver.findElement(By.id("loginButton"));
    	logIn.click();
		WebElement bananaJuice=driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[3]/div/mat-card/div[2]/button"));
    	bananaJuice.click();
    	//WebElement carrotJuice=driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[5]/div/mat-card/div[2]/button"));
    	//carrotJuice.click();
    	WebElement eggFruitJuice=driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[6]/div/mat-card/div[2]/button"));
    	eggFruitJuice.click();
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
	}
	
}
