package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle {

    private String modelName;
    private String registrationNumber;
    private String ownerName;

    public Ford(String modelName, String registrationNumber, String ownerName) {
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

    public int speed() {
        return 165;
    }

    public void tempControl() {
        System.out.println(modelName + " air-conditioning set to a comfortable 22 degrees.");
    }
}
