package org.example;

import java.util.Scanner;

public class Device {
    private int currentTemperature;

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текущую температуру: ");
        int temperature = scanner.nextInt();
        TemperatureValidator validator = new TemperatureValidator();
        Device device = new Device();
        try {
            validator.validateTemperature(temperature);
            device.setCurrentTemperature(temperature);
            System.out.println("Устройство работает при температуре:" + device.getCurrentTemperature());
        } catch (TemperatureOutOfRangeException e) {
            System.out.println("Ошибка: " + e.getMessage());
            System.out.println("Введите допустимую температуру в диапазоне от -10 до 35 градусов.");
        } catch (Exception e) {
            System.out.println("Ошибка: неверный ввод. Введите допустимое целое значение температуры.");
        }
    }
}
