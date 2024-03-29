package edu.programacion.avanzada.Alvaro.ProyectoFinal.model.exceptions;

import java.text.MessageFormat;

/**
 * @author aluis on 7/17/2022.
 */
public class AddressNoFoundException extends RuntimeException {

    public AddressNoFoundException(Long id) {
        super(MessageFormat.format("Address {0} no found", id));
    }
}
