package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDaoImpl;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private final CarDao carDao;

    @Autowired
    public CarServiceImpl(CarDaoImpl carDAO) {
        this.carDao = carDAO;
    }

    @Override
    public List<Car> getNCars(int n) {
        return carDao.getNCars(n);
    }
}
