package com.robb.unitconverter.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TempController {

    @RequestMapping("/temperature")
    public String getTemp(Model model) {
        return "temperature";
    }

}
