package pl.edu.wszib.projektkoncowy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.edu.wszib.dao.OrderAddressDao;
import pl.edu.wszib.projektkoncowy.model.OrderAddressEntity;

import java.util.List;

@Controller
@RequestMapping("admin/orders")
public class AdminController {

    private final OrderAddressDao orderAddressDao;

    public AdminController(OrderAddressDao orderAddressDao) {
        this.orderAddressDao = orderAddressDao;
    }

    @GetMapping
    public String showAdminPage(Model model) {
        List<OrderAddressEntity> orderaddress = orderAddressDao.findAll();
        model.addAttribute("orders", orderaddress);
        return "adminpage";
    }
}
