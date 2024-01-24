/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.com.Rakshit;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author raksh
 */
@Component
@Qualifier("apple")
public class Apple extends Fruit {

    @Override
    public String toString() {
        return getColor() + " apple ";
    }
}

