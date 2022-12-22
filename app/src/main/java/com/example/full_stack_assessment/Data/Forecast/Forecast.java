package com.example.full_stack_assessment.Data.Forecast;

public class Forecast {
    public String weatherIcon;
    public String timeOfDay;

    //    public int temperature;
    public String temperature;

    public Forecast(String weatherIcon,
                    String timeOfDay,
                    String temperature) {
        this.weatherIcon = weatherIcon;
        this.timeOfDay = timeOfDay;
        this.temperature = temperature;
    }
}
