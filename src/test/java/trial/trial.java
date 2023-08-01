package trial;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class trial 
{
	
	
	public static void main(String[] args) 
	{
	//browserlaunch
	System.setProperty("webdriver.chrome.driver", "C:\\Automation support\\chromedriver.exe");
		
	ChromeDriver driver=new ChromeDriver();	
	driver.manage().window().maximize();
	//open app
	driver.get("http://primusbank.qedgetech.com/");	
	//id
	driver.findElementByXPath("//*[@id='txtuId']").sendKeys("Admin");	
	//passwd
	driver.findElementByXPath("//*[@id='txtPword']").sendKeys("Admin");	
	//login
	driver.findElementByXPath("//*[@id='login']").click();	
	driver.findElementByXPath("(//*[@width='132'])[1]").click();	
	//clk branc
	driver.findElementByXPath("(//*[@height='24'])[2]").click();
	
	//select country
    Select country=new Select(driver.findElementById("lst_countryS"));
		country.selectByIndex(1);
	
	//sel state
	Select state=new Select(driver.findElementByXPath("//select[@name='lst_stateS']"));
		state.selectByValue("MAHARASTRA");
	
		//	//sel city
		Select city=new Select(driver.findElementByXPath("//select[@name='lst_cityS']"));
		city.selectByIndex(1);
		//click on serch
		
	//	driver.findElement(By.id("btn_search")).click();
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	}
	
	
	
	

}
