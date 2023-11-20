package com.example.apisintefut.repository;

import com.example.apisintefut.model.Personas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryPersonas extends JpaRepository<Personas,Integer> {



}
