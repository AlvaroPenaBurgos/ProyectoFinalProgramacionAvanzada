package edu.programacion.avanzada.Alvaro.ProyectoFinal.model.request.payment;

import edu.programacion.avanzada.Alvaro.ProyectoFinal.domain.PaymentMethod;
import lombok.*;

/**
 * @author aluis on 7/10/2022.
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CreatePaymentMethodRequest {

    private String name;
    private String description;

    public PaymentMethod toPaymentMethod() {
        return PaymentMethod.builder()
                .name(name)
                .description(description)
                .build();
    }
}
