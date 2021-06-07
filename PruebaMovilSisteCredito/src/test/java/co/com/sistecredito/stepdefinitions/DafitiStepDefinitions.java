package co.com.sistecredito.stepdefinitions;

import static co.com.sistecredito.userinterfaces.AgregarProductos.LBL_TOTAL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import co.com.sistecredito.enums.CabeceraTabla;
import co.com.sistecredito.enums.MensajeError;
import co.com.sistecredito.exceptions.ExcepcionGeneral;
import co.com.sistecredito.models.DatosPersonales;
import co.com.sistecredito.questions.ObtenerTexto;
import co.com.sistecredito.tasks.IngresarBolsaCompras;
import co.com.sistecredito.tasks.IngresarDatos;
import co.com.sistecredito.utilities.Utils;
import io.cucumber.java.DataTableType;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import java.util.List;
import java.util.Map;
import net.serenitybdd.screenplay.actors.OnStage;

public class DafitiStepDefinitions {

  public static final int NUMERO_MENOR = 1;
  public static final int NUMERO_MAYOR_CORREO = 9999;
  public static final int LIMITE_INFERIOR_CORREO = 0;
  public static final int LIMITE_MEDIO_CORREO = 6;

  @DataTableType
  public DatosPersonales datosUsuario(Map<String, String> datosUsuario) {
    return new DatosPersonales(
        datosUsuario.get(CabeceraTabla.EMAIL.getValue()),
        datosUsuario.get(CabeceraTabla.CONTRASENA.getValue()),
        datosUsuario.get(CabeceraTabla.TIPO_DOCUMENTO.getValue()),
        datosUsuario.get(CabeceraTabla.NRO_DOCUMENTO.getValue()),
        datosUsuario.get(CabeceraTabla.NOMBRE.getValue()),
        datosUsuario.get(CabeceraTabla.APELLIDO.getValue()),
        datosUsuario.get(CabeceraTabla.NACIMIENTO.getValue()),
        datosUsuario.get(CabeceraTabla.GENERO.getValue()));
  }

  @Dado("que el usuario se encuentra en la app móvil de dafiti con usuario registrado$")
  public void usuarioRegistradoAPP(List<DatosPersonales> datosPersonalesLista) {
    String email = datosPersonalesLista.get(0).getEmail();
    String emailParteInicial = email.substring(LIMITE_INFERIOR_CORREO, LIMITE_MEDIO_CORREO);
    String emailParteFinal = email.substring(LIMITE_MEDIO_CORREO);
    String valorAleatorioCorreo =
        Integer.toString(Utils.generateRandomNumbers(NUMERO_MAYOR_CORREO, NUMERO_MENOR));
    String emailCompleto = emailParteInicial.concat(valorAleatorioCorreo).concat(emailParteFinal);
    String contrasena = datosPersonalesLista.get(0).getContrasena();
    String tipo_documento = datosPersonalesLista.get(0).getTipo_documento();
    String nro_documento = datosPersonalesLista.get(0).getNro_documento();
    String nombre = datosPersonalesLista.get(0).getNombre();
    String apellido = datosPersonalesLista.get(0).getApellido();
    String nacimiento = datosPersonalesLista.get(0).getNaciemiento();
    String genero = datosPersonalesLista.get(0).getGenero();

    OnStage.theActorInTheSpotlight()
        .wasAbleTo(
            IngresarDatos.ingresarDatosUsuario(
                emailCompleto,
                contrasena,
                tipo_documento,
                nro_documento,
                nombre,
                apellido,
                nacimiento,
                genero));
  }

  @Cuando("selecciona un producto a comprar y lo agrega a la bolsa$")
  public void agregarProducto() {
    theActorInTheSpotlight().attemptsTo(IngresarBolsaCompras.buscarCompra());
  }

  @Entonces(
      "podra verificar que el producto se encuentra en el carrito, ya que aparece el (.*) en la factura$")
  public void verProductosEnCarrito(String total) {
    theActorInTheSpotlight()
        .should(
            seeThat(ObtenerTexto.delElemento(LBL_TOTAL), is(equalTo(total)))
                .orComplainWith(
                    ExcepcionGeneral.class, MensajeError.VALOR_TOTAL.getMensajeError()));
  }
}
