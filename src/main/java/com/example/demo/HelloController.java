package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.domain.Player;
import com.example.demo.domain.Team;

@Controller
public class HelloController {

	private Team team;

	@PostConstruct
	public void init() {
		Set<Player> players = new HashSet<Player>();
		players.add(new Player("Charlie Brown", "pitcher"));
		players.add(new Player("Snoopy", "shortstop"));
		team = new Team("Snoop", "California", "Peanuts", players);
	}

	@RequestMapping("/hi")
	public @ResponseBody Team hiThere() {
		return team;
	}

}
