package hansung.designpatterns.observer;


public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	private String measuredTime;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(Subject subject) {
		if (subject instanceof TimedWeatherData) {
			TimedWeatherData weatherData = (TimedWeatherData)subject;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			this.pressure = weatherData.getPressure();
			this.measuredTime = weatherData.getMeasuredTime();

			display();
		}
	}
	
	public void display() {
		System.out.println("[Time :"+ measuredTime + "]" +"Current conditions: " + temperature
				+ "F degrees and " + humidity + "% humidity");
	}
}
