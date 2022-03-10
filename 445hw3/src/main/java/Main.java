package main.java;

import main.java.base.TableLamp;
import main.java.buttons.PushdownButton;
import main.java.buttons.SwitchOnOff;
import main.java.light.Lightbulb;
import main.java.light.SwitchLight;

public class Main {
    public static void main(String[] args) {
        SwitchLight lightbulb = new Lightbulb();
        SwitchOnOff button = new PushdownButton();
        TableLamp tablelamp = new TableLamp(button, lightbulb);

        tablelamp.turnOn();
        tablelamp.turnOff();

    }
}