package com.mywebapp.repository;

import com.mywebapp.models.Player;

public interface PlayerRepository {

    Player getPlayerById(int id);
    
    Player getPlayerByName(String name);
    
    Player getPlayerBySurname(String surname);
 
    Player savePlayer(Player t);
     
    void deletePlayer(Player t);
	
}
