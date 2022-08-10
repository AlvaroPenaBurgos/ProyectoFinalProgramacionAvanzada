package edu.programacion.avanzada.Alvaro.ProyectoFinal.command.handler;

import edu.programacion.avanzada.Alvaro.ProyectoFinal.patterns.command.CommandEvent;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.command.DemoCommand;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.model.response.DemoResponse;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.patterns.command.CommandHandler;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.patterns.saga.SagaOrchestrator;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.patterns.saga.model.Saga;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.saga.SagaFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author aluis on 7/10/2022.
 */
@Component
@RequiredArgsConstructor
@CommandEvent(command = DemoCommand.class)
@Slf4j
public class DemoCommandHandler implements CommandHandler<DemoResponse, DemoCommand> {

    private final SagaOrchestrator sagaOrchestrator;

    @Value("${pattern.saga.timeout}")
    private int timeout;

    @Override
    public DemoResponse handle(DemoCommand command) {
        Saga<DemoResponse> saga = SagaFactory.createDemoSaga(UUID.randomUUID(), command);
        return sagaOrchestrator.orchestrate(saga, timeout);
    }
}
