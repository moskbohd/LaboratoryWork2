package com.MoskBohd.Airplane;

import java.time.LocalDate;
import java.util.Date;

public interface IAirplaneBuilder {

    AirplaneBuilder setAirplaneName(String airplaneName);
    AirplaneBuilder setAirplaneClass(EnumAirplaneClass airplaneClass);
    AirplaneBuilder setMaxPassengers(int maxPassengers);
    AirplaneBuilder setSerialNumber(String serialNumber);
}
