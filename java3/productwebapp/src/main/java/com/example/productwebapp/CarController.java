
package com.example.productwebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarController {
    @RequestMapping("/newCar")
    public String newCar(Model model){
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
    
  @RequestMapping("/showCars/{make}")
    public String createCar(Model model, @PathVariable String make) {
        model.addAttribute("cars", carRepository.findByMake(make));
        return "carlist";
    }
    


}
