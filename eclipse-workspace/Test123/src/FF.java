import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//create driver object
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Desktop\\Ayush\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		System.out.println (driver.getTitle());
	}

}
