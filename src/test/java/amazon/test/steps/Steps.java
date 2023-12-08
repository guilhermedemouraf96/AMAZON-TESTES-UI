package amazon.test.steps;

import amazon.test.driver.Driver;
import amazon.test.pages.HomePage;
import amazon.test.start.IniciarTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends Driver {
	IniciarTest iniciar = new IniciarTest();
	HomePage home = new HomePage();

	@Before
	public void iniciarTest() throws InterruptedException {
		iniciar.abrirNavegador();
		Thread.sleep(2000);

	}

	@After
	public void fecharNavegador() {
		iniciar.fecharNavegador();

	}

	@When("preencho o campo de buscas")
	public void preenchoOCampoDeBuscas() throws InterruptedException {
		home.escreverCampoBusca("Air Fryer");
		Thread.sleep(1000);

	}

	@Then("visualizo campo de sugestões")
	public void visualizoCampoDeSugestões() {
		home.validarSugestoes();
	}

}
