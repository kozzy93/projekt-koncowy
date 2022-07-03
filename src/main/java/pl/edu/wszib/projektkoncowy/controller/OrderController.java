package pl.edu.wszib.projektkoncowy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.edu.wszib.dao.CityDao;
import pl.edu.wszib.dao.GuideDao;
import pl.edu.wszib.dao.MonumentDao;
import pl.edu.wszib.dao.OrderDao;
import pl.edu.wszib.projektkoncowy.model.*;
import pl.edu.wszib.service.GuideService;
import pl.edu.wszib.service.OrderService;

import javax.validation.constraints.NotNull;
import java.util.List;

@Controller
public class OrderController {

    @Autowired
    private GuideService guideService;

    private final OrderService orderService;

    @Autowired
    private final GuideDao guideDao;
    private final CityDao cityDao;
    private final MonumentDao monumentDao;


    public OrderController(OrderService orderService, GuideDao guideDao, CityDao cityDao, MonumentDao monumentDao) {
        this.orderService = orderService;
        this.guideDao = guideDao;
        this.cityDao = cityDao;
        this.monumentDao = monumentDao;
    }

    @GetMapping({"/order", "/order/{cityid}"})
    public String showOrderPage(@PathVariable(required = false) Integer cityid,
            @ModelAttribute("orderAddress") OrderAddressModel orderAddress,
            Model model) {

        if (cityid != null && cityid == 1) {
            List<GuideEntity> guides = guideDao.findAllByCity_Id(cityid);
            model.addAttribute("guides", guides);
            List<MonumentEntity> monuments = monumentDao.findAllByCity_Id(cityid);
            model.addAttribute("monuments", monuments);
            return "orderpageroma";
        }

        if (cityid != null && cityid == 2) {
            List<GuideEntity> guides = guideDao.findAll();
            model.addAttribute("guides", guides);
            List<MonumentEntity> monuments = monumentDao.findAll();
            model.addAttribute("monuments", monuments);
        }
        if (cityid != null && cityid == 3) {
            List<GuideEntity> guides = guideDao.findAll();
            model.addAttribute("guides", guides);
            List<MonumentEntity> monuments = monumentDao.findAll();
            model.addAttribute("monuments", monuments);
        }

        return "orderpage";
    }

    @PostMapping({"/order", "/order/{cityid}"})
    public String processTripOrder(@ModelAttribute("orderAddress") OrderAddressModel orderAddress) {


        try {
            orderService.checkGuide(orderAddress);
        } catch (Exception e) {
           return "redirect:/errorpage";
        }

        orderService.saveOrder(orderAddress);

        Integer orderId = orderService.changeOrderId(orderAddress);

        return "redirect:/confirmation/" + orderId;
    }
}
