package com.example.apisintefut.interfaceService;
import com.example.apisintefut.model.Canchas;
import com.example.apisintefut.model.Personas;

import java.util.List;
import java.util.Optional;
public interface ICanchaService {

    public List<Canchas> listar();
    public Optional<Canchas> listId(int id);
    public int save (Canchas c);
    public void delete(int id);

}
