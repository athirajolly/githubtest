package HomeStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example1 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 Thread.sleep(2000);
		 
		 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		 WebDriver driver1=new ChromeDriver();
		 Thread.sleep(2000);
		 
		 driver.quit();
		 driver1.quit();
		 
	}

}
atiiiiiiiiiiii

hooii