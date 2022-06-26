package pl.edu.wszib.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.projektkoncowy.model.MonumentEntity;

import java.util.List;

@Repository
public interface MonumentDao extends JpaRepository<MonumentEntity, Integer> {

    List<MonumentEntity> findAllByCity_Id(Integer cityId);
}
