package app.core;

public class TemperatureConvertor {

    public void fahrenheitToCelsius(double fahrenheit){
        double celsius = Support.round(((fahrenheit-32) * 5 / 9), 3);
        System.out.printf("%s Fahrenheit = %s celsius%n", fahrenheit, celsius);
    }

    public void celsiusToFahrenheit(double celsius){
        double fahrenheit = Support.round((celsius * 9 / 5 + 32), 3);
        System.out.printf("%s Celsius = %s Fahrenheit%n", celsius, fahrenheit);
    }
}
