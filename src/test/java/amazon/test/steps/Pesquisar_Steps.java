package amazon.test.steps;

import amazon.test.pages.HomePage;
import amazon.test.pages.Pesquisar;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Pesquisar_Steps {
	HomePage home = new HomePage();
    Pesquisar pesquisa = new Pesquisar();	
    
    

	@When("que realizo uma busca")
	public void queRealizoUmaBusca() {
		home.escreverCampoBusca("Apple iphone");
		home.clicarBuscar();
	    
	}
	@Then("valido os produtos pesquisados")
	public void validoOsProdutosPesquisados() throws InterruptedException {
		Thread.sleep(2000);
		pesquisa.pesquisar("Apple iphone");
	   
	}



}
