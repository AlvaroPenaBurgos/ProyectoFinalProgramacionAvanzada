package edu.programacion.avanzada.Alvaro.ProyectoFinal.model.dto;

import lombok.*;

/**
 * @author aluis on 7/10/2022.
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CheckoutProductDTO {

    private Long id;
    private ProductDTO product;
    private Long quantity;
}
