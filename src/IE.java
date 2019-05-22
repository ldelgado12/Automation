import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//selenium code-
		
		//create driver object for chrome browser
		
		// we will strictly implement methods of webdriver
		
		/* class name = ChromeDriver, 
		 * X driver= new X (); */
		
		//Invoke .exe file first
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\ldelgado\\Documents\\MicrosoftWebDriver.exe");
		
		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		
	}

}
