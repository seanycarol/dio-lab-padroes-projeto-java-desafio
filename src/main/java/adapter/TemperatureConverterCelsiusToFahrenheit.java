package adapter;

public class TemperatureConverterCelsiusToFahrenheit implements TemperatureConverter {
    @Override
    public float convert(float degree) {
        return (float) (degree * 1.8 + 32);
    }
}
