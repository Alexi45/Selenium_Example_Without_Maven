package selenium_example;

import java.sql.Time;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

// TODO: Auto-generated Javadoc
/**
 * The Class MainClass.
 */
public class MainClass {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String tituloesperado = "file:///D:/descargas/Pruebas%20sele/index_completo.html";

		try {

			driver.get("file:///D:/descargas/Pruebas%20sele/index_completo.html");

			/*
			  PARA IMPUTS EJEMPLO
			  
			  WebElement seatchBox = driver.findElement(By.id("searchInput")); WebElement
			  searchButton = driver.findElement(By.id("searchButton"));
			 
			 
			 seatchBox.sendKeys("hitler");
			 

			/*
			 * EJEMPLO RELLENO DE FORMULARIO DE USUARIO
			 * 
			 * WebElement passwordBox =
			 * driver.findElement(By.xpath("//*[@id=\"password\"]")); WebElement usernameBoc
			 * = driver.findElement(By.id("username"));
			 * 
			 * WebElement searchButton =
			 * driver.findElement(By.cssSelector("button#botonLogin"));
			 * 
			 * usernameBoc.sendKeys("usuario"); passwordBox.sendKeys("password");
			 * searchButton.click();
			 * 
			 */

			/*
			 * EJEMPLO COMBOBOX SIMPLE Y MULTIPLE
			 * 
			 * Select comboboxSimple = new Select(driver.findElement(By.id("combobox1")));
			 * 
			 * comboboxSimple.selectByIndex(2);
			 * 
			 * Thread.sleep(4000);
			 * 
			 * Select comboboxMulti = new Select(driver.findElement(By.id("combobox2")));
			 * 
			 * comboboxMulti.selectByIndex(0); comboboxMulti.selectByValue("pera");
			 * comboboxMulti.selectByVisibleText("Plátano");
			 * 
			 * Thread.sleep(2000);
			 * 
			 * comboboxMulti.deselectByIndex(2);
			 * 
			 * WebElement botonCombobox = driver.findElement(By.id("enviaComboboxes"));
			 * 
			 * botonCombobox.click();
			 */

			/*
			 * EJEMPLO RELLENO DE CHECKBOX
			 * 
			 * List<WebElement> listaCheckbox = driver.findElements(By.name("listaCompra"));
			 * 
			 * for(WebElement elemento:listaCheckbox) { elemento.click();
			 * System.out.println(elemento.isSelected()); Thread.sleep(1000); }
			 * System.out.println("_----------_"); listaCheckbox.get(0).click();
			 * listaCheckbox.get(3).click();
			 * 
			 * for(WebElement elemento:listaCheckbox) {
			 * 
			 * System.out.println(elemento.isSelected());
			 * 
			 * }
			 * 
			 * WebElement botonCheckbox = driver.findElement(By.id("enviaCheckboxes"));
			 * 
			 * botonCheckbox.click();
			 */

			/*
			 * EJEMPLO RELLENO RADIOBUTTON
			 * 
			 * WebElement aguaButton =
			 * driver.findElement(By.xpath("//input[@name='bebida' and @value='agua']" ));
			 * aguaButton.click(); Thread.sleep(1000);
			 * 
			 * WebElement doradaButton =
			 * driver.findElement(By.cssSelector("[name^='com'][value$='ada']"));
			 * 
			 * doradaButton.click();
			 * 
			 * WebElement botonRadioButton = driver.findElement(By.id("enviaRadiobutton"));
			 * 
			 * botonRadioButton.click();
			 */

			/*
			 * EJEMPLO RELLENO CALENDARIO
			 * 
			 * WebElement calendario = driver.findElement(By.name("fecha"));
			 * 
			 * Thread.sleep(2000); calendario.sendKeys("12082001"); Thread.sleep(2000);
			 * calendario.sendKeys(Keys.TAB); Thread.sleep(2000);
			 * calendario.sendKeys("1030");
			 * 
			 */

			/*
			 * EJEMPLO RELLENAR ALERTS
			 * 
			 * WebElement buttonAlertSimp = driver.findElement(By.id("buttonAlertSimple"));
			 * 
			 * buttonAlertSimp.click();
			 * 
			 * Thread.sleep(2000);
			 * 
			 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
			 * 
			 * Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			 * 
			 * alert.accept();
			 */

			String titulo = driver.getTitle();

			if (titulo.equals(tituloesperado)) {
				System.out.println("Coincide");
			} else {
				System.out.println("No coincide");
			}
			/*
			 * Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			 * .withTimeout(Duration.ofSeconds(16))
			 * .pollingEvery(Duration.ofSeconds(6)).ignoring(NoSuchElementException.class);
			 * 
			 * WebElement ButtonImplicitWait = wait.until(new Function<WebDriver,
			 * WebElement>() { public WebElement apply(WebDriver driver) { return
			 * driver.findElement(By.id("implicitWaitButton")); } });
			 * 
			 * ButtonImplicitWait.click();
			 */
			Thread.sleep(4000);

		} catch (Exception e) {
			e.printStackTrace();

		} finally {

		}

	}

}
