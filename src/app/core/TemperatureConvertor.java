package app.core;

public class TemperatureConvertor {

    public void fahrenheitToCelsius(double fahrenheit){
        double celsius = Support.round(((fahrenheit-32) * 5 / 9), 3);
        System.out.printf("%s Fahrenheit = %s celsius%n", fahrenheit, celsius);
    }
}
