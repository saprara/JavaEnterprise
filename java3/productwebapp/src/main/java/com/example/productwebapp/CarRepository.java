package com.example.productwebapp;

import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface CarRepository extends CrudRepository<Car, Integer> {
    List<Car> findByMake(String make);
}
