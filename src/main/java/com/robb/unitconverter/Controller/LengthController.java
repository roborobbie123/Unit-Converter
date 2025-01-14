package com.robb.unitconverter.Controller;

import com.robb.unitconverter.Service.ConvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LengthController {

    @Autowired
    private ConvertService convertService;

    @RequestMapping("/length")
    public String getLength(Model model) {
        return "length";
    }

    @PostMapping("/length")
    public String convertLength(@RequestParam double length, @RequestParam String unitToConvertFrom, @RequestParam String unitToConvertTo, Model model) {
        model.addAttribute("length", length);

        System.out.println(length + " " + unitToConvertFrom + " " + unitToConvertTo);
        System.out.println(convertService.convertLength(length, unitToConvertFrom, unitToConvertTo));

        model.addAttribute("convertedLength", convertService.convertLength(length, unitToConvertFrom, unitToConvertTo));
        model.addAttribute("unit2", unitToConvertTo);
        model.addAttribute("unit1", unitToConvertFrom);
        return "length";
    }
}
