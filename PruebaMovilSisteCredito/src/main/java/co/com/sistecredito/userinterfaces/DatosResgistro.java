package co.com.sistecredito.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class DatosResgistro {

  public static final Target BTN_SELECCIONAR_PAIS =
      Target.the("Botón seleccionar país").located(By.id("br.com.dafiti:id/image_flag_co"));

  public static final Target BTN_SELECCIONAR_CATEGORIA_MUJER =
      Target.the("Botón seleccionar la categoría deseada")
          .located(
              By.xpath(
                  "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView"));

  public static final Target BTN_MI_CUENTA =
      Target.the("Botón ingresar a la cuenta")
          .located(
              By.xpath(
                  "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout[4]/android.widget.LinearLayout/android.widget.ImageView"));

  public static final Target BTN_ENTRAR =
      Target.the("Botón entrar a seleccionar opciones de la cuenta")
          .located(
              By.xpath(
                  "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView"));

  public static final Target BTN_CREAR_CUENTA =
      Target.the("Botón crear cuenta").located(By.id("br.com.dafiti:id/create_account"));

  public static final Target TXT_CORREO =
      Target.the("Campo de texto para ingresar el correo")
          .located(By.id("br.com.dafiti:id/form_email"));

  public static final Target TXT_CONTRASENA =
      Target.the("Campo de texto para ingresar la contraseña")
          .located(By.id("br.com.dafiti:id/form_password"));

  public static final Target TXT_REPETIR_CONTRASENA =
      Target.the("Campo de texto para ingresar nuevamente la contraseña")
          .located(By.id("br.com.dafiti:id/form_password_confirm"));

  public static final Target LST_TIPO_DOCUMENTO =
      Target.the("Lista para seleccionar el tipo de documento")
          .located(By.id("br.com.dafiti:id/form_document_type"));

  public static final Target TXT_NRO_DOCUMENTO =
      Target.the("Campo de texto para ingresar el número de documento")
          .located(By.id("br.com.dafiti:id/form_identification"));

  public static final Target TXT_NOMBRE =
      Target.the("Campo de texto para ingresar el nombre")
          .located(By.id("br.com.dafiti:id/form_first_name"));

  public static final Target TXT_APELLIDO =
      Target.the("Campo de texto para ingresar el apellido")
          .located(By.id("br.com.dafiti:id/form_last_name"));

  public static final Target TXT_FECHA_NACIMIENTO =
      Target.the("Campo de texto para ingresar la fecha de nacimiento")
          .located(By.id("br.com.dafiti:id/form_birthday"));

  public static final Target LST_GENERO =
      Target.the("Lista para seleccionar el genero").located(By.id("br.com.dafiti:id/form_gender"));

  public static final Target BTN_GUARDAR =
      Target.the("Botón para guardar los datos del usuario")
          .located(By.id("br.com.dafiti:id/register_button"));
}
