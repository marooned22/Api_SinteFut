package com.example.apisintefut.interfaceService;

import com.example.apisintefut.model.centroDeportivo;
import java.util.List;
import java.util.Optional;

public interface IcentroDeportivoService {
	public List<centroDeportivo> listar();
    public Optional<centroDeportivo> listId(int id);
    public int save (centroDeportivo cd);
    public void delete(int id);
}
