package two.display;

import two.WeatherData;
import two.observer_interface.DisplayElement;
//import two.observer_interface.Observer;
import two.observer_interface.Subject;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
//    private Subject weatherData;

    public StatisticsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

//    public StatisticsDisplay(Subject weaterData){
//        this.weatherData = weaterData;
//        weatherData.registerObserver(this);
//    }


    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData)obs;
            float temperature = weatherData.getTemperature();
            tempSum += temperature;
            numReadings++;
            if (temperature > maxTemp) {
                maxTemp = temperature;
            }
            if (temperature < minTemp) {
                minTemp = temperature;
            }
            display();
        }
    }

//    @Override
//    public void update(float temperature, float humidity, float pressure) {
//        tempSum += temperature;
//        numReadings++;
//        if (temperature > maxTemp) {
//            maxTemp = temperature;
//        }
//        if (temperature < minTemp) {
//            minTemp = temperature;
//        }
//        display();
//    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }

}
