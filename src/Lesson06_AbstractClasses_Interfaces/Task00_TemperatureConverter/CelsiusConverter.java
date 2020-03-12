package Lesson06_AbstractClasses_Interfaces.Task00_TemperatureConverter;

class CelsiusConverter implements Converter {
    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue;
    }
}
