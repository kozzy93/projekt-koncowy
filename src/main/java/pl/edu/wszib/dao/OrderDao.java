package pl.edu.wszib.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.wszib.projektkoncowy.model.OrderEntity;


public interface OrderDao  extends JpaRepository<OrderEntity, Integer> {
}
