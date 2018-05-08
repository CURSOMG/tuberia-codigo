/**
  * Inserta un título en la clase descripción.
  * Al ser el título obligatorio, si es nulo o vacío se lanzará
  * una excepción.
  *
  * @param titulo El nuevo título de la descripción.
  * @throws IllegalArgumentException Si titulo es null, está vacío o contiene sólo espacios.

  */


package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  //CONJUNTO: Add javadoc comment
  /**{@inheritDoc} */
  public String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
