package com.pluralsight;

import java.util.ArrayList;

public class Dealership {

    private String dealershipName;
    private String dealershipAddress;
    private String dealershipPhone;

    //Constructors

    public Dealership(String dealershipName, String dealershipAddress, String dealershipPhone) {
        this.dealershipName = dealershipName;
        this.dealershipAddress = dealershipAddress;
        this.dealershipPhone = dealershipPhone;
    }

    //Getters and Setters

    //Name
    public String getDealershipName() {
        return dealershipName;
    }

    public void setDealershipName(String dealershipName) {
        this.dealershipName = dealershipName;
    }
    //Address
    public String getDealershipAddress() {
        return dealershipAddress;
    }

    public void setDealershipAddress(String dealershipAddress) {
        this.dealershipAddress = dealershipAddress;
    }
    //Phone
    public String getDealershipPhone() {
        return dealershipPhone;
    }

    public void setDealershipPhone(String dealershipPhone) {
        this.dealershipPhone = dealershipPhone;
    }

    Dealership dealership = new Dealership(dealershipName,dealershipAddress,dealershipPhone);

//    public ArrayList<Vehicle> getVehiclesFromFile(){
//        ArrayList<Vehicle> result = new ArrayList<Vehicle>();
//
//    }
}
