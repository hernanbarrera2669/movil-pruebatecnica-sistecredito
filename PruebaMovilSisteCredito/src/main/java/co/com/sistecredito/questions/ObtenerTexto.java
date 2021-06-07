package co.com.sistecredito.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ObtenerTexto implements Question<String> {
  private Target elemento;

  public ObtenerTexto(Target elemento) {
    this.elemento = elemento;
  }

  public static ObtenerTexto delElemento(Target elemento) {
    return new ObtenerTexto(elemento);
  }

  @Override
  public String answeredBy(Actor actor) {
    return elemento.resolveFor(actor).getText();
  }
}
