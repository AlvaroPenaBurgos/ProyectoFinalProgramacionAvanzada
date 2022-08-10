package edu.programacion.avanzada.Alvaro.ProyectoFinal.command.address;

import edu.programacion.avanzada.Alvaro.ProyectoFinal.domain.Address;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.model.response.adress.CreateAddressResponse;
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
public class CreateAddressCommand extends Command<CreateAddressResponse> {

    private String name;
    private String description;

    public Address toAddress() {
        return Address.builder()
                .name(name)
                .description(description)
                .build();
    }
}
