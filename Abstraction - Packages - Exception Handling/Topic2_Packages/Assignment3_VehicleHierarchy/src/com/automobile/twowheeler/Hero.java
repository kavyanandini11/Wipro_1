package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle {

    private String modelName;
    private String registrationNumber;
    private String ownerName;

    public Hero(String modelName, String registrationNumber, String ownerName) {
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
    }

    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getOwnerName() {
        return ownerName;
    }

    public int getSpeed() {
        return 90;
    }

    public void radio() {
        System.out.println(modelName + " is playing FM radio.");
    }
}
