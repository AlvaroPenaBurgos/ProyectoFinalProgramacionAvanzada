package edu.programacion.avanzada.Alvaro.ProyectoFinal.command.address;

import edu.programacion.avanzada.Alvaro.ProyectoFinal.model.response.adress.UpdateAddressResponse;
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
public class UpdateAddressCommand extends Command<UpdateAddressResponse> {

    private Long id;
    private String name;
    private String description;
}
