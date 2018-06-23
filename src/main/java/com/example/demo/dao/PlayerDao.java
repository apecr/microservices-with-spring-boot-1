package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Player;

public interface PlayerDao extends CrudRepository<Player, Long> {

}
