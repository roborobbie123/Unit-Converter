package com.robb.unitconverter.Controller;

import com.robb.unitconverter.Service.TempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TempController {

    @Autowired
    private TempService tempService;

    @RequestMapping("/temperature")
    public String getTemp(Model model) {
        return "temperature";
    }

    @PostMapping("/temperature")
    public String convertTemp(@RequestParam double temperature, @RequestParam String unitToConvertFrom, @RequestParam String unitToConvertTo, Model model) {
        model.addAttribute("temperature", temperature);

        System.out.println(temperature + " " + unitToConvertFrom + " " + unitToConvertTo);
        System.out.println(tempService.convertTemp(temperature, unitToConvertFrom, unitToConvertTo));

        model.addAttribute("convertedTemperature", tempService.convertTemp(temperature, unitToConvertFrom, unitToConvertTo));
        model.addAttribute("unit2", unitToConvertTo);
        model.addAttribute("unit1", unitToConvertFrom);

        return "temperature";
    }

}
