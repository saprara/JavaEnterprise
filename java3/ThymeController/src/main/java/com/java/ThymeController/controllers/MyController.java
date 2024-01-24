/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.ThymeController.controllers;


import com.java.ThymeController.beans.Num;
import com.java.ThymeController.beans.Address;
import com.java.ThymeController.beans.Player;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author raksh
 */

@Controller
public class MyController{
    @RequestMapping("/")
    public String index(){
        return "thymeleaf";
    }
    @RequestMapping("/name")
    public String index(Model model) {
        model.addAttribute("name", "Sarah");
        return "name";
    }
    @RequestMapping("/player")
    public String player(Model model) {
        Address address = new Address("Yonge St", "Toronto");
        Player player = new Player("Amy", "Goalie", address);
        model.addAttribute("player", player);
        return "player";
    }
    @RequestMapping("/number")
    public String number(Model model) {
        Num number = new Num(5);
        model.addAttribute("number", number);
        return "number";
    }
    @RequestMapping("/players")
    public String players(Model model) {
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(new Player("Amy", "Goalie", new Address("Street 1", "Toronto")));
        players.add(new Player("Bob", "Defense", new Address("Street 2", "Oakville")));
        players.add(new Player("Cindy", "Forward", new Address("Street 3", "Brampton")));
        model.addAttribute("players", players);
        return "players";
    }

   
}