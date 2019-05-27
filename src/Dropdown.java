import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\ldelgado\\Documents\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");//hit url 
		System.out.println(driver.getTitle());//if the title is correct
		
		System.out.println(driver.getCurrentUrl());//if i am landed on correct url
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		
		int i=1;
		while(i<5)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
	}
		
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
		//can only be used if the select is present
		//use this with basic dropdown
		Select s= new Select(driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_DropDownListCurrency\']")));
		s.selectByValue("USD");
		
		
	}

}
