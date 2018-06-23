package com.example.demo.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Team {

	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String name;

	@Column
	private String location;
	@Column
	private String masscote;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "teamId")
	private Set<Player> players;

	public Team() {
		super();
	}

	public Team(String name, String location, String masscote, Set<Player> players) {
		this();
		this.name = name;
		this.location = location;
		this.masscote = masscote;
		this.players = players;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMasscote() {
		return masscote;
	}

	public void setMasscote(String masscote) {
		this.masscote = masscote;
	}

	public Set<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Set<Player> players) {
		this.players = players;
	}

}
