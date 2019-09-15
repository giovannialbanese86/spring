package com.mywebapp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "player")
public class Player {
	
	   @Id 
	   @GeneratedValue
	   @Column(name = "player_id")
	   private int player_id;
	   
	   @Column(name = "player_name")
	   private String player_name;
	   
	   @Column(name = "player_surname")
	   private String player_surname;
	   
	   @ManyToOne
	   @JoinColumn(name = "team_id")
	   private Team team;

	public int getPlayer_id() {
		return player_id;
	}

	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}

	public String getPlayer_name() {
		return player_name;
	}

	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}

	public String getPlayer_surname() {
		return player_surname;
	}

	public void setPlayer_surname(String player_surname) {
		this.player_surname = player_surname;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}
	   
}
