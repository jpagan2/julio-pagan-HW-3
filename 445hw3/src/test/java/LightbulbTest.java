package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.light.Lightbulb;


public class LightbulbTest {
    // String fixtures
    private final static String LIGHT_BULB_ON_EXPECTED_OUT;
    private final static String LIGHT_BULB_OFF_EXPECTED_OUT;

    static {
        LIGHT_BULB_ON_EXPECTED_OUT = "Lightbulb on";
        LIGHT_BULB_OFF_EXPECTED_OUT  = "Lightbulb off";
    }

    @Test
    void lightBulbOnOutputMatchesExpectedOutPut() {
        Lightbulb lightBulb = new Lightbulb();
        assertEquals(LIGHT_BULB_ON_EXPECTED_OUT, lightBulb.getOnOut());
    }

    @Test
    void lightBulbOffOutMatchesExpectedOutput() {
        Lightbulb lightBulb = new Lightbulb();
        assertEquals(LIGHT_BULB_OFF_EXPECTED_OUT, lightBulb.getOffOut());
    }
}