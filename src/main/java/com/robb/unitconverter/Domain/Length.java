package com.robb.unitconverter.Domain;

public class Length {
    double length;
    String convertFrom;
    String convertTo;


    public Length() {}

    public Length(double length, String convertFrom, String convertTo) {
        this.length = length;
        this.convertFrom = convertFrom;
        this.convertTo = convertTo;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public String getConvertFrom() {
        return convertFrom;
    }
    public void setConvertFrom(String convertFrom) {
        this.convertFrom = convertFrom;
    }

    public String getConvertTo() {
        return convertTo;
    }
    public void setConvertTo(String convertTo) {
        this.convertTo = convertTo;
    }
}
