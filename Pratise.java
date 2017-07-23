package week1day2;

import java.util.List;


import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pratise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
ChromeDriver browser= new ChromeDriver();
browser.manage().window().maximize();
browser.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
browser.findElementByLinkText("Sign up").click();
browser.findElementById("userRegistrationForm:nationalityId").click();
WebElement asm = browser.findElementById("userRegistrationForm:nationalityId");
Select ban=new Select(asm);
List<WebElement>collection= ban.getOptions();
int x = collection.size();
System.out.println(x);
ban.selectByIndex(x-1);
for (WebElement eachOption :collection )
{
	 System.out.println(eachOption.getText() + " is listed in select Nationality dropdown");
}
/*WebElement asm = browser.findElementById("userRegistrationForm:countries");
Select ban = new Select(asm);				
List<WebElement> collection = ban.getOptions();
WebElement asm = browser.findElementById("userRegistrationForm:countries");
Select ban = new Select(asm);				
List<WebElement> collection = ban.getOptions();*/
int flag = 0;
for (WebElement eachOption : collection) {
	if (eachOption.getText().startsWith("E"))// .charAt(0)=='E')
	{flag = flag +1;
	 if (flag ==2){

		ban.selectByVisibleText(eachOption.getText());
		System.out.println("The countries selected is " + eachOption.getText());
		
		break;

}
}
}

	}
}
