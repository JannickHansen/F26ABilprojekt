package org.example.f26abilprojekt.controller;

import org.example.f26abilprojekt.model.Car;
import org.example.f26abilprojekt.repository.CarRepository;
import org.example.f26abilprojekt.repository.CarRepositorySTUB;
import org.example.f26abilprojekt.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {

    @Autowired
    CarRepository carRepo;

    @Autowired
    CarRepositorySTUB carRepo2;

    @Autowired
    CarService carService;

    @GetMapping("/showcar")
    public String showCar(@RequestParam("id") int id, Model model) {
        //Car car = carRepo.getCarByID(id);
        //model.addAttribute(car);

        return "showcar";
    }

    @PostMapping("/deletecar")
    public String deleteCar (@RequestParam("id") int id) {
        carRepo.delete(id);
        return "redirect:/";
    }

    @GetMapping("/getCreateCar")
    public String createCar() {
        return "createCar";
    }

    @PostMapping("/saveCreateCar")
    public String postCreateCar(
            @RequestParam("brand") String brand,
            @RequestParam("modelyear") int modelyear,
            @RequestParam("type") String type,
            @RequestParam("colour") String colour,
            @RequestParam("licenseplate") String licenseplate) {

        String img = carService.getImg(brand, colour);

        Car car = new Car(brand, modelyear, type, colour, licenseplate, img);
        carRepo.save(car);
        return "redirect:/";
    }
}













