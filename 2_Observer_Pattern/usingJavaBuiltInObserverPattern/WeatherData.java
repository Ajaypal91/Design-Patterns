package usingBuiltInObserverPattern;

import java.util.Observable;

public class WeatherData extends Observable{
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
	
	public float getTemperature() {
		return this.temperature;
	}

	public float getHumidity() {
		return this.humidity;
	}
	
	public float getPressure() {
		return this.pressure;
	}
	
	public void setMeasurements(float temp, float hum, float pres) {
		this.temperature = temp;
		this.pressure = pres;
		this.humidity = hum;
		measurementsChanged();
	}

}
