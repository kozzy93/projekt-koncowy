package pl.edu.wszib.projektkoncowy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/monuments")
public class MonumentsController {

    @GetMapping
    public String showMonumentsPage() {
        return "monuments";
    }
}
