package com.example.apisintefut.service;

import com.example.apisintefut.interfaceService.IcentroDeportivoService;
import com.example.apisintefut.model.centroDeportivo;
import com.example.apisintefut.repository.RepositorycentroDeportivo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service
public class ServicecentroDeportivo implements IcentroDeportivoService {


    @Autowired
    private RepositorycentroDeportivo repositorycentroDeportivo;

    @Override
    public List<centroDeportivo> listar(){

        return (List<centroDeportivo>) repositorycentroDeportivo.findAll();
    }

    @Override
    public Optional<centroDeportivo> listId(int id){
        return repositorycentroDeportivo.findById(id);
    }

    @Override
    public int save(centroDeportivo cd){
        int res =0;
        centroDeportivo cancha = repositorycentroDeportivo.save(cd);
        if(!cancha.equals(null)){
            res = 1;
        }
        return res;
    }

    @Override
    public void delete(int id){
        repositorycentroDeportivo.deleteById(id);
    }
	
}
