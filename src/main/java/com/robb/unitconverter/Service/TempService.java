package com.robb.unitconverter.Service;

import org.springframework.stereotype.Service;

@Service
public class TempService {
    public double convertTemp(double temp, String convertFrom, String convertTo) {
        switch (convertFrom) {
            case "Celsius":
                switch (convertTo) {
                    case "Celsius": temp = temp; break;
                    case "Fahrenheit": temp = temp * (9.0/5.0) + 32; break;
                    case "Kelvin": temp = temp + 273.15; break;
                }
                break;
            case "Fahrenheit":
                switch (convertTo) {
                    case "Celsius": temp = (5.0/9.0) * (temp - 32); break;
                    case "Fahrenheit": temp = temp; break;
                    case "Kelvin": temp = temp + (5.0/9.0) * (temp - 32) + 273.15; break;
                }
                break;
            case "Kelvin":
                switch (convertTo) {
                    case "Celsius": temp = temp - 273.15; break;
                    case "Fahrenheit": temp = (temp - 273.15) * (9.0/5.0) + 32; break;
                    case "Kelvin": temp = temp; break;
                }
                break;

        }
        return temp;
    }
}
