package pl.edu.wszib.projektkoncowy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.edu.wszib.dao.OrderDao;
import pl.edu.wszib.projektkoncowy.model.OrderEntity;

import java.util.List;

@Controller
@RequestMapping()
public class OrderConfirmationController {

    private final OrderDao orderDao;

    public OrderConfirmationController(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    @GetMapping({"/confirmation", "/confirmation/{orderid}"})
    public String showConfirmationPage(@PathVariable(required = false) Integer orderid, Model model) {
        if (orderid != null) {
            List<OrderEntity> orders = orderDao.findAllById(orderid);
            model.addAttribute("orders", orders);
            return "orderconfirmationpage";

        }
        return "orderconfirmationpage";
    }
}

