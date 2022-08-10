package edu.programacion.avanzada.Alvaro.ProyectoFinal.command;

import edu.programacion.avanzada.Alvaro.ProyectoFinal.model.response.DemoResponse;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.patterns.command.Command;
import lombok.*;

/**
 * @author aluis on 7/17/2022.
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class DemoCommand extends Command<DemoResponse> {

    private boolean explote;
}
