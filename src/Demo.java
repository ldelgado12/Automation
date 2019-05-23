import org.openqa.selenium.By;
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
		
		driver.get("https://www.facebook.com/");//hit url 
		System.out.println(driver.getTitle());//if the title is correct
		
		System.out.println(driver.getCurrentUrl());//if i am landed on correct url
		
		//System.out.println(driver.getPageSource());//print the page source on console
		
		//driver.get("http://yahoo.com");
		//driver.navigate().back();//goes back on the browser
		//driver.navigate().forward();// go forward again
		
		driver.findElement(By.id("email")).sendKeys("ldelgado@outlook.com");
		driver.findElement(By.name("pass")).sendKeys("12345");
		
		
		//driver.close();
		
		
	}

}
