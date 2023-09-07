package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDAOImitationImpl implements IDAO{
    List<Car> carDataBase = new ArrayList<>();

    public CarDAOImitationImpl() {
        for (int i = 0; i < 5; i++) {
            carDataBase.add(new Car("Model" + i, "Series" + i, 1990 + i));
        }
    }

    @Override
    public List<Car> getNCars(int n) {
        return n < 5 ? carDataBase.subList(0, n) : carDataBase.subList(0, 5);
    }
}
