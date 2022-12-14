package cursoLinkedin;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Modal_js {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://WebDrivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/modal");
		driver.manage().window().maximize();
		
		WebElement modal_button = driver.findElement(By.id("modal-button"));
		modal_button.click();
		
		WebElement close_button = driver.findElement(By.id("close-button"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", close_button);
		
		

	}

}
