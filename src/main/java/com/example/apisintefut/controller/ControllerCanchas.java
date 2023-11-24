package com.example.apisintefut.controller;
import com.example.apisintefut.interfaceService.ICanchaService;
import com.example.apisintefut.model.Canchas;
import com.example.apisintefut.model.Personas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/views/canchas/")
public class ControllerCanchas {

    @Autowired
    private ICanchaService canchaService;
    @GetMapping("/listar")
    public String listar(Model model){
        List<Canchas> listaCanchas = canchaService.listar();
        model.addAttribute("titulo","Lista de Canchas");
        model.addAttribute("canchas", listaCanchas);
        return "/views/canchas/listar";
    }

    @GetMapping("/eliminar{id}")
    public String delete(@PathVariable int id){
        canchaService.delete(id);
        return "redirect:/views/canchas/listar";
    }

    @GetMapping("/guardarC")
    public String agregar(Model model){
        model.addAttribute("cancha", new Canchas());
        return "views/canchas/registro_cancha";
    }


    @PostMapping("/save")
    public String save(@Validated Canchas c){
        canchaService.save(c);
        return "redirect:/views/canchas/listar";
    }
}


