package com.example.HockeyLeagueApp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String playerName;
    String playerAddress;
    int teamID;
    String playerRole;
    boolean activeStatus;
    
    public Player(String playerName, String playerAddress, int teamID, String playerRole, boolean activeStatus){
        this.playerName=playerName;
        this.playerAddress=playerAddress;
        this.teamID=teamID;
        this.playerRole=playerRole;
        this.activeStatus=activeStatus;
    }

}
