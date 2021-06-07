package co.com.sistecredito.enums;

public enum MensajeError {
  VALOR_TOTAL("No es posible visualizar el valor total");

  private final String mensajeError;

  MensajeError(String mensajeError) {
    this.mensajeError = mensajeError;
  }

  public String getMensajeError() {
    return mensajeError;
  }
}
