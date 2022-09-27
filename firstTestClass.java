package ahmedSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTestClass {

	public static void main(String[] args) {
		System.setProperty ("webdriver.chrome.driver" , "D:\\Programs\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com");
		
		String actualURl = driver.getCurrentUrl();
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.id("username")).sendKeys("Test_N1");
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Forgot")).click();
		driver.findElement(By.id("username")).sendKeys("TEST_N2");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Test@2");
		driver.findElement(By.xpath("//button[@class='form__submit']")).click();
		
		
		if (actualURl.contentEquals("https://www.linkedin.com"))
		{
			System.out.println("URL TEST Pass");
			}
		else {
				
				System.out.println("URL TEST Fail");
			}
		String tilteTest = driver.getTitle();
		if (tilteTest.contentEquals("facebook"))
		{
			System.out.println("The Title Name Test pass");
		}
			else {
				System.out.println("The Title Name Test Fail");
			}
	}

}
