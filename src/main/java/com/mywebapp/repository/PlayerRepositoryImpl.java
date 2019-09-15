package com.mywebapp.repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.mywebapp.models.Player;
import org.springframework.stereotype.Repository;

@Repository
public class PlayerRepositoryImpl implements  PlayerRepository{
	
	private EntityManager em;
	
	public Player getPlayerById(int id) {
	    return em.find(Player.class, id);
	}
	
	public Player getPlayerByName(String name) {
	    TypedQuery<Player> q = em.createQuery("SELECT p FROM Player p WHERE p.player_name = :name", Player.class);
	    q.setParameter("name", name);
	    return q.getSingleResult();
	}
	
	public Player getPlayerBySurname(String surname) {
	    TypedQuery<Player> q = em.createQuery("SELECT p FROM Player p WHERE p.player_surname = :surname", Player.class);
	    q.setParameter("surname", surname);
	    return q.getSingleResult();
	}
	
	@Override
	public Book saveBook(Book b) {
	    if (b.getId() == null) {
	        em.persist(b);
	    } else {
	        b = em.merge(b);
	    }
	    return b;
	}
	
	@Override
	public void deleteBook(Book b) {
	    if (em.contains(b)) {
	        em.remove(b);
	    } else {
	        em.merge(b);
	    }
	}

}

