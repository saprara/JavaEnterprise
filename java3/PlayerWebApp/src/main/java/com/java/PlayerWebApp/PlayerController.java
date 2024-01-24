/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.PlayerWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author raksh
 */
@Controller
@RequestMapping("/")

public class PlayerController {
public String index (Model model) {
    Player player= new Player("amy","defense","red");
model.addAttribute("player", new Player());
return "dumboo";
}
@RequestMapping("/showPlayer")

public String showPlayer(Model model, @ModelAttribute Player player) {
    model.addAttribute("player",player);
    return "player";
}
}
