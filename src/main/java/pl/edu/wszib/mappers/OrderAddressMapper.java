package pl.edu.wszib.mappers;

import pl.edu.wszib.projektkoncowy.model.OrderAddressEntity;
import pl.edu.wszib.projektkoncowy.model.OrderAddressModel;

public class OrderAddressMapper {


    public static OrderAddressEntity toEntity(OrderAddressModel model) {
        OrderAddressEntity entity = new OrderAddressEntity();
        entity.setFirstName(model.getFirstName());
        entity.setLastName(model.getLastName());
        entity.setCity(model.getCity());
        entity.setStreet(model.getStreet());
        entity.setPostalCode(model.getPostalCode());
        entity.setGuide(model.getGuide());
        entity.setMonumentOrder(model.getMonumentOrder());
        entity.setVisitingDate(model.getVisitingDate());
        entity.setVisitingTime(model.getVisitingTime());
        entity.setPhoneNumber(model.getPhoneNumber());
        return entity;
    }
}
