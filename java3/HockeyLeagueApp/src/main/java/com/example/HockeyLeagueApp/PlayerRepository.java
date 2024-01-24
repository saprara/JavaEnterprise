package com.example.HockeyLeagueApp;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, Integer> {
    public List<Player> getPlayerByTeamID(int teamID);
}
