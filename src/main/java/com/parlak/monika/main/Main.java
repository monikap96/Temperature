package com.parlak.monika.main;

import com.parlak.monika.temperature.Celsius;
import com.parlak.monika.temperature.Fahrenheit;
import com.parlak.monika.temperature.Kelvin;
import com.parlak.monika.temperature.TemperatureException;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) throws TemperatureException {

        Scanner scanner = new Scanner(System.in);
        double value;
        int fromScale, toScale;

        System.out.println("W jakiej skali będziesz podawać wartość?\n(wybierz 1,2 lub 3)\n1. Celcjusz\n2. Kelwin\n3. Fahrenheit");
        fromScale = scanner.nextInt();
        System.out.println("podaj wartość: ");
        value = scanner.nextDouble();
        System.out.println("na jaką skalę chcesz zamienić? (wybierz 1,2 lub 3)\n1. Celcjusz\n2. Kelwin\n3. Fahrenheit");
        toScale = scanner.nextInt();

        if(fromScale != toScale){
            switch (fromScale){
                case 1: {
                    Celsius celsius = new Celsius(value);
                    if(toScale==2)
                        celsius.viewTemperature(celsius.toKelvin());
                    if(toScale==3)
                        celsius.viewTemperature(celsius.toFahrenheit());
                    break;
                }
                case 2: {
                    Kelvin kelvin = new Kelvin(value);
                    if(toScale==1)
                        kelvin.viewTemperature(kelvin.toCelsius());
                    if(toScale==3)
                        kelvin.viewTemperature(kelvin.toFahrenheit());
                    break;
                }
                case 3: {
                    Fahrenheit fahrenheit = new Fahrenheit(value);
                    if(toScale==1)
                        fahrenheit.viewTemperature(fahrenheit.toCelsius());
                    if(toScale==2)
                        fahrenheit.viewTemperature(fahrenheit.toKelvin());
                    break;
                }
                default: {
                    System.out.println("Podałeś błędną wartość");
                }
            }
        }else{
            System.out.println(value);
        }

    }
}
