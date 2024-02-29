package adapter;

public class TemperatureConverterFahrenheitToCelsius implements TemperatureConverter {
    @Override
    public float convert(float degree) {
        return (float) ((degree - 32) / 1.8);
    }
}
