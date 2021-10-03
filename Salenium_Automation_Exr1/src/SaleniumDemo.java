import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.util.*;

public class SaleniumDemo {

	public static void exerciseOne(WebDriver driver) throws InterruptedException {

		driver.findElement(By.xpath("//div[@id='radio-btn-example']/fieldset/label[1]/input")).click();
		Assert.assertTrue(
				driver.findElement(By.xpath("//div[@id='radio-btn-example']/fieldset/label[1]/input")).isSelected());
		Thread.sleep(3000L);
		driver.findElement(By.xpath("//div[@id='radio-btn-example']/fieldset/label[2]/input")).click();
		Thread.sleep(3000L);
		Assert.assertTrue(
				driver.findElement(By.xpath("//div[@id='radio-btn-example']/fieldset/label[2]/input")).isSelected());
		driver.findElement(By.xpath("//div[@id='radio-btn-example']/fieldset/label[3]/input")).click();
		Thread.sleep(3000L);
		Assert.assertTrue(
				driver.findElement(By.xpath("//div[@id='radio-btn-example']/fieldset/label[3]/input")).isSelected());

	}

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

	public static void exerciseThree(WebDriver driver) throws InterruptedException {

		WebElement selectDropdwn = driver.findElement(By.xpath("//*[@id='dropdown-class-example']"));
		Select options = new Select(selectDropdwn);
		selectDropdwn.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'dropdown-class-example\']/option[2]")).click();
		selectDropdwn.click();

	}

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

	public static void exerciseFourPointOne(WebDriver driver) throws InterruptedException {

		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).isSelected());
		Thread.sleep(1500);

	}

	public static void exerciseFourPointTwo(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).isSelected());
		Thread.sleep(1500);

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

			driver.close();
		}

		catch (InterruptedException e) {
			System.out.println(e);
		}

		// driver.close();
	}

}