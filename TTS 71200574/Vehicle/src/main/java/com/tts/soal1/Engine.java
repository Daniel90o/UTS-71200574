package com.tts.soal1;

public class Engine {
    private String fuelType;
    private int capacity;

    public Engine(String fuel, int capacity){
        this.setFuelType(fuel);
        this.setCapacity(capacity);
    }
    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
