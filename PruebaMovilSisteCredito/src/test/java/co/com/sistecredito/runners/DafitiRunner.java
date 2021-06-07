package co.com.sistecredito.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/realizar_compra.feature",
    snippets = CucumberOptions.SnippetType.CAMELCASE,
    glue = "co.com.sistecredito.stepdefinitions")
public class DafitiRunner {}
