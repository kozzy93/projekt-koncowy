package pl.edu.wszib.service;

import org.springframework.stereotype.Service;
import pl.edu.wszib.dao.GuideDao;
import pl.edu.wszib.dao.OrderDao;
import pl.edu.wszib.mappers.OrderAddressMapper;
import pl.edu.wszib.projektkoncowy.model.OrderAddressEntity;
import pl.edu.wszib.projektkoncowy.model.OrderAddressModel;
import pl.edu.wszib.projektkoncowy.model.OrderEntity;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

@Service
public class OrderService {

    private final GuideDao guideDao;
    private final OrderDao orderDao;

    public OrderService(GuideDao guideDao, OrderDao orderDao) {
        this.guideDao = guideDao;
        this.orderDao = orderDao;
    }

    @Transactional
    public void saveOrder(Integer guideId, OrderAddressModel orderAddressModel) {
        guideDao.findById(guideId).orElseThrow(EntityNotFoundException::new);

        OrderAddressEntity orderAddressEntity = OrderAddressMapper.toEntity(orderAddressModel);

        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setGuideName(orderEntity.getGuideName());
        orderEntity.setOrderAddress(orderAddressEntity);

        orderDao.save(orderEntity);
    }
}
