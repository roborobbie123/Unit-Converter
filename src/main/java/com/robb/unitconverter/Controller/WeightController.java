package com.robb.unitconverter.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WeightController {

    @RequestMapping("/weight")
    public String getWeight(Model model) {
        return "weight";
    }
}
