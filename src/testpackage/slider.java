package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium workspace\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://rangeslider.js.org/");
		WebElement Slider=dr.findElement(By.xpath("//div[@id='js-rangeslider-0']/div[2]"));
		WebElement Output=dr.findElement(By.id("js-output"));
		Actions ac= new Actions(dr);
		ac.dragAndDropBy(Slider, 100, 0).build().perform();
		
		
		System.out.println(Output.getText());
		

	}

}
