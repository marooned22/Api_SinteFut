package com.example.apisintefut.controller;

import com.example.apisintefut.interfaceService.IcentroDeportivoService;
import com.example.apisintefut.model.centroDeportivo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("views/centroDeportivo")
public class ControllercentroDeportivo {

	@Autowired
    private IcentroDeportivoService centroDeportivoService;

    @GetMapping("/listar")
    public String listar(Model model){
        List<centroDeportivo> centroDeportivo = centroDeportivoService.listar();
        model.addAttribute("centrodeportivo", centroDeportivo);
        return "index";
    }

    @GetMapping("eliminar{id}")
    public String delete(@PathVariable int id){
        centroDeportivoService.delete(id);
        return "redirect:/listar";
    }

    @PostMapping("/save")
    public String save(@Validated centroDeportivo cd){
        centroDeportivoService.save(cd);
        return "redirect:/listar";
    }

    @GetMapping("/nuevo")
    public String agregar(Model model){
        model.addAttribute("centrodeportivo", new centroDeportivo());
        return "form";
    }


}

	

