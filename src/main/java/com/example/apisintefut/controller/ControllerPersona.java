package com.example.apisintefut.controller;

import com.example.apisintefut.interfaceService.IPersonaService;
import com.example.apisintefut.model.Personas;
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
@RequestMapping("views/personas")
public class ControllerPersona {

    @Autowired
    private IPersonaService personaService;

    @GetMapping("/listar")
    public String listar(Model model){
        List<Personas> personas = personaService.listar();
        model.addAttribute("personas", personas);
        return "views/personas/listar";
    }

    @GetMapping("eliminar/{id}")
    public String delete(@PathVariable int id){
        personaService.delete(id);
        return "redirect:/listar";
    }

    @PostMapping("/save")
    public String save(@Validated Personas p){
        personaService.save(p);
        return "redirect:/views/personas/listar";
    }

    @GetMapping("/nuevo")
    public String agregar(Model model){
        model.addAttribute("persona", new Personas());
        return "views/personas/listar";
    }


}
