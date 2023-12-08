package amazon.test.metodos;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

import amazon.test.driver.Driver;

public class Metodos extends Driver {
	
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
		
	}
	public void escrever(By elemento, String termoBusca) {
		driver.findElement(elemento).sendKeys(termoBusca);
	}
	public void ElementoVisivel(By elemento) {
		boolean elementoVisivel=false;
		if(driver.findElement(elemento).isDisplayed()) {
			elementoVisivel = true;
		}
		assertTrue(elementoVisivel);
	}

}
