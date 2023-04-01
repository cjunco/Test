package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import utils.Hook;

public class StepConfiguration {

    private static AppiumDriver<MobileElement> driver;

    public StepConfiguration() {
        this.driver = Hook.getDriver();
    }

    @Given("Se visualiza el HomePage del App Mibanco")
    public void seVisualizaElHomePageDelAppMibanco() throws Exception{
        try {
            System.out.println("Hola");
        }catch (Exception e) {
            System.out.println("e = " + e);
        }
    }

    @Then("Se visualiza el Login del App Mibanco")
    public void seVisualizaElLoginDelAppMibanco(){
    }

    @When("Se da click click al botón Ingresa aquí")
    public void seDaClickClickAlBotónIngresaAquí(){
    }

}
