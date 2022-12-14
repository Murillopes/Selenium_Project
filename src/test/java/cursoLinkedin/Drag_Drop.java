package cursoLinkedin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://WebDrivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/dragdrop");
		driver.manage().window().maximize();
		
		WebElement image = driver.findElement(By.id("image"));
		WebElement box = driver.findElement(By.id("box"));
		
		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		actions.dragAndDrop(image, box).build().perform();
		
		

	}

}
