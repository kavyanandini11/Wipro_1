package com.wipro.automobile.ship;

public class compartment {

    private double height;
    private double width;
    private double breadth;

    public compartment(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public double volume() {
        return height * width * breadth;
    }

    public void display() {
        System.out.println("Ship Compartment -> height=" + height + ", width=" + width + ", breadth=" + breadth);
        System.out.println("Volume = " + volume());
    }
}
