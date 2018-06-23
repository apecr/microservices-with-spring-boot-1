package com.example.demo.domain;

public class Player {

	String name;
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
