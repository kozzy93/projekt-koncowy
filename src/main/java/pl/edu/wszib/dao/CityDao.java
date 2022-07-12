package pl.edu.wszib.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.projektkoncowy.model.CityEntity;

@Repository
public interface CityDao extends CrudRepository<CityEntity, Integer> {
}
