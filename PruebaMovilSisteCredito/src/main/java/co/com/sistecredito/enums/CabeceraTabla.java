package co.com.sistecredito.enums;

public enum CabeceraTabla {
  EMAIL("email"),
  CONTRASENA("contrasena"),
  TIPO_DOCUMENTO("tipo_documento"),
  NRO_DOCUMENTO("nro_documento"),
  NOMBRE("nombre"),
  APELLIDO("apellido"),
  NACIMIENTO("nacimiento"),
  GENERO("genero");

  private String value;

  CabeceraTabla(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
