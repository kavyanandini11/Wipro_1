package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle {

    private String modelName;
    private String registrationNumber;
    private String ownerName;

    public Honda(String modelName, String registrationNumber, String ownerName) {
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
        return 100;
    }

    public void cdplayer() {
        System.out.println(modelName + " is playing music on its CD player.");
    }
}
