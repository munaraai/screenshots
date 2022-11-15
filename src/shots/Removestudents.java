package shots;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.asynchttpclient.util.DateUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Removestudents {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://127.0.0.1:5500/Qa-automation-7thmar/index.html");
		List <WebElement> remove = driver.findElements(By.tagName("option"));
		System.out.println("Size of list: " + remove.size());
		int o =remove.size();
		for(int i=0;i<o;i++) {
		if(i%2==0) {
		remove.get(i).click();
		driver.findElement(By.xpath("//*[@id=\"remove\"]")).click();
	}
			 }
			 
		}
	}
		

