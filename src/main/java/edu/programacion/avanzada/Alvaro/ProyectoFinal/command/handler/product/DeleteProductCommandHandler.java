package edu.programacion.avanzada.Alvaro.ProyectoFinal.command.handler.product;

import edu.programacion.avanzada.Alvaro.ProyectoFinal.patterns.command.CommandEvent;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.command.product.DeleteProductCommand;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.model.response.product.DeleteProductResponse;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.patterns.command.CommandHandler;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author aluis on 7/10/2022.
 */
@Component
@RequiredArgsConstructor
@CommandEvent(command = DeleteProductCommand.class)
@Slf4j
public class DeleteProductCommandHandler implements CommandHandler<DeleteProductResponse, DeleteProductCommand> {

    private final ProductRepository productRepository;

    @Override
    public DeleteProductResponse handle(DeleteProductCommand deleteProductCommand) {
        productRepository.deleteById(deleteProductCommand.getId());
        log.info("Product {} deleted", deleteProductCommand.getId());
        return DeleteProductResponse.builder()
                .build();
    }
}
