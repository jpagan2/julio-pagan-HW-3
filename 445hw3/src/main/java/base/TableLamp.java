package main.java.base;

import main.java.buttons.SwitchOnOff;
import main.java.light.SwitchLight;

public class TableLamp {
    private SwitchOnOff Button;
    private SwitchLight lighting;

    public TableLamp(SwitchOnOff Button, SwitchLight lighting) {
        this.Button = Button;
        this.lighting = lighting;
    }

    public void turnOn() {
    	Button.switchOn();
    	lighting.on();
    }

    public void turnOff() {
    	Button.switchOff();
    	lighting.off();
    }

    public String getTableLampOnOut() {
        String output = "";
        output += Button.getSwitchOnOut();
        output += "\n";
        output += lighting.getOnOut();
        return output;
    }

    public String getTableLampOffOut() {
        String output = "";
        output += Button.getSwitchOffOut();
        output += "\n";
        output += lighting.getOffOut();
        return output;
    }


}