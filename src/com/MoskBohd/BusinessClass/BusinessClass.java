package com.MoskBohd.BusinessClass;

import com.MoskBohd.Airplane.Airplane;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Currency;

public class BusinessClass {
    Airplane airplane;
    float Price;
    Currency currency;
    String fromTown;
    String toTown;
    LocalDate dateDeparture;
    LocalDate dateReturn;

    // Constructor
    public BusinessClass() {
    }

    public BusinessClass(Airplane airplane, float price, Currency currency, String fromTown, String toTown, LocalDate dateDeparture, LocalDate dateReturn) {
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
    public static class BusinessClassBuilder{
        private BusinessClass businessClass;

        public BusinessClassBuilder(){
            businessClass = new BusinessClass();
        }
        public BusinessClassBuilder withAirplane(Airplane airplane){
            businessClass.setAirplane(airplane);
            return this;
        }
        public BusinessClassBuilder withPrice(float price){
            businessClass.setPrice(price);
            return this;
        }
        public BusinessClassBuilder withCurrency(Currency currency){
            businessClass.setCurrency(currency);
            return this;
        }
        public BusinessClassBuilder withFromTown(String fromTown){
            businessClass.setFromTown(fromTown);
            return this;
        }
        public BusinessClassBuilder withToTown(String toTown){
            businessClass.setToTown(toTown);
            return this;
        }
        public BusinessClassBuilder withDateDeparture(LocalDate dateDeparture){
            businessClass.setDateDeparture(dateDeparture);
            return this;
        }
        public BusinessClassBuilder withDateReturn(LocalDate dateReturn){
            businessClass.setDateReturn(dateReturn);
            return this;
        }
        public BusinessClass build(){
            return businessClass;
        }
    }

    // Methods
    public float calculateTotalPrice(){
        if (!getDateReturn().equals(null)) return getPrice()*2;
        return getPrice();
    }
    public ArrayList<BusinessClass> findHighestPrice(ArrayList<BusinessClass> businessClasses){
        float tempPrice = businessClasses.get(0).getPrice();
        for (int i = 0; i < businessClasses.size(); i++) {
            if (tempPrice > businessClasses.get(i).getPrice()) {
                businessClasses.remove(i);
            }else tempPrice = businessClasses.get(i).getPrice();
        }
        return businessClasses;
    }
    public ArrayList<BusinessClass> findLowestPrice(ArrayList<BusinessClass> businessClasses){
        float tempPrice = businessClasses.get(0).getPrice();
        for (int i = 0; i < businessClasses.size(); i++) {
            if (tempPrice < businessClasses.get(i).getPrice()) {
                businessClasses.remove(i);
            }else tempPrice = businessClasses.get(i).getPrice();
        }
        return businessClasses;
    }
    public long findAmountOfDaysInCountry(BusinessClass businessClasses){
        return ChronoUnit.DAYS.between(businessClasses.dateDeparture, businessClasses.dateReturn);
    }
}
