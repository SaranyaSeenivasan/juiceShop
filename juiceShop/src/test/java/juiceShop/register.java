package juiceShop;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class register {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://juice-shop.herokuapp.com/#/login");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

		Thread.sleep(4000);
	//	void popup() {
		WebElement dismiss=driver.findElement(By.xpath("//a[@class='cc-btn cc-dismiss']"));
		dismiss.click();
		
		WebElement pop=driver.findElement(By.xpath("//button[@class='mat-focus-indicator close-dialog mat-raised-button mat-button-base mat-primary ng-star-inserted']"));
		pop.click();
	//	}
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
    	//Product locator
    	//String search1="Apple Juice(1000ml)";
    	//By productLocator1=By.xpath("//*[contains(text(), '" +search1+ "')]");
    	
   /* 	System.out.println("Saranya"+productLocator1);
    	//By productLocator1=By.xpath("//div[class='Apple Juice(1000ml)']");
    	By productLocator2=By.xpath("//div[class='Apple Pomace']");
    	By productLocator3=By.xpath("//div[class='Banana Juice(1000ml)']");
    	By productLocator4=By.xpath("//div[class='Apple Pomace(1000ml)']");
    	By productLocator5=By.xpath("//div[class='Carrot Juice(1000ml)']");
    	By productLocator6=By.xpath("//div[class='Eggfruit Juice (500ml)']");
    	By productLocator7=By.xpath("//div[class='Fruit Press']");
    	By productLocator8=By.xpath("//div[class='Green Smoothie']");
    	By productLocator9=By.xpath("//div[class='Juice Shop Permafrost 2020 Edision']");
    	By productLocator10=By.xpath("//div[class='Lemon Juice (500ml)']");
    	//By productLocator8=By.xpath("//div[class='Green Smoothie']");
    	
    	//Add to basket
    	//WebElement greenSmoothie=driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[1]/div/mat-card/div[2]/button"));
    	for (int i = 0; i < 2; i++) {
    		WebElement product=driver.findElement(productLocator1);
    		WebElement product1=driver.findElement(productLocator2);
    		WebElement product2=driver.findElement(productLocator3);
    		WebElement product3=driver.findElement(productLocator4);
    		WebElement product4=driver.findElement(productLocator5);
    		WebElement product5=driver.findElement(productLocator6);
    		WebElement product6=driver.findElement(productLocator7);
    		WebElement product7=driver.findElement(productLocator8);
    		WebElement product8=driver.findElement(productLocator9);*/
    		WebElement addAppleJuice=driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[8]/div/mat-card/div[2]/button"));
    		addAppleJuice.click(); 
    		WebElement addApplePomace=driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[2]/div/mat-card/div[2]/button"));
    		addApplePomace.click();
    		WebElement addBananaJuice=driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[3]/div/mat-card/div[2]/button"));
    		addBananaJuice.click();

    		WebElement addCarrotJuice=driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[5]/div/mat-card/div[2]/button"));
    		addCarrotJuice.click();

    		WebElement addEggFruitJuice=driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[6]/div/mat-card/div[2]/button"));
    		addEggFruitJuice.click();

    		WebElement addFruitPress=driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[7]/div/mat-card/div[2]/button"));
    		addFruitPress.click();

    		WebElement addGreenSmoothie=driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[8]/div/mat-card/div[2]/button"));
    		addGreenSmoothie.click();

    		WebElement addPermafrost=driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[9]/div/mat-card/div[3]/button"));
    		addPermafrost.click();

    		WebElement addLemonJuice=driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[10]/div/mat-card/div[2]/button"));
    		addLemonJuice.click();

    		//WebElement addPermafrost=product8.findElement(By.xpath(""));
    		
    		
    		/*addAppleJuice.click(); 
    		addApplePomace.click();
    		addBananaJuice.click();
    		addCarrotJuice.click();
    		addEggFruitJuice.click();
    		addFruitPress.click();
    		addGreenSmoothie.click();
    		addPermafrost.click();
    		addLemonJuice.click();
           
    	
    	
    	
    	
    	
    	
    /*	WebElement addCart=driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[8]/div/mat-card/div[2]/button"));
    	addCart.click();
    	WebElement greenSmoothie=driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[1]/div/mat-card/div[2]/button"));
    	greenSmoothie.click();
    	WebElement appleJuice=driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[1]/div/mat-card/div[2]/button"));
    	appleJuice.click();
    	WebElement carrotJuice=driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[1]/div/mat-card/div[2]/button"));
    	carrotJuice.click();
    	WebElement eggFruitJuice=driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[1]/div/mat-card/div[2]/button"));
    	eggFruitJuice.click();
    	WebElement fakeFruitJuice=driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[1]/div/mat-card/div[2]/button"));
    	fakeFruitJuice.click();
    	WebElement fakeBananaJuice=driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[1]/div/mat-card/div[2]/button"));
    	fakeBananaJuice.click();
    	WebElement fruitPress=driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[1]/div/mat-card/div[2]/button"));
    	fruitPress.click();
    	WebElement permaFrost=driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[1]/div/mat-card/div[2]/button"));
    	permaFrost.click();
    	System.out.println("afef");
	*/
		//driver.close();
		


	}

}
