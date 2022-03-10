package test.java;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import main.java.base.*;
import main.java.buttons.*;
import main.java.light.*;

public class TableLampTest {
    // String fixtures
    private final static String TABLE_LAMP_ON_WITH_BUTTON_AND_LIGHT_BULB_EXPECTED_OUT;
    private final static String TABLE_LAMP_OFF_WITH_BUTTON_AND_LIGHT_BULB_EXPECTED_OUT;

    private final static String TABLE_LAMP_ON_WITH_PUSH_DOWN_BUTTON_AND_LIGHT_BULB_EXPECTED_OUT;
    private final static String TABLE_LAMP_OFF_WITH_PUSH_DOWN_BUTTON_AND_LIGHT_BULB_EXPECTED_OUT;


    static {
    	TABLE_LAMP_ON_WITH_BUTTON_AND_LIGHT_BULB_EXPECTED_OUT = "Button switched to ON!\nLightbulb on";
    	TABLE_LAMP_OFF_WITH_BUTTON_AND_LIGHT_BULB_EXPECTED_OUT = "Button switched to OFF!\nLightbulb off";

    	TABLE_LAMP_ON_WITH_PUSH_DOWN_BUTTON_AND_LIGHT_BULB_EXPECTED_OUT = "PushDownButton switched to ON!\nLightbulb on";
    	TABLE_LAMP_OFF_WITH_PUSH_DOWN_BUTTON_AND_LIGHT_BULB_EXPECTED_OUT = "PushDownButton switched to OFF!\nLightbulb off";

    }

    @Test
    void tableLampWithButtonAndLightBulbOnOutputMatchesExpectedOutput() {
        SwitchOnOff button = new Button();
        SwitchLight lightBulb = new Lightbulb();
        TableLamp tableLamp = new TableLamp(button, lightBulb);
        assertEquals(TABLE_LAMP_ON_WITH_BUTTON_AND_LIGHT_BULB_EXPECTED_OUT, tableLamp.getTableLampOnOut());
    }

    @Test
    void tableLampWithButtonAndLightBulbOffOutputMatchesExpectedOutput() {
    	SwitchOnOff button = new Button();
    	SwitchLight lightBulb = new Lightbulb();
        TableLamp tableLamp = new TableLamp(button, lightBulb);
        assertEquals(TABLE_LAMP_OFF_WITH_BUTTON_AND_LIGHT_BULB_EXPECTED_OUT, tableLamp.getTableLampOffOut());
    }

    @Test
    void tableLampWithPushDownButtonAndLightBulbOnOutputMatchesExpectedOutput() {
    	SwitchOnOff button = new PushdownButton();
        SwitchLight lightBulb = new Lightbulb();
        TableLamp tableLamp = new TableLamp(button, lightBulb);
        assertEquals(TABLE_LAMP_ON_WITH_PUSH_DOWN_BUTTON_AND_LIGHT_BULB_EXPECTED_OUT, tableLamp.getTableLampOnOut());
    }

    @Test
    void tableLampWithPushDownButtonAndLightBulbOffOutputMatchesExpectedOutput() {
    	SwitchOnOff button = new PushdownButton();
    	SwitchLight lightBulb = new Lightbulb();
        TableLamp tableLamp = new TableLamp(button, lightBulb);
        assertEquals(TABLE_LAMP_OFF_WITH_PUSH_DOWN_BUTTON_AND_LIGHT_BULB_EXPECTED_OUT, tableLamp.getTableLampOffOut());
    }
}