package weather;
import java.util.ArrayList;
import java.util.Collections;

public class StatisticsDisplay implements Observer, DisplayElement {
    private ArrayList<Float> temperatures;
    private Float averageTemperature;
    private Float maxTemperature;
    private Float minTemperature;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.temperatures = new ArrayList<Float>();
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperatures.add(temperature);
        this.averageTemperature = calcAverageTemperature();
        this.maxTemperature = calcMaxTemperature();
        this.minTemperature = calcMinTemperature();
        display();
    }

    private Float calcAverageTemperature() {
        float totalDegrees = 0;
        for (float temperature : temperatures) {
            totalDegrees += temperature;
        }
        float averageTemperature = totalDegrees / temperatures.size();
        return averageTemperature;
    }

    private Float calcMaxTemperature() {
        float maxTemperature = Collections.max(temperatures);
        return maxTemperature;
    }

    private Float calcMinTemperature() {
        float minTemperature = Collections.min(temperatures);
        return minTemperature;
    }

    public void display() {
        System.out.println("Avg / Max / Min temperature: " + averageTemperature + "/" + maxTemperature + "/" + minTemperature);
    }
}
