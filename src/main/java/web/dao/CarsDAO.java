package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarsDAO {
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", "Black", "v8"));
        cars.add(new Car("Audi", "White", "v4"));
        cars.add(new Car("Opel", "Blue", "v3"));
        cars.add(new Car("Ford", "Red", "v5"));
        cars.add(new Car("Lada", "Yellow", "1.6"));
    }

    public List<Car> index(){
            return cars;
    }

    public List<Car> result(int count){
        List<Car> result = new ArrayList<>();
        if(count < 5 && count > 0){
            return result = cars.subList(0,count);
        } else{
            return cars;
        }
    }

}
