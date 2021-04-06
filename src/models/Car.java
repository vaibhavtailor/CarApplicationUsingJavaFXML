package models;

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
        this.transmission = transmission;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
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
        this.seats = seats;
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
