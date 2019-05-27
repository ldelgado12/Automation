import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ldelgado\\Documents\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=es");
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("Hola");;
		
		//xpath= //tagname[@attribute='value']
				
		
	}

}
