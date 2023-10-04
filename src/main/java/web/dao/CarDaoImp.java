package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao{

    @Override
    public List<Car> getCarList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Model S", 121, true));
        cars.add(new Car("Model Y", 122, false));
        cars.add(new Car("Model B", 123, false));
        cars.add(new Car("Model K", 124, true));
        cars.add(new Car("Model L", 125, true));
        return cars;
    }
}
