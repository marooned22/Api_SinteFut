package com.example.apisintefut.interfaceService;

import com.example.apisintefut.model.AdministradorCentro;


import java.util.List;
import java.util.Optional;

public interface IAdministradorCentro {



    public List<AdministradorCentro> list();
    public Optional<AdministradorCentro> listId(int id);
    public int save (AdministradorCentro a);
    public void delete(int id);
}
