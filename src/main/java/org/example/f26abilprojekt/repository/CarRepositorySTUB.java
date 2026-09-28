package org.example.f26abilprojekt.repository;

import org.example.f26abilprojekt.config.InitData;
import org.example.f26abilprojekt.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class CarRepositorySTUB {

    @Autowired
    InitData initData;

    public Car getCarByID(int id) {
        for (Car car : initData.getCarList()) {
            if (car.getId() == id) {
                return car;
            }
        }
        return null;
    }

    public void delete (int id) {
        Car car = getCarByID(id);
        initData.getCarList().remove(car);
    }

    public void save(Car car) {
        ArrayList<Car> carList = initData.getCarList();

        int newID;

        if (carList.isEmpty()) {
            newID = 1;
        } else {
            newID = carList.getLast().getId() +1;
        }
        car.setId(newID);
        carList.add(car);
    }

}









