package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String showCars(@RequestParam(name = "count", required = false) Integer count, ModelMap model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Model S", 121, true));
        cars.add(new Car("Model Y", 122, false));
        cars.add(new Car("Model B", 123, false));
        cars.add(new Car("Model K", 124, true));
        cars.add(new Car("Model L", 125, true));

        if (count != null && count < 5) {
            cars = cars.subList(0, count);
        }
        model.addAttribute("cars", cars);

//        model.addAttribute("messages", messages);
        return "cars";
    }
}
