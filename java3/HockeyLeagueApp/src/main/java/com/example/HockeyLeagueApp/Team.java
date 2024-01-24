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
public class Team {
    
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int teamID;
    String teamName;

}
