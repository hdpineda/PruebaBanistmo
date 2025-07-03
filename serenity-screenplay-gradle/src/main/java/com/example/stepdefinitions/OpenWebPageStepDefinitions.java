package main.java.com.example.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import main.java.com.example.tasks.ConversorTask;
import io.cucumber.java.en.Then;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebPageStepDefinitions {

    private Actor usuario;
    private WebDriver driver;

    @Before
    public void setUp() {
        // Asegúrate de tener el driver de Chrome en tu PATH o configura la propiedad webdriver.chrome.driver
        driver = new ChromeDriver();
        usuario = Actor.named("Usuario");
        usuario.can(BrowseTheWeb.with(driver));
    }

    @Given("el usuario ingresa a la pagina web")
    public void usuarioEnPaginaWeb() {
        usuario.attemptsTo(
            Open.url("https://www.bancolombia.com/")
        );
    }

    @When("el usuario ingresa a la herramienta de conversión de tasas")
    public void usuarioIngresaCredenciales() {
        //prueba
        usuario.attemptsTo(
            ConversorTask.with()
        );
    }

    @Then("el resultado de conversión")
    public void usuarioAccedeSistema() {
        //usuario.should(net.serenitybdd.screenplay.GivenWhenThen.seeThat(LoginQuestion.isSuccessful()));
    }
}