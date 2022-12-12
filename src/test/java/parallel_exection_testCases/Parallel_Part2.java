package parallel_exection_testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parallel_Part2 {
public static WebDriver driver;
	
	@Test
	public void logic4() {
		
		System.out.println("this is logic4 operation:"+Thread.currentThread().getId());
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://rediff.com");
	}
	@Test
	public void logic5() {
		System.out.println("this is logic5 operation"+Thread.currentThread().getId());
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
	}
	@Test
	public void logic6() {
		System.out.println("this is logic6 operation"+Thread.currentThread().getId());
		driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
	}
	
	
	
}
