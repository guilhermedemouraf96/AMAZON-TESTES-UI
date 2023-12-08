package amazon.test.pages;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Pesquisar extends HomePage {

	public void pesquisar(String termoBusca) {
		List<WebElement> busca = driver.findElements(By.xpath(
				"//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']"));
		boolean pesquisa=true;
		System.out.println(busca.size()+ " itens encontrados");
		for (int i = 0; i < busca.size(); i++) {
			System.out.println(i + ":" + busca.get(i).getText());
			String pesquisaExecutada = busca.get(i).getText();

			if (pesquisaExecutada.contains(termoBusca)) {
				System.out.println(pesquisaExecutada);
				pesquisa = true;
			}
			assertTrue(pesquisa);
		}

	}

}
