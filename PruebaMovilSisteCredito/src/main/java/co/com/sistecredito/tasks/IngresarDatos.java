package co.com.sistecredito.tasks;

import static co.com.sistecredito.userinterfaces.DatosResgistro.BTN_CREAR_CUENTA;
import static co.com.sistecredito.userinterfaces.DatosResgistro.BTN_ENTRAR;
import static co.com.sistecredito.userinterfaces.DatosResgistro.BTN_GUARDAR;
import static co.com.sistecredito.userinterfaces.DatosResgistro.BTN_MI_CUENTA;
import static co.com.sistecredito.userinterfaces.DatosResgistro.BTN_SELECCIONAR_CATEGORIA_MUJER;
import static co.com.sistecredito.userinterfaces.DatosResgistro.BTN_SELECCIONAR_PAIS;
import static co.com.sistecredito.userinterfaces.DatosResgistro.LST_GENERO;
import static co.com.sistecredito.userinterfaces.DatosResgistro.LST_TIPO_DOCUMENTO;
import static co.com.sistecredito.userinterfaces.DatosResgistro.TXT_APELLIDO;
import static co.com.sistecredito.userinterfaces.DatosResgistro.TXT_CONTRASENA;
import static co.com.sistecredito.userinterfaces.DatosResgistro.TXT_CORREO;
import static co.com.sistecredito.userinterfaces.DatosResgistro.TXT_FECHA_NACIMIENTO;
import static co.com.sistecredito.userinterfaces.DatosResgistro.TXT_NOMBRE;
import static co.com.sistecredito.userinterfaces.DatosResgistro.TXT_NRO_DOCUMENTO;
import static co.com.sistecredito.userinterfaces.DatosResgistro.TXT_REPETIR_CONTRASENA;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;

public class IngresarDatos implements Task {

  private String email;
  private String contrasena;
  private String tipo_documento;
  private String nro_documento;
  private String nombre;
  private String apellido;
  private String fechaNacimiento;
  private String genero;

  protected IngresarDatos(
      String email,
      String contrasena,
      String tipo_documento,
      String nro_documento,
      String nombre,
      String apellido,
      String fechaNacimiento,
      String genero) {
    this.email = email;
    this.contrasena = contrasena;
    this.tipo_documento = tipo_documento;
    this.nro_documento = nro_documento;
    this.nombre = nombre;
    this.apellido = apellido;
    this.fechaNacimiento = fechaNacimiento;
    this.genero = genero;
  }

  public static IngresarDatos ingresarDatosUsuario(
      String email,
      String contrasena,
      String tipo_documento,
      String nro_documento,
      String nombre,
      String apellido,
      String fechaNacimiento,
      String genero) {
    return Tasks.instrumented(
        IngresarDatos.class,
        email,
        contrasena,
        tipo_documento,
        nro_documento,
        nombre,
        apellido,
        fechaNacimiento,
        genero);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(BTN_SELECCIONAR_PAIS),
        Click.on(BTN_SELECCIONAR_CATEGORIA_MUJER),
        Click.on(BTN_MI_CUENTA),
        Click.on(BTN_ENTRAR),
        Click.on(BTN_CREAR_CUENTA),
        Enter.theValue(email).into(TXT_CORREO),
        Enter.theValue(contrasena).into(TXT_CONTRASENA),
        Enter.theValue(contrasena).into(TXT_REPETIR_CONTRASENA),
        SendKeys.of(tipo_documento).into(LST_TIPO_DOCUMENTO),
        Enter.theValue(nro_documento).into(TXT_NRO_DOCUMENTO),
        Enter.theValue(nombre).into(TXT_NOMBRE),
        Enter.theValue(apellido).into(TXT_APELLIDO),
        Enter.theValue(fechaNacimiento).into(TXT_FECHA_NACIMIENTO),
        SendKeys.of(genero).into(LST_GENERO),
        Click.on(BTN_GUARDAR));
  }
}
