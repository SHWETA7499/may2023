package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class SeleniumOperations 
{
    public static WebDriver driver=null;    
	//reusable method 
	
	//launch browser
	public static void browserlaunch(Object[] inputparameters)       //static 
	{
		String browserName=(String) inputparameters[0];//BNAME
		String strBrowservalue=(String) inputparameters[1];//exe
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver",strBrowservalue);
			
			 driver=new ChromeDriver();	
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",strBrowservalue);
			
			 driver=new FirefoxDriver();	
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		
		
	}
	//open app
	public static void openapp(Object[] inputparameters)
	{
		String pa=(String) inputparameters[0];
	    driver.get(pa);
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	//send text
	public static void sendText(Object[] inputparameters)
	{
		String a=(String) inputparameters[0];
		String b=(String) inputparameters[1];
	driver.findElement(By.xpath(a)).sendKeys(b);
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	//click
	public static void clickonelement(Object[] inputparameters)
	{
	String locator=(String) inputparameters[0];
	driver.findElement(By.xpath(locator)).click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	public static void dropdown(Object[] inputparameters)
	{
		String locator= (String) inputparameters[0];
		String text=(String) inputparameters[1];
		Select a=new Select(driver.findElement(By.xpath(locator)));
		       a.selectByVisibleText(text);
		       driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
		//validation
	public static void validation(Object[] inputparameters)
	{
		String locator= (String) inputparameters[0];//xpath
		String text=(String) inputparameters[1];//text Admin
String captureText=	driver.findElement(By.xpath(locator)).getText();
		
		if(text.equalsIgnoreCase(captureText)) 
		{
			System.out.println("test case pass");
		}
		else 
		{
			System.out.println("test case fail");
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		
	}















}
