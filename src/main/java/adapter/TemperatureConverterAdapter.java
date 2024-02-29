package adapter;

public class TemperatureConverterAdapter {

    private TemperatureConverter temperatureConverter;

    public TemperatureConverterAdapter(TemperatureConverter temperatureConverter) {
        this.temperatureConverter = temperatureConverter;
    }

    public float convert(float degree) {
        return this.temperatureConverter.convert(degree);
    }
}
