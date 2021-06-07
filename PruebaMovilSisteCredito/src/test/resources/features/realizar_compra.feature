#language: es

Característica: Realizar una compra en la app móvil de dafiti con usuario registrado
  Yo como usuario de la app de dafiti
  Deseo agregar un producto al carrito de compras
  Para verificar su correcto funcionamiento

  Escenario:  Registrar una cuenta en la app móvil de dafiti y agregar un producto al carrito
    Dado que el usuario se encuentra en la app móvil de dafiti con usuario registrado
      | email              | contrasena | tipo_documento | nro_documento | nombre | apellido | nacimiento | genero    |
      | hernan@hotmail.com | Miapp123*  | CC             | 1034234456    | Hernan | Barrera  | 12041987   | Masculino |
    Cuando selecciona un producto a comprar y lo agrega a la bolsa
    Entonces podra verificar que el producto se encuentra en el carrito, ya que aparece el Total en la factura
