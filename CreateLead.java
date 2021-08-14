package week2.day1;

import java.lang.reflect.Type;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver lead =new ChromeDriver();
		lead.get("http://leaftaps.com/opentaps/control/login");
		lead.findElement(By.id("username")).sendKeys("demosalesmanager");
		lead.findElement(By.id("password")).sendKeys("crmsfa");
		lead.findElement(By.className("decorativeSubmit")).click();
		lead.findElement(By.linkText("CRM/SFA")).click();
		//create lead
		lead.findElement(By.linkText("Create Lead")).click();
		lead.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		lead.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramya");
		lead.findElement(By.id("createLeadForm_lastName")).sendKeys("OK");
		WebElement drop1 = lead.findElement(By.id("createLeadForm_dataSourceId"));
		Select drpDwn1 =new Select(drop1);
		drpDwn1.selectByValue("LEAD_EMPLOYEE");
		WebElement drop2 = lead.findElement(By.name("marketingCampaignId"));
		Select drpDwn2 =new Select(drop2);
		drpDwn2.selectByIndex(7);
		lead.findElement(By.name("firstNameLocal")).sendKeys("Rams");
		lead.findElement(By.name("lastNameLocal")).sendKeys("ok");
		lead.findElement(By.name("personalTitle")).sendKeys("xyz");
		lead.findElement(By.name("birthDate")).sendKeys("07/16/94");
		lead.findElement(By.name("generalProfTitle")).sendKeys("Selenium Learner");
		lead.findElement(By.name("departmentName")).sendKeys("Selenium-Java");
		lead.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("736");
		WebElement drop3 = lead.findElement(By.name("currencyUomId"));
		Select drpDwn3 =new Select(drop3);
		drpDwn3.selectByValue("INR");
		WebElement drop4 = lead.findElement(By.name("industryEnumId"));
		Select drpDwn4 =new Select(drop4);
		drpDwn4.selectByIndex(4);
		lead.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("1500");
		WebElement drop5 = lead.findElement(By.name("ownershipEnumId"));
		Select drpDwn5 =new Select(drop5);
		drpDwn5.selectByVisibleText("S-Corporation");
		lead.findElement(By.id("createLeadForm_sicCode")).sendKeys("88575867867");
		lead.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("dfyu-d75");
		lead.findElement(By.name("description")).sendKeys("Learn selenium-java for better growth");
		lead.findElement(By.name("importantNote")).sendKeys("Remember Java Keywords");

		//contact info
		WebElement countryCode=lead.findElement(By.name("primaryPhoneCountryCode"));
		countryCode.clear();
		countryCode.sendKeys("2");
		lead.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("678766");
		lead.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9994148985");
		lead.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("5014");
		lead.findElement(By.name("primaryPhoneAskForName")).sendKeys("Ramya");
		lead.findElement(By.name("primaryEmail")).sendKeys("okramyaksr@gmail.com");
		lead.findElement(By.name("primaryWebUrl")).sendKeys("www.abc.com");
		
		//primary address
		lead.findElement(By.id("createLeadForm_generalToName")).sendKeys("Ramya");
		lead.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Cimbu");
		lead.findElement(By.name("generalAddress1")).sendKeys("14a 3rd cross street");
		lead.findElement(By.name("generalAddress2")).sendKeys("Poonamallee");
		lead.findElement(By.name("generalCity")).sendKeys("Chennai");
		WebElement drop6 = lead.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select drpDwn6 =new Select(drop6);
		drpDwn6.selectByVisibleText("84057");
		lead.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600056");
		WebElement drop7 = lead.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select drpDwn7 =new Select(drop7);
		drpDwn7.selectByValue("IND");
		lead.findElement(By.name("generalPostalCodeExt")).sendKeys("48975");
		
		//print 1st name
		WebElement mytext = lead.findElement(By.id("createLeadForm_firstName"));
		String text = mytext.getText();
		System.out.println("First name is : " + text);
		
		//click on create lead button
		lead.findElement(By.className("smallSubmit")).click();
		WebElement Title = lead.findElement(By.className("smallSubmit"));
		String title = lead.getTitle();
		System.out.println("Title of the resulting Page : " + title);
	
		
		
		
	}

}
