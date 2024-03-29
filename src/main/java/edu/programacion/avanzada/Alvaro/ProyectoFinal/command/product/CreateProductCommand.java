package edu.programacion.avanzada.Alvaro.ProyectoFinal.command.product;

import edu.programacion.avanzada.Alvaro.ProyectoFinal.domain.Product;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.model.response.product.CreateProductResponse;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.patterns.command.Command;
import lombok.*;

import java.math.BigDecimal;

/**
 * @author aluis on 7/10/2022.
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CreateProductCommand extends Command<CreateProductResponse> {

    private String name;
    private String description;
    private long availableQuantity;
    private BigDecimal price;

    public Product toProduct() {
        return Product.builder()
                .name(name)
                .description(description)
                .availableQuantity(availableQuantity)
                .price(price)
                .build();
    }
}
