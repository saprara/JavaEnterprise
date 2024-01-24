/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.ToDoWebApp;

/**
 *
 * @author raksh
 */
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository <Todo, Integer> {
    
}
