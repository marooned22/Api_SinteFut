package com.example.apisintefut.service;

import com.example.apisintefut.interfaceService.IReservaService;

import com.example.apisintefut.model.Reserva;
import com.example.apisintefut.repository.RepositoryReservas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ServiceReserva implements IReservaService {

    @Autowired
    private RepositoryReservas repositoryReservas;

    @Override public List<Reserva> listar(){
        return (List<Reserva>)  repositoryReservas.findAll();

    }

    @Override
    public Optional<Reserva> listId(int id){
        return repositoryReservas.findById(id);
    }

    @Override
    public int save(Reserva r){
        int res =0;
        Reserva reserva = repositoryReservas.save(r);
        if(!reserva.equals(null)){
            res = 1;
        }
        return res;
    }

    @Override
    public void delete(int id){
        repositoryReservas.deleteById(id);
    }



}
