package Lesson06_AbstractClasses_Interfaces.Task00_TemperatureConverter;

import Lesson06_AbstractClasses_Interfaces.Task00_TemperatureConverter.Converter;

class FahrenheitConverter implements Converter {
    @Override
    public double getConvertedValue(double baseValue) {
        return 1.8 * baseValue + 32;
    }
}
