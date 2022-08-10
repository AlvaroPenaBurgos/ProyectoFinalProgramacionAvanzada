package edu.programacion.avanzada.Alvaro.ProyectoFinal.patterns.saga.model;

public interface SagaStepCompensator<T> {

    void handle(SagaPayload<T> sagaPayload);
}
