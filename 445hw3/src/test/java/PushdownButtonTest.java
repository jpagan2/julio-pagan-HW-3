package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.buttons.*;

public class PushdownButtonTest {
    // String fixtures
    private final static String SWITCH_ON_EXPECTED_OUT;
    private final static String SWITCH_OFF_EXPECTED_OUT;

    static {
    	SWITCH_ON_EXPECTED_OUT = "PushDownButton switched to ON!";
        SWITCH_OFF_EXPECTED_OUT = "PushDownButton switched to OFF!";
    }

    @Test
    void buttonSwitchOnOutputMatchesExpectedOutput() {
    	PushdownButton PushdownButton = new PushdownButton();
        assertEquals(SWITCH_ON_EXPECTED_OUT, PushdownButton.getSwitchOnOut());
    }

    @Test
    void buttonSwitchOffOutputMatchesExpectedOutput() {
    	PushdownButton PushdownButton = new PushdownButton();
        assertEquals(SWITCH_OFF_EXPECTED_OUT, PushdownButton.getSwitchOffOut());
    }


}