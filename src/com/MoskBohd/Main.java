package com.MoskBohd;

import com.MoskBohd.Airplane.Airplane;
import com.MoskBohd.Airplane.AirplaneBuilder;
import com.MoskBohd.Airplane.EnumAirplaneClass;
import com.MoskBohd.BusinessClass.BusinessClass;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // build light airplane
        Airplane airplaneBusiness = new AirplaneBuilder()
                .setAirplaneClass(EnumAirplaneClass.LIGHT)
                .setAirplaneName("YAMAHO-1212")
                .setMaxPassengers(12)
                .setSerialNumber("G12-576O-P")
                .buildAirplane();
        // build airline airplane
        Airplane airplaneAirline = new AirplaneBuilder()
                .setAirplaneClass(EnumAirplaneClass.AIRLINER)
                .setMaxPassengers(112)
                .setAirplaneName("AIRLINER-2000")
                .setSerialNumber("ZO-SABRINE")
                .buildAirplane();
        // build midsize airplane
        Airplane airplaneMidsize = new AirplaneBuilder()
                .setAirplaneClass(EnumAirplaneClass.MIDSIZE)
                .setMaxPassengers(20)
                .setAirplaneName("SMALL-FLAYER")
                .setSerialNumber("GO-12SO-20")
                .buildAirplane();

        // build business ticket to business airplane
        BusinessClass businessClassBusiness = new BusinessClass.BusinessClassBuilder()
                .withAirplane(airplaneBusiness)
                .withCurrency(Currency.getInstance(Locale.GERMANY))
                .withPrice(127.50f)
                .withFromTown("Kyiv")
                .withToTown("Bratislava")
                .withDateDeparture("12/04/2021")
                .build();

        // build business ticket to airline airplane
        BusinessClass businessClassAirline = new BusinessClass.BusinessClassBuilder()
                .withDateDeparture("26/04/2021")
                .withCurrency(Currency.getInstance("EUR"))
                .withPrice(45.99f)
                .withFromTown("Budapest")
                .withToTown("Warsaw")
                .withAirplane(airplaneAirline)
                .build();

        // build business ticket to midsize airplane
        BusinessClass businessClassMidsize = new BusinessClass.BusinessClassBuilder()
                .withDateDeparture("02/04/2021")
                .withDateReturn("30/04/2021")
                .withCurrency(Currency.getInstance("EUR"))
                .withPrice(35f)
                .withFromTown("Praha")
                .withToTown("Kyiv")
                .withAirplane(airplaneMidsize)
                .build();

        // build low-cost ticket to Airline airplane
        BusinessClass lowCostClassAirline = new BusinessClass.BusinessClassBuilder()
                .withDateDeparture("14/04/2021")
                .withCurrency(Currency.getInstance("EUR"))
                .withPrice(11.99f)
                .withFromTown("Warsaw")
                .withToTown("Praha")
                .withAirplane(airplaneAirline)
                .build();

        // build low-cost ticket to midsize airplane
        BusinessClass lowCostClassMidsize = new BusinessClass.BusinessClassBuilder()
                .withDateDeparture("20/04/2021")
                .withDateReturn("21/04/2021")
                .withCurrency(Currency.getInstance("EUR"))
                .withPrice(6.99f)
                .withFromTown("Kishinev")
                .withToTown("Kyiv")
                .withAirplane(airplaneMidsize)
                .build();

        System.out.println(lowCostClassAirline.findTheCostOfBookingTheEntireFlight());
        System.out.println(lowCostClassMidsize.findTheCostOfBookingTheEntireFlight());
        System.out.println(lowCostClassMidsize.findAmountOfDaysInCountry());
        ArrayList<BusinessClass> businessClasses = new ArrayList<BusinessClass>();
        businessClasses.add(businessClassAirline);
        businessClasses.add(businessClassBusiness);
        businessClasses.add(businessClassMidsize);
        for (BusinessClass businessClass :
                businessClassAirline.findLowestPrice(businessClasses)) {
            System.out.println(businessClass.toString());
        }
    }
}
