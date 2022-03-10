package test.java;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import main.java.base.*;
import main.java.buttons.*;
import main.java.light.*;

public class TableLampTest {
    // String fixtures
    private final static String T_LAMP_ON_W_BUTTON_AND_LIGHT_BULB_EXPECTED_OUT;
    private final static String T_LAMP_OFF_W_BUTTON_AND_LIGHT_BULB_EXPECTED_OUT;

    private final static String T_LAMP_ON_W_PUSH_DOWN_BUTTON_AND_LIGHT_BULB_EXPECTED_OUT;
    private final static String T_LAMP_OFF_W_PUSH_DOWN_BUTTON_AND_LIGHT_BULB_EXPECTED_OUT;


    static {
    	T_LAMP_ON_W_BUTTON_AND_LIGHT_BULB_EXPECTED_OUT = "Button switched to ON!\nLightbulb on";
    	T_LAMP_OFF_W_BUTTON_AND_LIGHT_BULB_EXPECTED_OUT = "Button switched to OFF!\nLightbulb off";

    	T_LAMP_ON_W_PUSH_DOWN_BUTTON_AND_LIGHT_BULB_EXPECTED_OUT = "PushDownButton switched to ON!\nLightbulb on";
    	T_LAMP_OFF_W_PUSH_DOWN_BUTTON_AND_LIGHT_BULB_EXPECTED_OUT = "PushDownButton switched to OFF!\nLightbulb off";

    }

    @Test
    void tableLampWithButtonAndLightBulbOnOutputMatchesExpectedOutput() {
        SwitchOnOff button = new Button();
        SwitchLight lightBulb = new Lightbulb();
        TableLamp tableLamp = new TableLamp(button, lightBulb);
        assertEquals(T_LAMP_ON_W_BUTTON_AND_LIGHT_BULB_EXPECTED_OUT, tableLamp.getTableLampOnOut());
    }

    @Test
    void tableLampWithButtonAndLightBulbOffOutputMatchesExpectedOutput() {
    	SwitchOnOff button = new Button();
    	SwitchLight lightBulb = new Lightbulb();
        TableLamp tableLamp = new TableLamp(button, lightBulb);
        assertEquals(T_LAMP_OFF_W_BUTTON_AND_LIGHT_BULB_EXPECTED_OUT, tableLamp.getTableLampOffOut());
    }

    @Test
    void tableLampWithPushDownButtonAndLightBulbOnOutputMatchesExpectedOutput() {
    	SwitchOnOff button = new PushdownButton();
        SwitchLight lightBulb = new Lightbulb();
        TableLamp tableLamp = new TableLamp(button, lightBulb);
        assertEquals(T_LAMP_ON_W_PUSH_DOWN_BUTTON_AND_LIGHT_BULB_EXPECTED_OUT, tableLamp.getTableLampOnOut());
    }

    @Test
    void tableLampWithPushDownButtonAndLightBulbOffOutputMatchesExpectedOutput() {
    	SwitchOnOff button = new PushdownButton();
    	SwitchLight lightBulb = new Lightbulb();
        TableLamp tableLamp = new TableLamp(button, lightBulb);
        assertEquals(T_LAMP_OFF_W_PUSH_DOWN_BUTTON_AND_LIGHT_BULB_EXPECTED_OUT, tableLamp.getTableLampOffOut());
    }
}