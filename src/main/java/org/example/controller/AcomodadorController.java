package org.example.controller;

import org.example.model.Sala;
import org.example.service.*;
import org.springframework.stereotype.Controller;

@Controller
public class AcomodadorController {
    IGestionarAsientosService gestionarAsientosService;
    IPuntuacionAsientos puntuacionAsientos;
    IMenuService menuService;
    public AcomodadorController(IGestionarAsientosService gestionarAsientosService,
                                IPuntuacionAsientos puntuacionAsientos,
                                IMenuService menuService){
        this.gestionarAsientosService = gestionarAsientosService;
        this.puntuacionAsientos = puntuacionAsientos;
        this.menuService = menuService;
    }
    public void asignarPuntuacion(Sala sala){
        puntuacionAsientos.asignarPuntuacionColumnas(sala);
        puntuacionAsientos.asignarPuntuacionFilas(sala);
    }

}
