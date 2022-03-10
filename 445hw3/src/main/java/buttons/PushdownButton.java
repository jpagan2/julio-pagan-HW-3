package main.java.buttons;

public class PushdownButton implements SwitchOnOff {
    private final static String switchOn = "PushDownButton switched to ON!";
    private final static String switchOff = "PushDownButton switched to OFF!";

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