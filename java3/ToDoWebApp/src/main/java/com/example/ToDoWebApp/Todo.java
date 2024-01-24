/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ToDoWebApp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author raksh
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Todo {
    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)


    int id;
    String person,description;
}
