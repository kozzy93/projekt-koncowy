package pl.edu.wszib.projektkoncowy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rome")
public class RomeController {

    @GetMapping
    public String showRomePage() { return "romepage";}
}
