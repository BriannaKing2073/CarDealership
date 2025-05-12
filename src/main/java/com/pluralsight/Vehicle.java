package com.pluralsight;

public class Vehicle {

    private int vin;
    private int year;
    private String make;
    private String model;
    private String vehicleType;
    private String color;
    private int odometer;
    private double price;

    //Constructors

    public Vehicle(int vin, int year, String make, String model, String vehicleType, String color, int odometer, double price) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }

    //Getters and Setters

    //Vin
    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }
    //Year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    //Make
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
    //Model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    //Vehicle Type
    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    //Color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //Odometer
    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
    //Price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    Vehicle vehicle = new Vehicle (vin, year, make, model, vehicleType, color, odometer, price );
}
