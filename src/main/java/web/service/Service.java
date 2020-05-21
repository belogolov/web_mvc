package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class Service {

    public List<Car> listCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("brand1", "model1", 100L));
        cars.add(new Car("brand1", "model2", 200L));
        cars.add(new Car("brand2", "model3", 300L));
        cars.add(new Car("brand2", "model4", 400L));
        return cars;
    }

}
