package com.appspringandhiber.dao;

import com.appspringandhiber.models.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAOImpl implements CarDAO {
    List<Car> carDB = new ArrayList<Car>();

    @Override
    public void add(Car car) {
        carDB.add(car);
    }

    @Override
    public Car get(int id) {
        return carDB.get(id);
    }
}
