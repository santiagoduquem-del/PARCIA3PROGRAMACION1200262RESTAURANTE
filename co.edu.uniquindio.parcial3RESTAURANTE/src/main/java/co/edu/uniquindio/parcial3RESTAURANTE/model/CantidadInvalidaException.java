package co.ede.uniquindio.Parcial3Restaurante.model;

import co.edu.uniquindio.parcial3RESTAURANTE.model.RestauranteException;

/**
 * Se lanza cuando la cantidad solicitada de un producto no es mayor que cero.
 */
public class CantidadInvalidaException extends RestauranteException {

    public CantidadInvalidaException(int cantidad) {
        super("La cantidad debe ser mayor que cero (recibida: " + cantidad + ").");
    }
}