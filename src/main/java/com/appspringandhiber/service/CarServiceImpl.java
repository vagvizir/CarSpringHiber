package com.appspringandhiber.service;

import com.appspringandhiber.dao.CarDAO;
import com.appspringandhiber.models.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {
    private final CarDAO carDAO;

    @Autowired
    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public void add(Car car) {
        carDAO.add(car);
    }

    @Override
    public Car get(int id) {
        return carDAO.get(id);
    }
}
