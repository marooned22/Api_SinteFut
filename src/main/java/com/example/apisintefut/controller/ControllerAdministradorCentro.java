package com.example.apisintefut.controller;

import com.example.apisintefut.interfaceService.IAdministradorCentro;

import com.example.apisintefut.interfaceService.ICanchaService;
import com.example.apisintefut.model.AdministradorCentro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/views/administradorCentro")
public class ControllerAdministradorCentro {



    @Autowired
    private IAdministradorCentro administradorCentroService;

    @GetMapping("/listar")
    public String listarAdministradores(Model model){
        List<AdministradorCentro> administradorCentros = administradorCentroService.list();
        model.addAttribute("administradorCentro", administradorCentros);
        return "index";
    }

    @GetMapping("eliminar/{id}")
    public String delete(@PathVariable int id){
        administradorCentroService.delete(id);
        return "redirect:/listar";
    }

    @PostMapping("/save")
    public String save(@Validated AdministradorCentro a){
        administradorCentroService.save(a);
        return "redirect:/listar";
    }

    @GetMapping("/nuevo")
    public String agregar(Model model){
        model.addAttribute("administradorCentro", new AdministradorCentro());
        return "index";
    }

}
