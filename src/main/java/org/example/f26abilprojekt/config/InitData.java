package org.example.f26abilprojekt.config;

import org.example.f26abilprojekt.model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class InitData {

    private ArrayList<Car> carList = new ArrayList<>();

    public InitData() {

        // Populate the list with dummy data
        carList.add(new Car(1, "Volvo", 2012, "Sedan", "Red", "ABC123", "blåvolvostationcar.jpg"));
        carList.add(new Car(2, "Ford", 1938, "SUV", "Blue", "DEF456", "generic.jpg"));
        carList.add(new Car(3, "VW", 1986, "Coupe", "Black", "GHI789", "GulVWBobbel.jpg"));
        carList.add(new Car(4, "Western Star", 1998, "Hatchback", "White", "JKL012", "WesternstarRødTruck.jpg"));
        carList.add(new Car(5, "Hyundai", 2002, "Convertible", "Silver", "MNO345", "generic.jpg"));
    }

    public ArrayList<Car> getCarList() {
        return carList;
    }
}
