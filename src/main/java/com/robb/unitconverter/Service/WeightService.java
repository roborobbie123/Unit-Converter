package com.robb.unitconverter.Service;

import com.robb.unitconverter.Domain.Weight;
import org.springframework.stereotype.Service;

@Service
public class WeightService {

    public double convertWeight(double weight, String convertFrom, String convertTo) {
        switch(convertFrom) {
            case "mg":
                switch (convertTo) {
                    case "mg": weight = weight; break;
                    case "g": weight = weight / 1000; break;
                    case "kg": weight = weight / 1000000; break;
                    case "oz": weight = weight / 28350; break;
                    case "lb": weight = weight / 453600; break;
                }
                break;
            case "g":
                switch (convertTo) {
                    case "mg": weight = weight * 1000; break;
                    case "g": weight = weight; break;
                    case "kg": weight = weight / 1000; break;
                    case "oz": weight = weight / 28.35; break;
                    case "lb": weight = weight / 453.6; break;
                }
                break;
            case "kg":
                switch (convertTo) {
                    case "mg": weight = weight * 1000000; break;
                    case "g": weight = weight * 1000; break;
                    case "kg": weight = weight; break;
                    case "oz": weight = weight * 35.274; break;
                    case "lb": weight = weight * 2.20462; break;
                }
                break;
            case "oz":
                switch (convertTo) {
                    case "mg": weight =  weight * 28350; break;
                    case "g": weight = weight * 28.35; break;
                    case "kg": weight = weight / 35.274; break;
                    case "oz": weight = weight; break;
                    case "lb": weight = weight / 16; break;
                }
                break;
            case "lb":
                switch (convertTo) {
                    case "mg": weight = weight * 435600; break;
                    case "g": weight = weight * 453.6; break;
                    case "kg": weight = weight / 2.20462; break;
                    case "oz": weight = weight * 16; break;
                    case "lb": weight = weight; break;
                }
                break;


        }

        return weight;
    }
}
