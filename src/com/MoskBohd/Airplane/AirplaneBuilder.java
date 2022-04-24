package com.MoskBohd.Airplane;

public class AirplaneBuilder implements IAirplaneBuilder{
    private Airplane airplane;

    public AirplaneBuilder(){
        airplane = new Airplane();
    }

    @Override
    public AirplaneBuilder setAirplaneName(String airplaneName) {
        airplane.setAirplaneName(airplaneName);
        return this;
    }

    @Override
    public AirplaneBuilder setAirplaneClass(EnumAirplaneClass airplaneClass) {
        airplane.setAirplaneClass(airplaneClass);
        return this;
    }
    @Override
    public AirplaneBuilder setMaxPassengers(int maxPassengers) {
        airplane.setMaxPassengers(maxPassengers);
        return this;
    }

    @Override
    public AirplaneBuilder setSerialNumber(String serialNumber) {
        airplane.setSerialNumber(serialNumber);
        return this;
    }

    public Airplane buildAirplane(){
        return airplane;
    }
}
