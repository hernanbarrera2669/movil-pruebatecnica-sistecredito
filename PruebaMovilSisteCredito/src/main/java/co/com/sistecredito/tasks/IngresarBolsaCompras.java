package co.com.sistecredito.tasks;

import static co.com.sistecredito.userinterfaces.AgregarProductos.BTN_CARRITO_COMPRAS;
import static co.com.sistecredito.userinterfaces.AgregarProductos.BTN_PROMOCIONES;
import static co.com.sistecredito.userinterfaces.AgregarProductos.BTN_SELECCION_LISTA;
import static co.com.sistecredito.userinterfaces.AgregarProductos.BTN_TALLA;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class IngresarBolsaCompras implements Task {

  public static IngresarBolsaCompras buscarCompra() {
    return Tasks.instrumented(IngresarBolsaCompras.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(BTN_PROMOCIONES),
        Click.on(BTN_SELECCION_LISTA),
        Click.on(BTN_TALLA),
        Click.on(BTN_CARRITO_COMPRAS));
  }
}
