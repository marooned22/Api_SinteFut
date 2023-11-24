package com.example.apisintefut.controller;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.apisintefut.interfaceService.IReservaService;
import com.example.apisintefut.model.Reserva;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/views/reservas")
public class ControllerReserva {

    @Autowired
    private IReservaService reservaService;

    @GetMapping("/listar")
    public String listar(Model model) {
        List<Reserva> reservas = reservaService.listar();
        model.addAttribute("reservas", reservas);
        return "index"; // Reemplaza "index" por el nombre correcto de tu página de listado de reservas
    }

    @GetMapping("/eliminar{id}")
    public String delete(@PathVariable int id) {
        reservaService.delete(id);
        return "redirect:/views/reserva/listar";
    }

    @PostMapping("/guardar")
    public String save(@Validated @ModelAttribute("reserva") Reserva reserva) {
        reservaService.save(reserva);
        return "redirect:/views/reserva/listar";
    }

    @GetMapping("/nuevo")
    public String agregar(Model model) {
        model.addAttribute("reserva", new Reserva());
        return "reserva"; // Reemplaza "form" por el nombre correcto de tu página de formulario para reservas
    }
}

