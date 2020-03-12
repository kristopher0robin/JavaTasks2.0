package Lesson06_AbstractClasses_Interfaces.Task00_TemperatureConverter;

import java.util.Arrays;
import java.util.Locale;

public interface Converter {
    double getConvertedValue(double baseValue);

    // Фабричный метод
    public static Converter getInstance() {
        Locale locale = Locale.getDefault();
        String[] fahrenheitCountries = {"BS", "US", "BZ", "KY", "PW"};

        boolean isFahrenheitCountry = Arrays.asList(fahrenheitCountries).contains(locale.getCountry());

        if (isFahrenheitCountry) {
            return new FahrenheitConverter();
        } else {
            return new CelsiusConverter();
        }
    }
}
