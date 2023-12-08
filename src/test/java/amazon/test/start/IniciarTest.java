package amazon.test.start;

import org.openqa.selenium.chrome.ChromeDriver;

import amazon.test.driver.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class IniciarTest extends Driver {

	public void abrirNavegador() {
		String navegador = "Chrome";
		String url = "https://www.amazon.com.br/";
		if (navegador.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
		}

	}

	public void fecharNavegador() {
		driver.quit();
	}
}
