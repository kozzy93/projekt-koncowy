package pl.edu.wszib.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.projektkoncowy.model.GuideEntity;

@Repository
public interface GuideDao extends JpaRepository<GuideEntity, Integer> {
}
