package edu.programacion.avanzada.Alvaro.ProyectoFinal.model.response.checkout;

import edu.programacion.avanzada.Alvaro.ProyectoFinal.model.dto.CheckoutDTO;
import lombok.*;

import java.util.List;

/**
 * @author aluis on 7/10/2022.
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class GetCheckoutResponse {

    private List<CheckoutDTO> checkouts;
}
