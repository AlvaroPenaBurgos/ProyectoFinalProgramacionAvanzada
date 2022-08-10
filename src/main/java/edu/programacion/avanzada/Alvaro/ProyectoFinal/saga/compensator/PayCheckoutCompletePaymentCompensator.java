package edu.programacion.avanzada.Alvaro.ProyectoFinal.saga.compensator;

import edu.programacion.avanzada.Alvaro.ProyectoFinal.model.response.checkout.PayCheckoutResponse;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.patterns.saga.model.SagaPayload;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.patterns.saga.model.SagaStepCompensator;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.command.checkout.PayCheckoutCommand;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.domain.Order;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.repositories.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author aluis on 7/24/2022.
 */
@RequiredArgsConstructor
@Component
public class PayCheckoutCompletePaymentCompensator implements SagaStepCompensator<PayCheckoutResponse> {

    private final OrderRepository orderRepository;

    @Override
    public void handle(SagaPayload<PayCheckoutResponse> sagaPayload) {
        Order order = sagaPayload.getProperty(PayCheckoutCommand.ORDER);
        orderRepository.delete(order);
    }
}
