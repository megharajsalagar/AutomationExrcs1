
/*Author: Megharaj Salagar
  Date: 01/10/2021
*/
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class SaleniumDemo {

	/*
	 * Method Name :exerciseOne Date:01/10/2021
	 */
	public static void exerciseOne(WebDriver driver) throws InterruptedException {

		driver.findElement(By.xpath("//div[@id='radio-btn-example']/fieldset/label[1]/input")).click();
		Assert.assertTrue(
				driver.findElement(By.xpath("//div[@id='radio-btn-example']/fieldset/label[1]/input")).isSelected()); //verifying using assertions
		Thread.sleep(3000L);
		driver.findElement(By.xpath("//div[@id='radio-btn-example']/fieldset/label[2]/input")).click();
		Thread.sleep(3000L);
		Assert.assertTrue(
				driver.findElement(By.xpath("//div[@id='radio-btn-example']/fieldset/label[2]/input")).isSelected());//verifying using assertions
		driver.findElement(By.xpath("//div[@id='radio-btn-example']/fieldset/label[3]/input")).click();
		Thread.sleep(3000L);
		Assert.assertTrue(
				driver.findElement(By.xpath("//div[@id='radio-btn-example']/fieldset/label[3]/input")).isSelected());//verifying using assertions

	}
	
	/*
	 * Method Name :exerciseTwo Date:01/10/2021
	 */

	public static void exerciseTwo(WebDriver driver) throws InterruptedException {

		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("United States");
		Thread.sleep(1200L);
		List<WebElement> countryLists = driver.findElements(By.xpath("//li[@class='ui-menu-item']/div"));

		for (WebElement countryList : countryLists) {
			if (countryList.getText().toString().equalsIgnoreCase("United States Minor Outlying Islands")) {
				countryList.click();
				Thread.sleep(1500L);
				break;
			}
		}

	}
	
	/*
	 * Method Name :exerciseThree Date:01/10/2021
	 */

	public static void exerciseThree(WebDriver driver) throws InterruptedException {

		WebElement selectDropdwn = driver.findElement(By.xpath("//*[@id='dropdown-class-example']"));
		Select options = new Select(selectDropdwn);
		selectDropdwn.click();
		Thread.sleep(2000);
		options.selectByIndex(1);
		selectDropdwn.click();
		Thread.sleep(2000);
		selectDropdwn.click();
		String s=options.getFirstSelectedOption().getText();
		Assert.assertEquals("Option1",s);
		Thread.sleep(2000);
		options.selectByIndex(2);
		selectDropdwn.click();
		Thread.sleep(2000);
		selectDropdwn.click();
		options.getFirstSelectedOption();
		Thread.sleep(2000);
		options.selectByIndex(3);
		selectDropdwn.click();
		Thread.sleep(2000);
		selectDropdwn.click();
		options.getFirstSelectedOption();
		Thread.sleep(2000);
		selectDropdwn.click();
		

	}

	/*
	 * Method Name :exerciseFour Date:01/10/2021
	 */
	
	public static void exerciseFour(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();// for selecting checkbox1
		Thread.sleep(500L);
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		Thread.sleep(500L);
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected()); // for
																											// selecting
																											// checkbox1
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		Thread.sleep(500L);
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		Thread.sleep(500L);
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected()); // for
																											// selecting
																											// checkbox1
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		Thread.sleep(500L);
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		Thread.sleep(500L);
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).isSelected()); // closing
																											// driver
	}
	
	/*
	 * Method Name :exerciseFourPointOne Date:01/10/2021
	 */

	public static void exerciseFourPointOne(WebDriver driver) throws InterruptedException {

		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).isSelected());
		Thread.sleep(1500);

	}

	/*
	 * Method Name :exerciseFourPointTwo Date:04/10/2021
	 */
	
	public static void exerciseFourPointTwo(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).isSelected());
		Thread.sleep(1500);

	}
	
	/*
	 * Method Name :exerciseFive Date:04/10/2021
	 */
	
	public static void exerciseFive(WebDriver driver)  throws InterruptedException {
		
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.xpath("//*[@id='openwindow']")).click(); 
		  Set<String> Windows = driver.getWindowHandles();
		  
		  Iterator<String> it =Windows.iterator();  
		  String parentid=it.next();
		  Thread.sleep(5000); driver.switchTo().window(parentid);
		  
		/*
		 * driver.findElement(By.xpath("//*[@id='openwindow']")).click(); String
		 * handler=driver.getWindowHandle(); Thread.sleep(3000); //driver.close();
		 * driver.switchTo().window(handler).close(); Thread.sleep(2000);
		 */
	}
	
	/*
	 * Method Name :exerciseSix Date:04/10/2021
	 */
	
	public static void exerciseSix(WebDriver driver) throws InterruptedException{
		  driver.findElement(By.xpath("//*[@id='opentab']")).click(); 
		  Set<String>Windows = driver.getWindowHandles();
		  Iterator<String> it =Windows.iterator(); 
		  String parentid =it.next();
		  Thread.sleep(3000); 
		  String child=it.next();
		  driver.switchTo().window(child);
		  Thread.sleep(3000); 
		  driver.close();
		
	}
	
	/*
	 * Method Name :exerciseSeven Date:04/10/2021
	 */
	
	public static void exerciseSeven(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='name']")).sendKeys("John");
		driver.findElement(By.xpath("//*[@id='alertbtn']")).click();
		Thread.sleep(3000);
		driver.close();
	}


	/*
	 * Method Name :exerciseEight Date:04/10/2021
	 */
	
	public static void exerciseEight(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Qualitest\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php ");

		try {
			SaleniumDemo.exerciseOne(driver);
			SaleniumDemo.exerciseTwo(driver);
			SaleniumDemo.exerciseThree(driver);
			SaleniumDemo.exerciseFour(driver);
			SaleniumDemo.exerciseFourPointOne(driver);
			SaleniumDemo.exerciseFourPointTwo(driver);
			SaleniumDemo.exerciseFive(driver);
			SaleniumDemo.exerciseSix(driver);
			SaleniumDemo.exerciseSeven(driver);
			SaleniumDemo.exerciseEight(driver);
			driver.close();
		}

		catch (InterruptedException e) {
			System.out.println(e);
		}
		
	}

}
