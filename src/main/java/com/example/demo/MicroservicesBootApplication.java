package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.TeamDao;
import com.example.demo.domain.Player;
import com.example.demo.domain.Team;

@SpringBootApplication   
public class MicroservicesBootApplication {
	
	/**
	 * Used to run as a jar
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(MicroservicesBootApplication.class, args);
	}

	@PostConstruct
	public void init() {
		Set<Player> players = new HashSet<Player>();
		players.add(new Player("Charlie Brown", "pitcher"));
		players.add(new Player("Snoopy", "shortstop"));
		Team team = new Team("Snoop", "California", "Peanuts", players);
		teamDao.save(team);
	}

	@Autowired
	TeamDao teamDao;

}
