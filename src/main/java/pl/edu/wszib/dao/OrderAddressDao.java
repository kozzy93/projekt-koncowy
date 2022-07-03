package pl.edu.wszib.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.projektkoncowy.model.OrderAddressEntity;

@Repository
public interface OrderAddressDao extends JpaRepository<OrderAddressEntity, Integer> {
}
