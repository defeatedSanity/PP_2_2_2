package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDAOImitationImpl;
import web.dao.IDAO;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private final IDAO carDao;

    @Autowired
    public CarServiceImpl(CarDAOImitationImpl carDAO) {
        this.carDao = carDAO;
    }

    @Override
    public List<Car> getNCars(int n) {
        return carDao.getNCars(n);
    }
}
