package com.example.apisintefut.service;

import com.example.apisintefut.interfaceService.IAdministradorCentro;
import com.example.apisintefut.model.AdministradorCentro;
import com.example.apisintefut.repository.RepositoryAdministradorCentro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ServiceAdministradorCentro implements IAdministradorCentro {


    @Autowired
    private RepositoryAdministradorCentro repositoryAdministradorCentro;

    @Override
    public List<AdministradorCentro> list (){
        return (List<AdministradorCentro>) repositoryAdministradorCentro.findAll();
    }

    @Override
    public Optional<AdministradorCentro> listId(int id){
        return repositoryAdministradorCentro.findById(id);
    }

    @Override
    public int save(AdministradorCentro a){
        int res =0;
        AdministradorCentro administradorCentro = repositoryAdministradorCentro.save(a);
        if(!administradorCentro.equals(null)){
            res = 1;
        }
        return res;
    }


    @Override
    public void delete(int id){
        repositoryAdministradorCentro.deleteById(id);
    }
}
