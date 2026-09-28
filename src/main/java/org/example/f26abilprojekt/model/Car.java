package org.example.f26abilprojekt.model;

public class Car {

    int id;
    String brand;
    int modelyear;
    String type;
    String colour;
    String licenseplate;
    String image;

    public Car(int id, String brand, int modelyear, String type, String colour, String licenseplate, String image) {
        this.id = id;
        this.brand = brand;
        this.modelyear = modelyear;
        this.type = type;
        this.colour = colour;
        this.licenseplate = licenseplate;
        this.image = image;
    }

    public Car(String brand, int modelyear, String type, String colour, String licenseplate, String image) {
        this.brand = brand;
        this.modelyear = modelyear;
        this.type = type;
        this.colour = colour;
        this.licenseplate = licenseplate;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModelyear() {
        return modelyear;
    }

    public void setModelyear(int modelyear) {
        this.modelyear = modelyear;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getLicenseplate() {
        return licenseplate;
    }

    public void setLicenseplate(String licenseplate) {
        this.licenseplate = licenseplate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
