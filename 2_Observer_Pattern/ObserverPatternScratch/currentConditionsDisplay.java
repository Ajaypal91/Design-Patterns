/**
 * 
 */
package ObserverPatternScratch;

/**
 * @author ajay
 *
 */
public class currentConditionsDisplay implements Observer, DisplayElement{
	private float temperature;
	private float pressure;
	private float humidity;
	private Subject weatherData;
	
	public currentConditionsDisplay(Subject s) {
		this.weatherData = s;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current Conditions: " +  temperature + 
				" degree F, humidity = " + humidity + " and pressure = " + pressure);
		
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
	}
}
