package pl.edu.wszib.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.wszib.dao.GuideDao;
import pl.edu.wszib.projektkoncowy.model.GuideEntity;

@Service
public class GuideServiceImpl implements GuideService {

    @Autowired
    private GuideDao guideDao;

    @Override
    public GuideEntity save(GuideEntity guideEntity) {
        return null;
    }

    @Override
    public GuideEntity update(GuideEntity guideEntity) {
        return null;
    }

    @Override
    public GuideEntity get(Integer id) {
        return null;
    }

    @Override
    public void delete(GuideEntity guideEntity) {

    }
}
