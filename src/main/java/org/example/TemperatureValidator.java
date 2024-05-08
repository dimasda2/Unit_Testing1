package org.example;

public class TemperatureValidator {
    public void validateTemperature(int temperature) throws TemperatureOutOfRangeException {
        if (temperature < -10 || temperature > 35) {
            throw new TemperatureOutOfRangeException("Устройство не может работать вне диапазона температур от -10 до 35 градусов.");
        }
    }
}
