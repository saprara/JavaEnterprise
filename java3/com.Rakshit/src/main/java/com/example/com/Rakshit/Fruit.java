/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.com.Rakshit;

import org.springframework.stereotype.Component;

/**
 *
 * @author raksh
 */
@Component
public class Fruit {
    private String color = "yellow";

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
