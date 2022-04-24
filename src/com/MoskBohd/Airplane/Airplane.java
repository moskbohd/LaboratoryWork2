package com.MoskBohd.Airplane;

import java.time.LocalDate;
import java.util.Date;

public class Airplane {

    private String airplaneName;
    private EnumAirplaneClass airplaneClass;
    private int maxPassengers;
    private String serialNumber;

    // Constructor
    public Airplane() {
    }

    public Airplane(EnumAirplaneClass airplaneClass, int maxPassengers, Date yearOfProduction, String serialNumber) {
        this.airplaneClass = airplaneClass;
        this.maxPassengers = maxPassengers;
        this.serialNumber = serialNumber;
    }

    // Getter and Setters

    public String getAirplaneName() {
        return airplaneName;
    }

    public void setAirplaneName(String airplaneName) {
        this.airplaneName = airplaneName;
    }

    public EnumAirplaneClass getAirplaneClass(EnumAirplaneClass light) {
        return airplaneClass;
    }

    public void setAirplaneClass(EnumAirplaneClass airplaneClass) {
        this.airplaneClass = airplaneClass;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    // Override methods
    @Override
    public String toString() {
        return "Airplane{" +
                "airplaneName=" + airplaneName +
                "airplaneClass=" + airplaneClass +
                ", maxPassengers=" + maxPassengers +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    // Methods

}
