package edu.programacion.avanzada.Alvaro.ProyectoFinal.command.handler.address;

import edu.programacion.avanzada.Alvaro.ProyectoFinal.command.address.UpdateAddressCommand;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.domain.Address;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.patterns.command.CommandEvent;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.model.exceptions.AddressNoFoundException;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.model.response.adress.UpdateAddressResponse;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.patterns.command.CommandHandler;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.repositories.AddressRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author aluis on 7/10/2022.
 */
@Component
@RequiredArgsConstructor
@CommandEvent(command = UpdateAddressCommand.class)
@Slf4j
public class UpdateAddressCommandHandler implements CommandHandler<UpdateAddressResponse, UpdateAddressCommand> {

    private final AddressRepository addressRepository;

    @Override
    public UpdateAddressResponse handle(UpdateAddressCommand updateAddressCommand) {
        Address address = addressRepository.findById(updateAddressCommand.getId()).orElseThrow(() -> new AddressNoFoundException(updateAddressCommand.getId()));
        address.setName(updateAddressCommand.getName());
        address.setDescription(updateAddressCommand.getDescription());
        addressRepository.save(address);
        log.info("Address {} updated", updateAddressCommand.getId());
        return UpdateAddressResponse.builder().address(address.toDTO()).build();
    }
}
