package week1day3;


import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownCheckbox 
{

public static void main(String[] args) throws IOException {
int text;
	
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
	 dropdown.selectByIndex(x-2);
	 System.out.print("Enter genter information(Press 1 for male and 2 for female)");
	 System.out.print("1.male");
	 System.out.print("2.female");
	 int s =  Scanner(System.in); 
	 text= s.ne
	 if(s=1)
		 {
		 
	 }
	
	   

	}
}

private static int Scanner(InputStream in) {
	// TODO Auto-generated method stub
	return 0;
}
}