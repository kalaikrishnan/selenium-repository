package week1day1;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctc 
{
public static void main(String[] args)
	
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		 //Click Login and logout
	 driver.findElementByLinkText("Sign up").click();

	// driver.findElementByLinkText("CRM/SFA").click();
	 //driver.findElementByLinkText("userRegistrationForm:securityQ").click();
	 driver.findElementById("userRegistrationForm:securityQ").click();
	 WebElement source= driver.findElementById("userRegistrationForm:securityQ");
	 Select dropdown=new Select(source);
	 List<WebElement>allOptions=dropdown.getOptions();
	 int x =allOptions.size();
	 System.out.println(x);
	 dropdown.selectByIndex(x-1);

	 
	 driver.findElementById("userRegistrationForm:occupation");
	 WebElement source1= driver.findElementById("userRegistrationForm:occupation");
	 Select dropdown1=new Select(source1);
		 List<WebElement>allOptions1=dropdown1.getOptions();
	 for (WebElement eachOption : allOptions1)
	 {
		 System.out.println(eachOption.getText());
	 }
}
}
	
