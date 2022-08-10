package edu.programacion.avanzada.Alvaro.ProyectoFinal.command.address;

import edu.programacion.avanzada.Alvaro.ProyectoFinal.model.response.adress.GetAddressResponse;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.patterns.command.Command;
import lombok.*;

/**
 * @author aluis on 7/10/2022.
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class GetAddressCommand extends Command<GetAddressResponse> {

    private Long id;
}
