package com.example.apisintefut.repository;

import com.example.apisintefut.model.Canchas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCanchas extends JpaRepository<Canchas, Integer> {
}
