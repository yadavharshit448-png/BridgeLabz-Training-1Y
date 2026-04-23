package com.gla.lambda_expression;

public class SmartHomeLighting {
    @FunctionalInterface
    interface LightAction {
        void execute();
    }

    public static void main(String[] args) {
        LightAction motionTrigger = () -> System.out.println("Motion detected: Turning on bright lights");
        LightAction nightTrigger = () -> System.out.println("Time is 10 PM: Dimming lights to 20%");
        LightAction voiceTrigger = () -> System.out.println("Voice command received: Turning lights blue");

        motionTrigger.execute();
        nightTrigger.execute();
        voiceTrigger.execute();
    }
}
