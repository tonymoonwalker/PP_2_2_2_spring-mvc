package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import java.util.List;

@Controller
public class CarController {
//    @GetMapping(value = "/cars")
    /*public String showCars(@RequestParam(name = "count", required = false) Integer count, ModelMap model) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Car.class);

        CarService userService = context.getBean(CarService.class);
        List<Car> cars = userService.getCarList();
        if (count != null && count < 5) {
            cars = cars.subList(0, count);
        }

        model.addAttribute("cars", cars);
        return "cars";
    }*/

    CarService carService; // Добавьте поле в классе CarController

    @Autowired // Инъектируйте зависимость через аннотацию
    public CarController(CarService carService) {
        this.carService = carService;
    }
    @GetMapping(value = "/cars")
    public String showCars(@RequestParam(name = "count", required = false) Integer count, ModelMap model) {
        List<Car> cars = carService.getCarList(count);
        model.addAttribute("cars", cars);
        return "cars"; // Вернуть имя представления
    }
}
