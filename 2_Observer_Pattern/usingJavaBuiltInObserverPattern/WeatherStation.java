package usingBuiltInObserverPattern;

public class WeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData wd = new WeatherData();
		CurrentConditionsDisplay cd = new CurrentConditionsDisplay(wd);
		wd.setMeasurements(12, 10, 5);
	}

}
