package Lesson06_AbstractClasses_Interfaces.Task00_TemperatureConverter;

import Lesson06_AbstractClasses_Interfaces.Task00_TemperatureConverter.Converter;

class KelvinConverter implements Converter {
    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue + 273.15;
    }
}
