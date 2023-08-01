package utility;

public class Calling 
{

	
	public static void main(String[] args) 
	{
	//	SeleniumOperations.browserlaunch("webdriver.chrome.driver", "C:\\Automation support\\chromedriver.exe");   
		//browser launch
		Object[] input1=new Object[2];
		         input1[0]="webdriver.chrome.driver";
		        input1[1]="C:\\Automation support\\chromedriver.exe";
		    	SeleniumOperations.browserlaunch(input1);
	 
		    //seeniumOperations.openapp("http://primusbank.qedgetech.com/");
		
		    	Object[] input2=new Object[1];
		                 input2[0]="http://primusbank.qedgetech.com/";
		                 SeleniumOperations.openapp(input2);
		                 
		
		               //eleniumOperations.sendText("//*[@id='txtuId']","Admin" );
		             	Object[] input3=new Object[2];
		                         input3[0]="//*[@id='txtuId']";
		                       	 input3[1]="Admin";
		                       SeleniumOperations.sendText(input3);
		                       
		        
		                         // SeleniumOperations.sendText("//*[@id='txtPword']", "Admin");     		 
		                     	Object[] input4 = new Object[2];
		                         input4[0]="//*[@id='txtPword']";
		                       	 input4[1]="Admin";
		                         SeleniumOperations.sendText(input4);
		                         
		                       
		                         //iumOperations.clickonelement("//*[@id='login']");
 
		                     	Object[] input5 = new Object[1];
				                 input5[0]="//*[@id='login']";
				                 SeleniumOperations.clickonelement(input5);

		                         //clkon branches

			                     	Object[] input6 = new Object[1];
					                 input6[0]="(//*[@height='24'])[2]";
					                 SeleniumOperations.clickonelement(input6);

		                         //select country
					             	Object[] input7 = new Object[2];
			                         input7[0]="//*[@id='lst_countryS']";
			                       	 input7[1]= "INDIA";
			                         SeleniumOperations.dropdown(input7);
			                         
				                 //sel state
				                 
			                         Object[] input8 = new Object[2];
			                         input8[0]="//*[@id='lst_stateS']";
			                       	 input8[1]= "MAHARASTRA";
			                         SeleniumOperations.dropdown(input8);
				                 //sel city
				                
			                         Object[] input9= new Object[2];
			                         input9[0]="//*[@id='lst_cityS']";
			                       	 input9[1]=  "MUMBAI";
			                         SeleniumOperations.dropdown(input9);
				                  
			                         //clk serch
			                     	Object[] input10 = new Object[1];
					                 input10[0]="//*[@id='btn_search']";
					                 SeleniumOperations.clickonelement(input10);
       
			                         
			                         
			                         
			                         //SeleniumOperations.clickonelement("(//*[@height='24'])[2]");
//eleniumOperations.sendText("//*[@id='lst_countryS']", "INDIA");
//SeleniumOperations.sendText("//*[@id='lst_stateS']", "MAHARASTRA");
//SeleniumOperations.sendText("//*[@id='lst_cityS']", "MUMBAI");
	}
	
	
	
	
	
	
	
	
	
	
	
}
