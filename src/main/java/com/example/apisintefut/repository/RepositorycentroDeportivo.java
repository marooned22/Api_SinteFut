package com.example.apisintefut.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apisintefut.model.centroDeportivo;

@Repository
public interface RepositorycentroDeportivo extends JpaRepository<centroDeportivo, Integer> {
	
	
}
