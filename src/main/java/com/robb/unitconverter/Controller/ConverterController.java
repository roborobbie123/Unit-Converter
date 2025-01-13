package com.robb.unitconverter.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ConverterController {

    @RequestMapping("/length")
    public String getLength(Model model) {
        return "length";
    }

    @RequestMapping("/weight")
    public String getWeight(Model model) {
        return "weight";
    }

    @RequestMapping("/temperature")
    public String getTemp(Model model) {
        return "temperature";
    }
}
