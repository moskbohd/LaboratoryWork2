package com.MoskBohd.LowCost;

import com.MoskBohd.Airplane.Airplane;
import com.MoskBohd.Airplane.AirplaneBuilder;
import com.MoskBohd.Airplane.EnumAirplaneClass;
import com.MoskBohd.BusinessClass.BusinessClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Currency;

public class LowCost {
    Airplane airplane;
    float Price;
    Currency currency;
    String fromTown;
    String toTown;
    LocalDate dateDeparture;
    LocalDate dateReturn;

    // Construct
    public LowCost() {
    }

    public LowCost(Airplane airplane, float price, Currency currency, String fromTown, String toTown, LocalDate dateDeparture, LocalDate dateReturn) {
        this.airplane = airplane;
        Price = price;
        this.currency = currency;
        this.fromTown = fromTown;
        this.toTown = toTown;
        this.dateDeparture = dateDeparture;
        this.dateReturn = dateReturn;
    }

    // Getters and Setters
    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getFromTown() {
        return fromTown;
    }

    public void setFromTown(String fromTown) {
        this.fromTown = fromTown;
    }

    public String getToTown() {
        return toTown;
    }

    public void setToTown(String toTown) {
        this.toTown = toTown;
    }

    public LocalDate getDateDeparture() {
        return dateDeparture;
    }

    public void setDateDeparture(LocalDate dateDeparture) {
        this.dateDeparture = dateDeparture;
    }

    public LocalDate getDateReturn() {
        return dateReturn;
    }

    public void setDateReturn(LocalDate dateReturn) {
        this.dateReturn = dateReturn;
    }

    // Override methods
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    // Builder
    public static class LowCostBuilder {
        private LowCost lowCost;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

        public LowCostBuilder(){
            lowCost = new LowCost();
        }
        public LowCostBuilder withAirplane(Airplane airplane){
            lowCost.setAirplane(airplane);
            return this;
        }
        public LowCostBuilder withPrice(float price){
            lowCost.setPrice(price);
            return this;
        }
        public LowCostBuilder withCurrency(Currency currency){
            lowCost.setCurrency(currency);
            return this;
        }
        public LowCostBuilder withFromTown(String fromTown){
            lowCost.setFromTown(fromTown);
            return this;
        }
        public LowCostBuilder withToTown(String toTown){
            lowCost.setToTown(toTown);
            return this;
        }
        public LowCostBuilder withDateDeparture(String dateDeparture){
            //convert String to LocalDate
            LocalDate localDate = LocalDate.parse(dateDeparture, formatter);
            lowCost.setDateDeparture(localDate);
            return this;
        }
        public LowCostBuilder withDateReturn(String dateReturn){
            //convert String to LocalDate
            LocalDate localDate = LocalDate.parse(dateReturn, formatter);
            lowCost.setDateReturn(localDate);
            return this;
        }
        public LowCost build(){
            return lowCost;
        }
    }

    // Methods
}
