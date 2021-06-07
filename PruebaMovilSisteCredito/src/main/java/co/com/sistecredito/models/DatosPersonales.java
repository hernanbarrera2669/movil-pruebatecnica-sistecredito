package co.com.sistecredito.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DatosPersonales {
  private String email;
  private String contrasena;
  private String tipo_documento;
  private String nro_documento;
  private String nombre;
  private String apellido;
  private String naciemiento;
  private String genero;
}
