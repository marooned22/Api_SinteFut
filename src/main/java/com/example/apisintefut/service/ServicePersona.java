package com.example.apisintefut.service;


import com.example.apisintefut.interfaceService.IPersonaService;
import com.example.apisintefut.model.Personas;
import com.example.apisintefut.repository.RepositoryPersonas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicePersona  implements IPersonaService {

    @Autowired
    private RepositoryPersonas repositoryPersonas;

    @Override public List<Personas> listar(){
        return (List<Personas>)  repositoryPersonas.findAll();

    }

    @Override
    public Optional<Personas> listId(int id){
        return repositoryPersonas.findById(id);
    }

    @Override
    public int save(Personas p){
        int res =0;
        Personas persona = repositoryPersonas.save(p);
        if(!persona.equals(null)){
            res = 1;
        }
        return res;
    }

    @Override
    public void delete(int id){
        repositoryPersonas.deleteById(id);
    }


}
