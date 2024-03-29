package edu.programacion.avanzada.Alvaro.ProyectoFinal.saga.step;

import edu.programacion.avanzada.Alvaro.ProyectoFinal.model.response.DemoResponse;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.patterns.saga.model.SagaStepCompensator;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.patterns.saga.model.SagaStepHandler;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.patterns.saga.model.SagaStep;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author aluis on 7/17/2022.
 */
@Component
@Slf4j
public class SagaDemoStep2 implements SagaStep<DemoResponse> {

    @Override
    public String getName() {
        return "Demo Step 2";
    }

    @Override
    public SagaStepHandler<DemoResponse> getHandler() {
        return sagaPayload -> {
            log.info("Running {} Handler", getName());
        };
    }

    @Override
    public SagaStepCompensator<DemoResponse> getCompensator() {
        return sagaPayload -> {
            log.info("Running {} compensator", getName());
            log.info("Only show 2 comments here");
        };
    }
}
