import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//create driver object
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Ayush\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println (driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("ayushsri1994@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("ayush@1994");
		//driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//font[text()='Account Forgot? ']")).click();
		
		
		
	
	//driver.close();
	//driver.quit();
	}

}
