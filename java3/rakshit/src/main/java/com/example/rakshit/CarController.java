/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.rakshit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author raksh
 */
@Controller
public class CarController {
@RequestMapping("/newCar")
public String newCar(Model model) {
model.addAttribute("car", new Car());
return "carform";
}
@Autowired
CarRepository carRepository;
@RequestMapping("/createCar")
public String createCar(Model model, @ModelAttribute Car car) {
carRepository.save(car);
model.addAttribute("cars", carRepository.findAll());
return "carlist";
}


}
