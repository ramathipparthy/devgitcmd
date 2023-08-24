package mypack;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 
{
RemoteWebDriver driver;
@Test(priority=1)

	public void m1()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
@Test(priority=2)
public void m2()
{
	driver.get("http://www.google.com");
}
@Test(priority=3)
public void m3()
{
	driver.close();
}
}

