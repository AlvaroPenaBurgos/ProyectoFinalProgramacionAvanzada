package edu.programacion.avanzada.Alvaro.ProyectoFinal.repositories;

import edu.programacion.avanzada.Alvaro.ProyectoFinal.domain.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author aluis on 7/10/2022.
 */
@Repository
public interface CheckoutRepository extends JpaRepository<Checkout, UUID> {
}
