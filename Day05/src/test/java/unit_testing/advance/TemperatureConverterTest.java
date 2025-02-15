package unit_testing.advance;

import static org.junit.jupiter.api.Assertions.*;

import junit_testing.advance.TemperatureConverter;
import org.junit.jupiter.api.*;

class TemperatureConverterTest {

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0), 0.01);
        assertEquals(212.0, TemperatureConverter.celsiusToFahrenheit(100), 0.01);
        assertEquals(98.6, TemperatureConverter.celsiusToFahrenheit(37), 0.01);
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0, TemperatureConverter.fahrenheitToCelsius(32), 0.01);
        assertEquals(100.0, TemperatureConverter.fahrenheitToCelsius(212), 0.01);
        assertEquals(37.0, TemperatureConverter.fahrenheitToCelsius(98.6), 0.01);
    }
}
