package com.example.apisintefut.service;

import com.example.apisintefut.interfaceService.ICanchaService;
import com.example.apisintefut.model.Canchas;
import com.example.apisintefut.repository.RepositoryCanchas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceCancha implements ICanchaService {

    @Autowired
    private RepositoryCanchas repositoryCanchas;

    @Override
    public List<Canchas> listar(){

        return (List<Canchas>) repositoryCanchas.findAll();
    }

    @Override
    public Optional<Canchas> listId(int id){
        return repositoryCanchas.findById(id);
    }

    @Override
    public int save(Canchas c){
        int res =0;
        Canchas cancha = repositoryCanchas.save(c);
        if(!cancha.equals(null)){
            res = 1;
        }
        return res;
    }

    @Override
    public void delete(int id){
        repositoryCanchas.deleteById(id);
    }




}
