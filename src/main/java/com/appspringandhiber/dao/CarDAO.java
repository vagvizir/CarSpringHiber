package com.appspringandhiber.dao;

import com.appspringandhiber.models.Car;

public interface CarDAO {
    void add(Car car);
    Car get(int id);
}
