package org.example.controller;

import org.example.model.Sala;
import org.example.service.IGestionarAsientosService;
import org.example.service.IPuntuacionAsientos;
import org.springframework.stereotype.Controller;

@Controller
public class AcomodadorController {
    IGestionarAsientosService gestionarAsientosService;
    IPuntuacionAsientos puntuacionAsientos;
    public AcomodadorController(IGestionarAsientosService gestionarAsientosService,IPuntuacionAsientos puntuacionAsientos){
        this.gestionarAsientosService = gestionarAsientosService;
        this.puntuacionAsientos = puntuacionAsientos;
    }
    public void asignarPuntuacion(Sala sala){
        puntuacionAsientos.asignarPuntuacionFilas(sala);
    }
}
