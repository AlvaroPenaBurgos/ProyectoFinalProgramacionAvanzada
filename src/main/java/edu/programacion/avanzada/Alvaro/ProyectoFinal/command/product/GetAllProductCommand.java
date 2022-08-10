package edu.programacion.avanzada.Alvaro.ProyectoFinal.command.product;

import edu.programacion.avanzada.Alvaro.ProyectoFinal.model.response.product.GetProductResponse;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.patterns.command.Command;
import lombok.*;

/**
 * @author aluis on 7/10/2022.
 */
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class GetAllProductCommand extends Command<GetProductResponse> {

}
