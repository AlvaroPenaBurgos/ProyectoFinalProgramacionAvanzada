package edu.programacion.avanzada.Alvaro.ProyectoFinal.command.handler.checkout;

import edu.programacion.avanzada.Alvaro.ProyectoFinal.command.checkout.PayCheckoutCommand;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.model.response.checkout.PayCheckoutResponse;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.patterns.command.CommandEvent;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.patterns.saga.model.Saga;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.saga.SagaFactory;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.patterns.command.CommandHandler;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.patterns.saga.SagaOrchestrator;
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
@CommandEvent(command = PayCheckoutCommand.class)
@Slf4j
public class PayCheckoutCommandHandler implements CommandHandler<PayCheckoutResponse, PayCheckoutCommand> {

    private final SagaOrchestrator sagaOrchestrator;

    @Value("${pattern.saga.timeout}")
    private int timeout;

    @Override
    public PayCheckoutResponse handle(PayCheckoutCommand payCheckoutCommand) {
        Saga<PayCheckoutResponse> saga = SagaFactory.payCheckoutSaga(UUID.randomUUID(), payCheckoutCommand);
        return sagaOrchestrator.orchestrate(saga, timeout);
    }
}
