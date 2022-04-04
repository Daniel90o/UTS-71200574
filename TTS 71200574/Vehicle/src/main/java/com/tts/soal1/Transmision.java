package com.tts.soal1;

public class Transmision {
    private String transType;
    private int numSpeed;

    public Transmission(String transType, int numSpeed){
        this.setTransType(transType);
        this.setNumSpeed(numSpeed);
    }
    public String getTransType() {
        return transType;
    }
    public void setTransType(String transType) {
        this.transType = transType;
    }
    public int getNumSpeed() {
        return numSpeed;
    }
    public void setNumSpeed(int numSpeed) {
        this.numSpeed = numSpeed;
    }
}
