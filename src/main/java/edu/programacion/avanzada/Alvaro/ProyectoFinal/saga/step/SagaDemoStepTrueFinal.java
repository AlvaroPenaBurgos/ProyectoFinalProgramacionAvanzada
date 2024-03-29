package edu.programacion.avanzada.Alvaro.ProyectoFinal.saga.step;

import edu.programacion.avanzada.Alvaro.ProyectoFinal.model.exceptions.BadSagaException;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.patterns.saga.model.SagaStepCompensator;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.patterns.saga.model.SagaStepHandler;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.command.DemoCommand;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.model.response.DemoResponse;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.patterns.saga.model.SagaPayLoadKey;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.patterns.saga.model.SagaStep;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author aluis on 7/17/2022.
 */
@Component
@Slf4j
public class SagaDemoStepTrueFinal implements SagaStep<DemoResponse> {

    @Override
    public String getName() {
        return "Demo Step true final";
    }

    @Override
    public SagaStepHandler<DemoResponse> getHandler() {
        return sagaPayload -> {
            DemoCommand command = sagaPayload.getProperty(new SagaPayLoadKey<>("command", DemoCommand.class));
            log.info("Running {} Handler", getName());
            if (command.isExplote()) {
                throw new BadSagaException();
            }
            sagaPayload.setResult(DemoResponse.builder().data("Wiiii complete!").build());
        };
    }

    @Override
    public SagaStepCompensator<DemoResponse> getCompensator() {
        return null;
    }
}
