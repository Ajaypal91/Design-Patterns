package ObserverPatternScratch;

import java.util.concurrent.CancellationException;

public class WeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData weatherdata = new WeatherData();
		currentConditionsDisplay ccd = new currentConditionsDisplay(weatherdata);
		weatherdata.setMeasurements(33, 10, 22.5f);
		ccd.display();
	}

}
