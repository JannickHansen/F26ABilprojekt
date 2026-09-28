package org.example.f26abilprojekt.service;

import org.springframework.stereotype.Service;

@Service
public class CarService {
    public String getImg(String brand, String colour) {

        String img = null;

        if (brand.contains("Volvo")) {
            img = "blåvolvostationcar.jpg";
        } else if (brand.contains("VW")) {
            if (colour.contains("grøn") || colour.contains("green")) {
                img = "GrønVWpolo.jpg";
            } else {
                img = "GulVWBobbel.jpg";
            }
        } else if (brand.contains("Western Star")) {
            img = "WesternstarRødTruck.jpg";
        } else {
            img = "generic.jpg";
        }
        return img;
    }
}
