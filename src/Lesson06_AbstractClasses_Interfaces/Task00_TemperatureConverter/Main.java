package Lesson06_AbstractClasses_Interfaces.Task00_TemperatureConverter;

import Lesson06_AbstractClasses_Interfaces.Task00_TemperatureConverter.CelsiusConverter;
import Lesson06_AbstractClasses_Interfaces.Task00_TemperatureConverter.FahrenheitConverter;
import Lesson06_AbstractClasses_Interfaces.Task00_TemperatureConverter.KelvinConverter;

public class Main {
    public static void main(String[] args) {
        double temperature = 23.5;
        System.out.println( new CelsiusConverter().getConvertedValue(temperature) );
        System.out.println( new KelvinConverter().getConvertedValue(temperature) );
        System.out.println( new FahrenheitConverter().getConvertedValue(temperature) );
    }
}
