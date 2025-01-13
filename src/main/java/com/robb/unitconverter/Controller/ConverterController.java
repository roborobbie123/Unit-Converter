package com.robb.unitconverter.Controller;

import com.robb.unitconverter.Domain.Length;
import com.robb.unitconverter.Service.ConvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ConverterController {

    @Autowired
    private ConvertService convertService;

    @RequestMapping("/length")
    public String getLength(Model model) {
        return "length";
    }

    @PostMapping("/length")
    public String convertLength(@RequestParam double length, @RequestParam String unitToConvertFrom, @RequestParam String unitToConvertTo, Model model) {
        System.out.println(length + " " + unitToConvertFrom + " " + unitToConvertTo);
        convertService.convertLength(length, unitToConvertFrom, unitToConvertTo);
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
