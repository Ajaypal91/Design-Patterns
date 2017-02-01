package usingBuiltInObserverPattern;
import java.util.Observable;
import java.util.Observer;

import ObserverPatternScratch.DisplayElement;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

	Observable observable;
	private float temperature;
	private float pressure;
	private float humidity;
	
	public CurrentConditionsDisplay(Observable o) {
		// TODO Auto-generated constructor stub
		this.observable = o;
		o.addObserver(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
				System.out.println("Current Conditions: " +  temperature + 
						" degree F, humidity = " + humidity + " and pressure = " + pressure);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (o instanceof WeatherData) {
			WeatherData weatherdata = (WeatherData)o;
			this.temperature  = weatherdata.getTemperature();
			this.pressure = weatherdata.getPressure();
			this.humidity = weatherdata.getHumidity();
			display();
		}
		
	}

	
	
}
