package amazon.test.pages;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import amazon.test.driver.Driver;
import amazon.test.metodos.Metodos;

public class HomePage extends Driver {
	Metodos metodo = new Metodos();

	By campoBusca = By.xpath("//input[@id='twotabsearchtextbox']");
	By sugestoes = By.xpath("//*[@class='s-suggestion-container']");
	By pesquisarBtn = By.xpath("//input[@type='submit']");

	public void escreverCampoBusca(String pesquisa) {
		metodo.clicar(this.campoBusca);
		metodo.escrever(this.campoBusca, pesquisa);

	}

	public void clicarBuscar() {
		metodo.clicar(pesquisarBtn);
	}

	public void validarSugestoes() {

		List<WebElement> listSugestoes = driver.findElements(sugestoes);
		boolean sugestoesVisivel = false;
		for (int i = 0; i < listSugestoes.size(); i++) {
			System.out.println(i + ": " + listSugestoes.get(i).getText());
			if (listSugestoes.get(i).isDisplayed()) {
				sugestoesVisivel = true;
			}
			assertTrue(sugestoesVisivel);
		}

	}

}
