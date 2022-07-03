package pl.edu.wszib.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.projektkoncowy.model.OrderEntity;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface OrderDao extends JpaRepository<OrderEntity, Integer> {

    String findByGuideName(String guideName);
    String findByVisitingDate(String visitingDate);
    String findByVisitingTime(String visitingTime);
    String findByGuideTimeDate(String guideTimeDate);
    List<OrderEntity> findAllById(Integer id);

}
