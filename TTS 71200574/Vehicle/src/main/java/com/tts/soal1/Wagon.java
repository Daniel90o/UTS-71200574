package com.tts.soal1;

public class Wagon {
    public abstract class Wagon implements Vehicle {
        private String pullers;
        private Wheel wheel;
        public String getPullers() {
            return pullers;
        }
        public void setPullers(String pullers) {
            this.pullers = pullers;
        }
        public Wheel getWheel() {
            return wheel;
        }
        public void setWheel(Wheel wheel) {
            this.wheel = wheel;
        }
}
