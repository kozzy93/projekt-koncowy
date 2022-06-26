package pl.edu.wszib.service;

import org.springframework.stereotype.Component;
import pl.edu.wszib.projektkoncowy.model.GuideEntity;

import java.util.List;

@Component
public interface GuideService {

    public GuideEntity save(GuideEntity guideEntity);
    public GuideEntity update(GuideEntity guideEntity);
    public GuideEntity get(Integer id);
    public void delete(GuideEntity guideEntity);
}
