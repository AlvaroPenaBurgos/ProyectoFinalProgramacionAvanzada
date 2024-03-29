package edu.programacion.avanzada.Alvaro.ProyectoFinal.services;

import edu.programacion.avanzada.Alvaro.ProyectoFinal.domain.Order;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.model.dto.OrderDTO;
import edu.programacion.avanzada.Alvaro.ProyectoFinal.repositories.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @author aluis on 7/10/2022.
 */
@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public List<OrderDTO> getAll() {
        return orderRepository.findAll().stream().map(Order::toDTO).collect(Collectors.toList());
    }

    public OrderDTO get(UUID id) {
        return orderRepository.findById(id).orElseThrow().toDTO();
    }
}
