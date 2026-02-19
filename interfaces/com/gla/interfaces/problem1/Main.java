package com.gla.interfaces.problem1;

interface SmartDevice {
    void turnOn();

    void turnOff();
}

class Light implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Light is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is OFF");
    }
}

class AC implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("AC is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("AC is OFF");
    }
}

public class Main {
    public static void main(String[] args) {
        SmartDevice light = new Light();
        SmartDevice ac = new AC();

        light.turnOn();
        light.turnOff();
        ac.turnOn();
        ac.turnOff();
    }
}
