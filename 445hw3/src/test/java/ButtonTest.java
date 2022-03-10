package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.buttons.Button;

public class ButtonTest {
    // String fixtures
    private final static String SWITCH_ON_EXPECTED_OUT;
    private final static String SWITCH_OFF_EXPECTED_OUT;

    static {
    	SWITCH_ON_EXPECTED_OUT = "Button switched to ON!";
    	SWITCH_OFF_EXPECTED_OUT = "Button switched to OFF!";
    }

    @Test
    void buttonSwitchOnOutputMatchesExpectedOutput() {
        Button button = new Button();
        assertEquals(SWITCH_ON_EXPECTED_OUT, button.getSwitchOnOut());
    }

    @Test
    void buttonSwitchOffOutputMatchesExpectedOutput() {
        Button button = new Button();
        assertEquals(SWITCH_OFF_EXPECTED_OUT, button.getSwitchOffOut());
    }


}