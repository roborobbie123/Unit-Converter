package com.robb.unitconverter.Controller;


import com.robb.unitconverter.Service.WeightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WeightController {

    @Autowired
    private WeightService weightService;

    @RequestMapping("/weight")
    public String getWeight(Model model) {
        return "weight";
    }

    @PostMapping("/weight")
    public String convertWeight(@RequestParam double weight, @RequestParam String unitToConvertFrom, @RequestParam String unitToConvertTo, Model model) {
        model.addAttribute("weight", weight);

        System.out.println(weight + " " + unitToConvertFrom + " " + unitToConvertTo);
        System.out.println(weightService.convertWeight(weight, unitToConvertFrom, unitToConvertTo));

        model.addAttribute("convertedWeight", weightService.convertWeight(weight, unitToConvertFrom, unitToConvertTo));
        model.addAttribute("unit1", unitToConvertFrom);
        model.addAttribute("unit2", unitToConvertTo);
        return "weight";
    }
}
