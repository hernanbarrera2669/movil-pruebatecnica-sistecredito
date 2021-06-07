package co.com.sistecredito.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AgregarProductos {

  public static final Target BTN_PROMOCIONES =
      Target.the("Seleccionar una tienda")
          .located(
              By.xpath(
                  "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView"));

  public static final Target BTN_SELECCION_LISTA =
      Target.the("Seleccionar el producto de la tienda")
          .located(
              By.xpath(
                  "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView"));

  public static final Target BTN_TALLA =
      Target.the("Seleccionar la talla que se desea")
          .located(
              By.xpath(
                  "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[2]"));

  public static final Target BTN_CARRITO_COMPRAS =
      Target.the("Agregar el producto seleccionado al carrito de compras")
          .located(By.xpath("//android.widget.ImageView[@content-desc=\"Ir al carrito\"]"));

  public static final Target LBL_TOTAL =
      Target.the("Verificar el total de la compra")
          .located(By.id("br.com.dafiti:id/cart_bottom_price_normal_field"));
}
