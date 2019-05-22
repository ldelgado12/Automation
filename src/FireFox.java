import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//selenium code-
		
				//create driver object for Firefox browser
				
				// we will strictly implement methods of webdriver
				
				/* class name = ChromeDriver, 
				 * X driver= new X (); */
				
				//gecko driver
		
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\ldelgado\\Documents\\geckodriver.exe");
		
				WebDriver driver=new FirefoxDriver();
				
				driver.get("https://www.google.com/");
				System.out.println(driver.getTitle());
	}

}
