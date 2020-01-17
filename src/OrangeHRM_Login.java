import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_Login {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//get the path of java with script.
	 

		String driverPath = System.getProperty("user.dir") + "\\src\\Browser_Driver\\chromedriver.exe";
				System.out.println(driverPath);
				System.setProperty("webdriver.chrome.driver", driverPath);
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.navigate().to("https://opensource-demo.orangehrmlive.com");
				
				//driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
				//driver.findElement(By.xpath("//div[text()='LOGIN Panel']"))
				WebElement elm = driver.findElement(By.xpath("//a[text()='Forgot your password?']"));
				boolean res= elm.isDisplayed();
				System.out.println(res);
				
	
				if(res)
				{
					elm.click();
				}
				
				
				
				
				//Thread.sleep(3000);
				//driver.close();
				//driver.quit();
				
				// int count = driver.findElements(By.className("textInputContainer"))
					//.size();//2
			
			//driver.findElements(By.className("textInputContainer"))
			//.get(0).sendKeys("Admin");
//			int x = driver.findElements(By.className("login_form_input_box")).size();		
//			
//			System.out.println(x);
			//driver.findElements(By.className("login_form_input_box"))
			//.get(1).sendKeys("password");
				
				
				
				
				
				
				//driver.get("https://opensource-demo.orangehrmlive.com/");
					//	driver.quit();
				//driver.close();
					//driver.navigate().to("https://www.facebook.com/");
//verify title of an app
				//String expectedTitle ="OrangeHRM";
				//String actualTitle = driver.getTitle();
				//System.out.println(actualTitle);
			//	if(expectedTitle.equalsIgnoreCase(actualTitle)) {
				//	System.out.println("Title Matched");
			//	}
			//	else
			//	{
				//	System.out.println("not matched");
					
			//	}
			//	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				//driver.findElement(By.id("txtPassword")).sendKeys("Admin123");
				//driver.findElement(By.id("btnLogIn")).click();
				//driver.findElement(By.name("submit")).click();
				//driver.findElement(By.linkText("forgot your password"));
				//driver.findElement(By.partialLinkText("forgot your password")).click();
				
				
				
				
				
	}

}
