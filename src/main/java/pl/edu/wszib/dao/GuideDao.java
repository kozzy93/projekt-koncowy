package pl.edu.wszib.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.projektkoncowy.model.GuideEntity;

import java.util.List;

@Repository
public interface GuideDao extends JpaRepository<GuideEntity, Integer> {

    List<GuideEntity> findAllByCity_Id(Integer cityid);
}
