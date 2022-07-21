package TestCases;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// TODO: Auto-generated Javadoc
/**
 * The Class tests.
 */
public class tests {

	/** The driver. */
	private WebDriver driver;
	
	/** The selenium title expected. */
	private String seleniumTitleExpected = "Selenium";

	/**
	 * Sets the up.
	 */
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
	}

	/**
	 * Test wikipedia.
	 */
	@Test
	public void test_wikipedia() {
		driver.get("https://www.wikipedia.es");

		WebElement searchInput = driver.findElement(By.id("searchInput"));

		WebElement searchButton = driver.findElement(By.id("searchButton"));

		searchInput.sendKeys("selenium");
		searchButton.click();

		WebElement seleniumTitle = driver.findElement(By.id("firstHeading"));
		String seleniumTitlestring = seleniumTitle.getText();
		assertEquals(seleniumTitleExpected, seleniumTitlestring);
	}

	/**
	 * Shutdown.
	 */
	@After
	public void shutdown() {
		driver.quit();
	}

}
