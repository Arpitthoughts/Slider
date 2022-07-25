import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowauthentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		WebDriver dr= new ChromeDriver();
		//dr.get("http://username:password@siteurl");
		dr.get("https://admin:admin@the-internet.herokuapp.com/");
		dr.findElement(By.linkText("Basic Auth")).click();
		
		

	}

}
