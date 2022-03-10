package main.java.light;

public class Lightbulb implements SwitchLight {
    private final static String lightBulbOn = "Lightbulb on";
    private final static String lightBulbOff = "Lightbulb off";


    @Override
    public void on() {
        System.out.println(lightBulbOn);
    }

    @Override
    public void off() {
        System.out.println(lightBulbOff);
    }

    @Override
    public String getOnOut() {
        return lightBulbOn;
    }

    @Override
    public String getOffOut() {
        return lightBulbOff;
    }
}