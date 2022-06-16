package pl.edu.wszib.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.projektkoncowy.model.CityEntity;

@Repository
public interface CityDao extends JpaRepository<CityEntity, Integer> {
}
