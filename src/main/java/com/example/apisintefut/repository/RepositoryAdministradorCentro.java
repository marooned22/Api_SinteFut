package com.example.apisintefut.repository;

import com.example.apisintefut.model.AdministradorCentro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryAdministradorCentro extends JpaRepository<AdministradorCentro, Integer> {
}
