package edu.programacion.avanzada.Alvaro.ProyectoFinal.model.response.order;

import edu.programacion.avanzada.Alvaro.ProyectoFinal.model.dto.OrderDTO;
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
public class GetOrderResponse {

    private List<OrderDTO> orders;
}
