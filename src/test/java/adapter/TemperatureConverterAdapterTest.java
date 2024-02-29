package adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterAdapterTest {

    @Test
    public void testTemperatureConverterFahrenheitToCelsius() {
        TemperatureConverter fahrenheitToCelsius = new TemperatureConverterFahrenheitToCelsius();
        TemperatureConverterAdapter adapter = new TemperatureConverterAdapter(fahrenheitToCelsius);
        float temperatureInCelsius = 0.0f;
        assertEquals(temperatureInCelsius, adapter.convert(32.0f));
    }

    @Test
    public void testTemperatureConverterCelsiusToFahrenheit() {
        TemperatureConverter celsiusToFahrenheit = new TemperatureConverterCelsiusToFahrenheit();
        TemperatureConverterAdapter adapter = new TemperatureConverterAdapter(celsiusToFahrenheit);
        float temperatureInFahrenheit = 32.0f;
        assertEquals(temperatureInFahrenheit, adapter.convert(0.0f));
    }
}