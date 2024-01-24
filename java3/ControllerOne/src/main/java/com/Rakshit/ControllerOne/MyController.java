/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Rakshit.ControllerOne;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author raksh
 */

    @Controller
public class MyController {
    @RequestMapping("/two")
    public String processRequest(){
        return "index2.html";
  
}
    @RequestMapping("/three")
    public String abc(){
        return "index3.html";
    }
    @RequestMapping("/four")
    public String four(){
        return "index4.html";
    }
     @RequestMapping("/five")
     @ResponseBody
    public String five(){
        return "index5.html";
    }
    @RequestMapping("/six")
     @ResponseBody
    public String six(){
        return "<b> <u> gotchaa </b> </u>";
    }
    
//    @RequestMapping("/book")
//    @ResponseBody
//    public Book readBook(){
//            Book book = new Book("holly","king","1234");
//            return book;
//    
  //  }
    @RequestMapping("/student")
    @ResponseBody
    public String saveStudent(@RequestParam String name, @RequestParam String number,@RequestParam double GPA){
        return("<!DOCTYPE html> "
                + "<html> "
                + "<body>"
                + " <h1> name: "+name+""
                + "<br> number: "+number+"<br> GPA: "+GPA
                +"</h1>"
                + "</body>"
                + "</html>");
        }

    @RequestMapping("/hello/{name}")
@ResponseBody
public String sayHello(@PathVariable String name){
return "Hello "+name;

}
 @RequestMapping("/add")
    @ResponseBody
    public String add(@RequestParam double num1, @RequestParam double  num2){
        double num3 =num1 +num2;
        return("<!DOCTYPE html> "
                + "<html> "
                + "<body>"
                + "<h1> sum is "+
                num3
                +"</h1>"
                + "</body>"
                + "</html>");
        }
    
    
@RequestMapping("/book")
@ResponseBody
public Book showBook(@RequestParam String Title, @RequestParam
String Author, @RequestParam String ISBN){
Book book = new Book(Title,Author,ISBN);
return book;
}

    }
