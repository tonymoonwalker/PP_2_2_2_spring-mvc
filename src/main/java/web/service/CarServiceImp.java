package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {
    @Autowired
    public CarDao carDao;
    @Override
    public List<Car> getCarList(Integer count) {

        List<Car> cars = carDao.getCarList();
        if (count != null && count < cars.size()) {
            cars = cars.subList(0, count);
        }
        return cars;
    }
}
