package two.display;

import two.WeatherData;
import two.observer_interface.DisplayElement;
//import two.observer_interface.Observer;
import two.observer_interface.Subject;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay  implements Observer, DisplayElement {
    Observable observable;
    private float currentPressure = 29.92f;
    private float lastPressure;
//    private Subject weatherData;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

//    public ForecastDisplay(Subject weatherData) {
//        this.weatherData = weatherData;
//        weatherData.registerObserver(this);
//    }

    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData)obs;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

//    @Override
//    public void update(float temp, float humidity, float pressure) {
//        lastPressure = currentPressure;
//        currentPressure = pressure;
//        display();
//    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }


}
