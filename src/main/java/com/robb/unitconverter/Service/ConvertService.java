package com.robb.unitconverter.Service;

import org.springframework.stereotype.Service;

@Service
public class ConvertService {

    public double convertLength(double length, String convertFrom, String convertTo) {
        switch (convertFrom) {
            case "mm":
                switch (convertTo) {
                    case "mm": length = length; break;
                    case "cm": length = length / 10; break;
                    case "m" : length = length /1000; break;
                    case "km": length = length / 1000000; break;
                    case "in": length = length / 25.4; break;
                    case "ft": length = length / 304.8; break;
                    case "yd": length = length / 914.4; break;
                    case "mi": length = length / 1609340000; break;
                }
                break;
            case "cm":
                switch (convertTo) {
                    case "mm": length = length * 10; break;
                    case "cm": length = length; break;
                    case "m" : length = length /100; break;
                    case "km": length = length / 100000; break;
                    case "in": length = length / 2.54; break;
                    case "ft": length = length / 30.48; break;
                    case "yd": length = length / 91.44; break;
                    case "mi": length = length / 160934000.0; break;
                }
                break;
            case "m":
                switch (convertTo) {
                    case "mm": length = length * 1000; break;
                    case "cm": length = length * 100; break;
                    case "m" : length = length; break;
                    case "km": length = length / 1000; break;
                    case "in": length = length / 0.0254; break;
                    case "ft": length = length / 0.3048; break;
                    case "yd": length = length / 0.9144; break;
                    case "mi": length = length / 1609340.0; break;
                }
                break;
            case "km":
                switch (convertTo) {
                    case "mm": length = length * 1000000; break;
                    case "cm": length = length * 100000; break;
                    case "m" : length = length * 1000; break;
                    case "km": length = length; break;
                    case "in": length = length / 0.0000254; break;
                    case "ft": length = length / 0.0003048; break;
                    case "yd": length = length / 0.0009144; break;
                    case "mi": length = length / 1.60934; break;
                }
                break;
            case "in":
                switch (convertTo) {
                    case "mm": length = length * 25.4; break;
                    case "cm": length = length * 2.54; break;
                    case "m" : length = length / 39.37; break;
                    case "km": length = length / 39370; break;
                    case "in": length = length; break;
                    case "ft": length = length / 12; break;
                    case "yd": length = length / 36; break;
                    case "mi": length = length / 63360; break;
                }
                break;
            case "ft":
                switch (convertTo) {
                    case "mm": length = length * 304.8; break;
                    case "cm": length = length * 30.48; break;
                    case "m" : length = length / 3.28084; break;
                    case "km": length = length / 3280.84; break;
                    case "in": length = length * 12; break;
                    case "ft": length = length; break;
                    case "yd": length = length / 3; break;
                    case "mi": length = length / 5280; break;
                }
                break;
            case "yd":
                switch (convertTo) {
                    case "mm": length = length * 914.4; break;
                    case "cm": length = length * 91.44; break;
                    case "m" : length = length / 1.09361; break;
                    case "km": length = length / 1093.61; break;
                    case "in": length = length * 36; break;
                    case "ft": length = length * 3; break;
                    case "yd": length = length; break;
                    case "mi": length = length / 1760; break;
                }
                break;
            case "mile":
                switch (convertTo) {
                    case "mm": length = length * 1609340.0;
                        System.out.println("confirm");break;
                    case "cm": length = length * 160934.0; break;
                    case "m" : length = length * 1609.34; break;
                    case "km": length = length * 1.60934; break;
                    case "in": length = length * 63360.0; break;
                    case "ft": length = length * 5280.0; break;
                    case "yd": length = length * 1760.0; break;
                    case "mi": length = length; break;
                }
                break;

        }

        return length;
    }
}
