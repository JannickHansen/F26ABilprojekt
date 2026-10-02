package org.example.f26abilprojekt.repository;

import org.example.f26abilprojekt.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@Repository
public class CarRepository {

    @Autowired
    private DataSource dataSource;

    public ArrayList<Car> getAllCars() {
        ArrayList<Car> carList = new ArrayList<>();
        String sql = "SELECT * FROM cars";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Car car = new Car(
                        resultSet.getInt("id"),
                        resultSet.getString("brand"),
                        resultSet.getInt("modelyear"),
                        resultSet.getString("type"),
                        resultSet.getString("colour"),
                        resultSet.getString("licenseplate"),
                        resultSet.getString("img")
                );
                carList.add(car);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return carList;
    }

    public void delete(int id) {
        String sql = "DELETE FROM cars WHERE id = ?";

        try (Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql)) {
        statement.setInt(1, id);
        statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void save(Car car) {
        String sql = "INSERT INTO cars (brand, modelyear, type, colour, licenseplate, img) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, car.getBrand());
            statement.setInt(2, car.getModelyear());
            statement.setString(3, car.getType());
            statement.setString(4, car.getColour());
            statement.setString(5, car.getLicenseplate());
            statement.setString(6, car.getImage());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}











