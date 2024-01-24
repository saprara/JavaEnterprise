package com.example.HockeyLeagueApp;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @Autowired
    TeamRepository teamRep;
    
    @Autowired
    PlayerRepository playerRep;
    
    
    @RequestMapping("/")
    public String index(Model model){
        
        
        model.addAttribute("teams", teamRep.findAll());
        return "index";
    }
    
    @RequestMapping("/showTeam")
    public String showTeam(Model model, @RequestParam int teamID){
        model.addAttribute("teamID", teamID);
        
        model.addAttribute("players", playerRep.getPlayerByTeamID(teamID));
        return "showTeam";
    }
    
        @RequestMapping("/newPlayer/{teamID}")
    public String newPlayer(Model model, @PathVariable int teamID){
        List<Team> teams = (List<Team>)teamRep.findAll();
        Team currentTeam = teamRep.findById(teamID).get();
        teams.remove(currentTeam);
        model.addAttribute("teams", teams);        
        model.addAttribute("player", new Player());
        model.addAttribute("currentteam", currentTeam);
        return "newPlayer";
    }
    
        @RequestMapping("/savePlayer")
    public String savePlayer(Model model, @ModelAttribute Player newPlayer){
        playerRep.save(newPlayer);
        return "redirect:/showTeam?teamID="+newPlayer.getTeamID();
    }

    @RequestMapping("/editPlayer/{id}")
    public String retrieveBooks(Model model, @PathVariable int id){
        Player player = playerRep.findById(id).get();
         List<Team> teams = (List<Team>)teamRep.findAll();
        Team currentTeam = teamRep.findById(player.getTeamID()).get();
        teams.remove(currentTeam);
        model.addAttribute("teams", teams);        
        model.addAttribute("player", player);
        model.addAttribute("currentteam", currentTeam);

        
        return "editPlayer";
    }

    @RequestMapping("/deletePlayer/{id}")
    public String deletePlayer(Model model, @PathVariable int id){
        Player player = playerRep.findById(id).get();
        model.addAttribute("player", player);
        return "deletePlayer";
    }

    @RequestMapping("/delete")
    public String delete(Model model, @RequestParam int id){
        Player player = playerRep.findById(id).get();
        model.addAttribute("teamID", player.getTeamID());
        playerRep.deleteById(id);
        model.addAttribute("players", playerRep.getPlayerByTeamID(player.getTeamID()));
        return "showTeam";
    }
    

}
