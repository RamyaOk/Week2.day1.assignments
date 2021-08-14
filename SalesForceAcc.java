package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceAcc {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver salesforce = new ChromeDriver();
		salesforce.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		salesforce.manage().window().maximize();
		salesforce.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS );
		salesforce.findElement(By.name("UserFirstName")).sendKeys("Ramya");
		salesforce.findElement(By.name("UserLastName")).sendKeys("OK");
		salesforce.findElement(By.name("UserEmail")).sendKeys("okramyaksr@gmail.com");
		WebElement drop1 = salesforce.findElement(By.name("UserTitle"));
		Select drpDwn1 =new Select(drop1);
		drpDwn1.selectByValue("IT_Manager_AP");
		salesforce.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
		WebElement drop2 =salesforce.findElement(By.name("CompanyEmployees"));
		Select drpDwn2 =new Select(drop2);
		drpDwn2.selectByIndex(4);
		salesforce.findElement(By.name("UserPhone")).sendKeys("9994148985");
		WebElement drop3 = salesforce.findElement(By.name("CompanyCountry"));
		Select drpDwn3 = new Select(drop3);
		drpDwn3.selectByVisibleText("India");
		salesforce.findElement(By.className("checkbox-ui")).click();
		salesforce.close();
		
		
		

	}

}
