package Week2Day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leafground.com/home.html");
		driver.findElement(By.linkText("Drop down")).click();
		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		Select text = new Select(dropdown1);
		text.selectByVisibleText("Selenium");
		WebElement dropdown2 = driver.findElement(By.name("dropdown2"));
		Select text1 = new Select(dropdown2);
		text1.selectByVisibleText("Appium");
		WebElement dropdown3 = driver.findElement(By.name("dropdown3"));
		Select text2 = new Select(dropdown3);
		text2.selectByVisibleText("UFT/QTP");
		WebElement dropdown4 = driver.findElement(By.xpath("//option[text()='Get the number of dropdown options']/.."));
		Select text3 = new Select(dropdown4);
		text3.selectByVisibleText("Loadrunner");
		WebElement dropdown5 = driver.findElement(By.xpath("//option[text()='You can also use sendKeys to select']/.."));
		Select text4 = new Select(dropdown5);
		text4.selectByVisibleText("UFT/QTP");
		WebElement dropDown6 = driver.findElement(By.xpath("//option[text()='Select your programs']/.."));
        Select value = new Select(dropDown6);
        value.selectByValue("1");
	}

}
