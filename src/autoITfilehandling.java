import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class autoITfilehandling {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		String downloadpath = System.getProperty("user.dir");
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadpath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver(options);
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dr.get("https://smallpdf.com/jpg-to-pdf");
		WebDriverWait wait = new WebDriverWait(dr, 30);
		// By cookies_accept=By.xpath("//span[text()='Got it']");
		// wait.until(ExpectedConditions.elementToBeClickable(cookies_accept)).click();
		dr.findElement(By.xpath("//span[text()='Got it']")).click();
		dr.findElement(By.cssSelector("button[class*='hrcx']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\91945\\Pictures\\fileupload");
		Thread.sleep(4000);

		By convert = By.cssSelector("div[class*='pmB'] button[type='submit']");
		By download = By.cssSelector("button[class*='XyA']");
		wait.until(ExpectedConditions.visibilityOfElementLocated(convert));
		dr.findElement(convert).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(download));
		dr.findElement(download).click();

		Thread.sleep(5000);

		File f = new File(System.getProperty("user.dir") + "/edit-converted.pdf");
		if (f.exists()) {

			System.out.println("file found");
		}

	}

}
