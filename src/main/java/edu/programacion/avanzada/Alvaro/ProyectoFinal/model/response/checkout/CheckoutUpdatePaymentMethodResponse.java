package edu.programacion.avanzada.Alvaro.ProyectoFinal.model.response.checkout;

import edu.programacion.avanzada.Alvaro.ProyectoFinal.model.dto.CheckoutDTO;
import lombok.*;

/**
 * @author aluis on 7/10/2022.
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CheckoutUpdatePaymentMethodResponse {

    private CheckoutDTO checkout;
}
