package app;

import java.util.Locale;

import decorator.*;
import vehicles.*;

public class Main {

    private static void print(KiaPicanto car) {
        Locale colombia = Locale.forLanguageTag("es-CO");
        System.out.printf(colombia, "%s $%,.0f COP%n", car.getDescription(), car.Cost());
    }

    public static void main(String[] args) {


        KiaPicanto car1 = new VibrantMT();
        car1 = new ParkSensor(car1);
        car1 = new Upholstery(car1);
        car1 = new Rim13(car1);
        print(car1);

        KiaPicanto car2 = new ZenithMT();
        car2 = new Rim14BlackMachined(car2);
        car2 = new TrunkCover(car2);
        car2 = new Bolts(car2);
        car2 = new CargoNet(car2);
        print(car2);

        KiaPicanto car3 = new ZenithAT();
        car3 = new SideExtensionKit(car3);
        car3 = new Rim14GrayMachinedBasic(car3);
        car3 = new ParkSensor(car3);
        car3 = new Alarms(car3);
        print(car3);

        KiaPicanto car4 = new GTLineAT();
        car4 = new Rim14GrayMachined(car4);
        car4 = new bickeRock(car4);
        car4 = new TouwHitch(car4);
        car4 = new Button(car4);
        print(car4);

        KiaPicanto car5 = new GTLineAT();
        car5 = new Rim14BlackMachined(car5);
        car5 = new SideExtensionKit(car5);
        car5 = new ParkSensor(car5);
        car5 = new TrunkCover(car5);
        car5 = new Alarms(car5);
        car5 = new Bolts(car5);
        car5 = new Button(car5);
        car5 = new CargoNet(car5);
        car5 = new bickeRock(car5);
        car5 = new TouwHitch(car5);
        car5 = new Upholstery(car5);
        print(car5);
    }
}