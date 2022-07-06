package pl.edu.wszib.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.projektkoncowy.model.OrderEntity;

import java.util.List;

@Repository
public interface OrderDao extends JpaRepository<OrderEntity, Integer> {

    String findByGuideName(String guideName);

    String findByVisitingDate(String visitingDate);

    String findByVisitingTime(String visitingTime);

    String findByGuideTimeDate(String guideTimeDate);

    List<OrderEntity> findAllById(Integer id);

}
