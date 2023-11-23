package com.example.apisintefut.repository;

import com.example.apisintefut.model.Personas;
import com.example.apisintefut.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryReservas extends JpaRepository<Reserva,Integer> {

}
