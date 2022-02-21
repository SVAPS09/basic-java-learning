import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//create driver object
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Ayush\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		System.out.println (driver.getTitle());
	
	System.out.println(driver.getCurrentUrl());
	//System.out.println(driver.getPageSource());
	
	driver.get("http://makemytrip.com");
	driver.navigate().back();
	driver.navigate().forward();
	driver.close();
	driver.quit();
	}

}
