package models;

import java.util.Arrays;
import java.util.List;

public class Car {

    private String companyName, modeName, color, transmission, carType;
    private int price, seats;
    private double mileage;
    private boolean usage;

    public Car(String companyName, String modeName, String color, String transmission, String carType, int price, int seats, double mileage, boolean usage) {
        setCompanyName(companyName);
        setModeName(modeName);
        setColor(color);
        setTransmission(transmission);
        setCarType(carType);
        setPrice(price);
        setSeats(seats);
        setMileage(mileage);
        setUsage(usage);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getModeName() {
        return modeName;
    }

    public void setModeName(String modeName) {
        this.modeName = modeName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {

        List<String> transmissions = Arrays.asList("gear","automatic");
        if (transmissions.contains(transmission.toLowerCase()))
            this.transmission = transmission;
        else
            throw new IllegalArgumentException(transmission + " is not an option, use: "+transmissions);
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {

        List<String> carsType = Arrays.asList("sedan","sports", "hatchback", "convertible", "minivan", "wagon");
        if (carsType.contains(carType.toLowerCase()))
            this.carType = carType;
        else
            throw new IllegalArgumentException(carType + " is not an option, use: "+carsType);

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {

        if(seats>=1 && seats<=10)
            this.seats = seats;
        else
            throw new IllegalArgumentException("The cars seats must be between 1-10");
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public boolean isUsage() {
        return usage;
    }

    public void setUsage(boolean usage) {
        this.usage = usage;
    }


}
