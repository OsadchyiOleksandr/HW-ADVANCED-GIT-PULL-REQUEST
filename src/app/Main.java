package app;

import app.core.Support;
import app.core.TemperatureConvertor;
import app.core.View;

public class Main {
    public static void main(String[] args) {
        View.toDisplay("This App converting Temperature");
        Main.runApp();
    }

    public static void runApp(){
    TemperatureConvertor convertor = new TemperatureConvertor();
        View.toDisplay("Please chose:" +
                "\n\t1.Convert Fahrenheit To Celsius" +
                "\n\t2.Convert * to *");
        int chose = Support.getIntFromUser("");
        switch (chose) {
            case 1:
                convertor.fahrenheitToCelsius(Support.getDoubleFromUser("Please enter amount of Fahrenheit --->"));
                break;
            case 2:
//                convertor.kmsToMiles(Support.getDoubleFromUser("Please enter amount of  --->"));
                break;
            default:
                System.out.println("No such conversion. Bye");
        }
    }
}
