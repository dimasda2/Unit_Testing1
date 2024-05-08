package app;

import org.example.TemperatureOutOfRangeException;
import org.example.TemperatureValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class TemperatureValidatorTest {
    @Test
    void testValidTemperature() {
        TemperatureValidator validator = new TemperatureValidator();
        assertDoesNotThrow(() -> validator.validateTemperature(35));
    }

    @Test
    void testLowerBoundaryTemperature() {
        TemperatureValidator validator = new TemperatureValidator();
        assertDoesNotThrow(() -> validator.validateTemperature(-10));
    }

    @Test
    void testUpperBoundaryTemperature() {
        TemperatureValidator validator = new TemperatureValidator();
        assertDoesNotThrow(() -> validator.validateTemperature(35));
    }

    @Test
    void testBelowLowerBoundaryTemperature() {
        TemperatureValidator validator = new TemperatureValidator();
        assertThrows(TemperatureOutOfRangeException.class, () -> validator.validateTemperature(-11));
    }

    @Test
    void testAboveUpperBoundaryTemperature() {
        TemperatureValidator validator = new TemperatureValidator();
        assertThrows(TemperatureOutOfRangeException.class, () -> validator.validateTemperature(36));
    }
}
