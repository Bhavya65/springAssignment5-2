package com.nagarro.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.demo.model.Alien;

public interface AlienRepo extends JpaRepository<Alien,Integer>
{
	
}
