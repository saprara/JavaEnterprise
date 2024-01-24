/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ToDoWebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author raksh
 */
@Controller
public class TodoController {
    @Autowired
    TodoRepository todoRepository;
   @RequestMapping("/")
   public String index(Model model){
     return"index";  
   }
   @RequestMapping("/newTodo")
   public String newTodo(Model model){
       model.addAttribute("todo",new Todo());
       return "newTodo";
   }
   @RequestMapping("/SaveTodo")
   public String newTodo(Model model,@ModelAttribute Todo todo){
       todoRepository.save(todo);
       model.addAttribute("todos",todoRepository.findAll());
       return "TODOlist";
   }
    @RequestMapping("/editTodo{id")
   public String newTodo(Model model,@PathVariable int id){
       
       model.addAttribute("todos",todoRepository.findby(int id));
       return "TODOlist";
   }
}
