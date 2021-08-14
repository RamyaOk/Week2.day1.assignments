package week2.day1;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewFacebookAccountCreation {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver facebook =new ChromeDriver();
	    facebook.get("https://en-gb.facebook.com/");
	    String title = facebook.getTitle();
		System.out.println(title);
	    facebook.manage().window().maximize();
	    facebook.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	    
	    //locate and click create new account button
	    facebook.findElementByLinkText("Create New Account").click();
	    //confirm if it is sign up page
	    String Title= "Facebook – log in or sign up";
	    String HomeTitle = facebook.getTitle();
	    if (Title.equals(HomeTitle) ) {
	    	System.out.println("in sign up page");}
	    	else {
				System.out.println("not in sign up home page");
			}	
	    facebook.findElementByName("firstname").sendKeys("Ramya");
	    facebook.findElementByName("lastname").sendKeys("Cimbu");
	    facebook.findElementByName("reg_email__").sendKeys("ramyacimbu@gmail.com");
	    facebook.findElementByName("reg_email_confirmation__").sendKeys("ramyacimbu@gmail.com");
	    facebook.findElementById("password_step_input").sendKeys("Ramyacimbu@66");
	    
	    //locate web element(DOB drop down)
	    WebElement drop1 = facebook.findElementById("day");
	    //use select and create obj
	    Select drpDwn1 = new Select(drop1);
	    //Select drop down
	    drpDwn1.selectByIndex(17);
	    
	    WebElement drop2 = facebook.findElementByName("birthday_month");
	    Select drpDwn2 = new Select(drop2);
	    drpDwn2.selectByValue("7");
	    
	    WebElement drop3 = facebook.findElementById("year");
	    Select drpDwn3 = new Select(drop3);
	    drpDwn3.selectByVisibleText("1994");
	    
	    WebElement radio = facebook.findElement(By.className("_5k_3"));
	    radio.click();
	    {
	    	System.out.println("Female");
	    }
	    
	    facebook.findElement(By.className("_1lch")).click();
	    facebook.findElementByName("code").sendKeys("49475");
	    facebook.findElement(By.name("confirm")).click();
	    facebook.findElement(By.className("_42ft _42fu layerCancel uiOverlayButton selected _42g- _42gy")).click();
 
	}

}
