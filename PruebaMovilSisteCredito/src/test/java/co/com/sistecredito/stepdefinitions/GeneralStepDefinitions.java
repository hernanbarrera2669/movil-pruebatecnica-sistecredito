package co.com.sistecredito.stepdefinitions;

import co.com.sistecredito.utilities.AppiumDriver;
import io.cucumber.java.Before;
import java.net.MalformedURLException;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

public class GeneralStepDefinitions {

  @Before
  public void configuracionIncicial() throws MalformedURLException {
    OnStage.setTheStage(Cast.ofStandardActors());
    OnStage.theActor("usuario");
    OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(AppiumDriver.configuracion()));
  }
}
