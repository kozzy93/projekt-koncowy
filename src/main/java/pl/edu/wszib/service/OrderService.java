package pl.edu.wszib.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import pl.edu.wszib.dao.GuideDao;
import pl.edu.wszib.dao.OrderDao;
import pl.edu.wszib.mappers.OrderAddressMapper;
import pl.edu.wszib.projektkoncowy.model.OrderAddressEntity;
import pl.edu.wszib.projektkoncowy.model.OrderAddressModel;
import pl.edu.wszib.projektkoncowy.model.OrderEntity;

import javax.transaction.Transactional;

@Service
public class OrderService {

    private final GuideDao guideDao;

    private OrderDao orderDao;

    public OrderService(GuideDao guideDao, OrderDao orderDao) {
        this.guideDao = guideDao;
        this.orderDao = orderDao;
    }

    public GuideDao getGuideDao() {
        return guideDao;
    }

    public OrderDao getOrderDao() {
        return orderDao;
    }

    private Integer orderId;

    @Transactional
    public void saveOrder(OrderAddressModel orderAddressModel) {

        OrderAddressEntity orderAddressEntity = OrderAddressMapper.toEntity(orderAddressModel);

        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setGuideName(orderAddressEntity.getGuide());
        orderEntity.setVisitingDate(orderAddressEntity.getVisitingDate());
        orderEntity.setVisitingTime(orderAddressEntity.getVisitingTime());
        orderEntity.setOrderAddress(orderAddressEntity);
        orderEntity.setGuideTimeDate(orderAddressEntity.getGuide() + orderAddressEntity.getVisitingTime() + orderAddressEntity.getVisitingDate());
        orderEntity.setMonuments(orderAddressEntity.getMonumentOrder());
        orderEntity.setPhoneNumber(orderAddressEntity.getPhoneNumber());

        orderDao.save(orderEntity);

        orderId = orderEntity.getId();
    }

    public Integer changeOrderId(OrderAddressModel orderAddressModel) {
        orderAddressModel.setOrderId(orderId);
        return orderAddressModel.getOrderId();
    }


    public void checkGuide(OrderAddressModel orderAddressModel) throws ResponseStatusException {
        if (guideExist(orderAddressModel.getGuide() + orderAddressModel.getVisitingTime() + orderAddressModel.getVisitingDate()) == false) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
    }

    private boolean guideExist(String guideTimeDate) {
        if (orderDao.findByGuideTimeDate(guideTimeDate) != null)
            return false;
        else return true;
    }

}

