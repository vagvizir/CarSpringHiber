package com.appspringandhiber.service;

import com.appspringandhiber.models.Car;

public interface CarService {
    void add(Car car);
    Car get(int id);
}
