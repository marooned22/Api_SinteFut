package com.example.apisintefut.interfaceService;


import com.example.apisintefut.model.Reserva;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface IReservaService {
    public List<Reserva> listar();
    public Optional<Reserva> listId(int id);
    public int save (Reserva r);
    public void delete(int id);
}
