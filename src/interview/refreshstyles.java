package interview;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class refreshstyles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");

		WebDriver dr= new ChromeDriver();
		dr.get("http://facebook.com");
		Thread.sleep(2000L);
		dr.findElement(By.id("email")).sendKeys("Arpit122@gmailcom");
		
		
		//refresh using javascript executor
		//JavascriptExecutor js= (JavascriptExecutor)dr;
		//js.executeScript("window.location.reload(true)");
		
		
		/*
		 * Actions a = new Actions(dr);
		 * a.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).build().perform
		 * ();
		 */
		
		
		dr.findElement(By.tagName("a")).sendKeys(Keys.chord(Keys.CONTROL,"r"));
	
	}

}
