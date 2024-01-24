package com.example.productwebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {
    
    @Autowired
    ProductRepository productRepository;
    
    
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("product", new Product());
        return "index";
    }
    
        @RequestMapping("/addProduct")
    public String addProduct(Model model, @ModelAttribute Product product){
                productRepository.insertProduct(product);
                model.addAttribute("products", productRepository.findAllProducts());
                return "productlist";
    }

}
