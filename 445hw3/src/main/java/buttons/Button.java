package main.java.buttons;

public class Button implements SwitchOnOff {
    private final static String switchOn = "Button switched to ON!";
    private final static String switchOff = "Button switched to OFF!";

    @Override
    public void switchOn() {
        System.out.println(switchOn);
    }

    @Override
    public void switchOff() {
        System.out.println(switchOff);
    }

    @Override
    public String getSwitchOnOut() {
        return switchOn;
    }

    @Override
    public String getSwitchOffOut() {
        return switchOff;
    }
}