package edu.programacion.avanzada.Alvaro.ProyectoFinal.saga.step;

import edu.programacion.avanzada.Alvaro.ProyectoFinal.model.response.checkout.PayCheckoutResponse;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.patterns.saga.model.SagaStepCompensator;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.patterns.saga.model.SagaStepHandler;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.saga.compensator.PayCheckoutCompletePaymentCompensator;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.patterns.saga.model.SagaStep;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.saga.handler.PayCheckoutCompletePaymentHandler;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author aluis on 7/17/2022.
 */
@RequiredArgsConstructor
@Component
@Slf4j
public class PayCheckoutCompletePaymentStep implements SagaStep<PayCheckoutResponse> {

    private final PayCheckoutCompletePaymentHandler payCheckoutCompletePaymentHandler;
    private final PayCheckoutCompletePaymentCompensator payCheckoutCompletePaymentCompensator;

    @Override
    public String getName() {
        return "Complete Payment";
    }

    @Override
    public SagaStepHandler<PayCheckoutResponse> getHandler() {
        return payCheckoutCompletePaymentHandler;
    }

    @Override
    public SagaStepCompensator<PayCheckoutResponse> getCompensator() {
        return payCheckoutCompletePaymentCompensator;
    }
}
