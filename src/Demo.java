import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//selenium code-
		
		//create driver object for chrome browser
		
		// we will strictly implement methods of webdriver
		
		/* class name = ChromeDriver, 
		 * X driver= new X (); */
		
		//Invoke .exe file first
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ldelgado\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		
	}

}
