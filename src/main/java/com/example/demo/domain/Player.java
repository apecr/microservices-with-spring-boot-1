package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Player {

	@Id
	@GeneratedValue
	Long id;
	@Column
	String name;
	@Column
	String position;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Player(String name, String position) {
		this();
		this.name = name;
		this.position = position;
	}

	public Player() {
		super();
	}

}
