package com.mywebapp.repository;

import com.mywebapp.models.Team;

public interface TeamRepository {

    Team getTeamById(int id);
    
    Team getTeamByName(String name);
 
    Team saveTeam(Team t);
     
    void deleteTeam(Team t);
	
}
