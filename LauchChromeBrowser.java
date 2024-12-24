package week1.day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class LauchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.get("https://platform.testleaf.com/#/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
		}

}
