package com.mywebapp.models;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "team")
public class Team {
	
	   @Id @GeneratedValue
	   @Column(name = "team_id")
	   private int team_id;
	   
	   @Column(name = "team_name")
	   private String team_name;
	   
	   @OneToMany(mappedBy = "team")
	   private List<Player> players = new ArrayList<Player>();

	public int getTeam_id() {
		return team_id;
	}

	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	   
}
