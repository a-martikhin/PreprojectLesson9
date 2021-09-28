package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
@Component
public class CarsService {
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", "Black", "v8"));
        cars.add(new Car("Audi", "White", "v4"));
        cars.add(new Car("Opel", "Blue", "v3"));
        cars.add(new Car("Ford", "Red", "v5"));
        cars.add(new Car("Lada", "Yellow", "1.6"));
    }

    public List<Car> getCarsOnRequest(int count){
        List<Car> resultListOfCar = new ArrayList<>();
        if(count < 5 && count > 0){
            return resultListOfCar = cars.subList(0,count);
        } else{
            return cars;
        }
    }

}
