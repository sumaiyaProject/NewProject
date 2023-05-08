package stepdifinations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Base {
	@Before
	public void setUp() {
	ChromeOptions option = new ChromeOptions();
	option.setHeadless(false);
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver(option);
//	driver.manage().window().maximize();
//	driver.manage().window().fullscreen();
	}
	@After
	public void treardown() {
		driver.close();
	}

}
