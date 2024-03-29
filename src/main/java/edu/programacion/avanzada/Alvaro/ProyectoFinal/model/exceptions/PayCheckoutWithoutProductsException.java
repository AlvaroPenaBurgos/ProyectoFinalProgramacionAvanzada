package edu.programacion.avanzada.Alvaro.ProyectoFinal.model.exceptions;

import java.text.MessageFormat;
import java.util.UUID;

/**
 * @author aluis on 7/17/2022.
 */
public class PayCheckoutWithoutProductsException extends RuntimeException {

    public PayCheckoutWithoutProductsException(UUID id) {
        super(MessageFormat.format("Checkout {0} doesnt have any product to buy", id));
    }
}
