package web.dao;

import web.model.Car;

import java.util.List;

public interface IDAO {
    List<Car> getNCars(int n);
}
