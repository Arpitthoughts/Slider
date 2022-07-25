import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://selectorshub.com/xpath-practice-page/");
		dr.findElement(By.id("userId")).sendKeys("Arpit");
		dr.findElement(By.id("pass")).sendKeys("password");
		dr.findElement(By.xpath("(//*[local-name()='svg' and @iconid='editon']/*[local-name()='path'])[2]")).click();
		dr.findElement(By.cssSelector(".nameFld")).sendKeys("Arpit");
		System.out.println(dr.findElements(By.tagName("iframe")).size());
		
		dr.switchTo().frame(dr.findElement(By.cssSelector("#tea")));
		dr.findElement(By.id("tea")).sendKeys("tea");
	}

}
