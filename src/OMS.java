import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OMS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\ldelgado\\Documents\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://softwareqa/spa/#/login");//hit url 
		System.out.println(driver.getTitle());//if the title is correct
		System.out.println(driver.getCurrentUrl());//if i am landed on correct url
		
		driver.findElement(By.xpath("//*[@id='txtLogin']")).sendKeys("OMSNOREPLY");
		driver.findElement(By.xpath("//*[@id=\'txtPassword\']")).sendKeys("AlignCR!");
		driver.findElement(By.xpath("//*[@id=\'cmdLogin\']")).click();
		
		
		driver.findElement(By.xpath("//*[text()='Inspecting cases'")).click();
		//driver.findElement(By.xpath("//*[@id='sidebar-wrapper']/ul/li[2]/a/ul/following-sibling::li[1]")).click();
		
		
	}

}
