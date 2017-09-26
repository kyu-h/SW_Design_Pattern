package hansung.designpatterns.observer;

import java.util.Date;

public class TimedWeatherData extends WeatherData {
    private String measuredTime;

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measuredTime = new Date().toString();

        measurementsChanged();
    }

    public String getMeasuredTime() {
        return measuredTime;
    }
}
