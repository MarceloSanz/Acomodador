package org.example.controller;

import org.example.model.Sala;
import org.example.service.IMostrarSalaService;
import org.example.service.IPuntuacionAsientos;
import org.springframework.stereotype.Controller;

import javax.swing.plaf.PanelUI;

@Controller
public class SalaController {
    IMostrarSalaService mostrarSalaService;
    public SalaController(IPuntuacionAsientos puntuacionAsientos, IMostrarSalaService mostrarSalaService){
        this.mostrarSalaService = mostrarSalaService;
    }
    public  void  imprimirSala(Sala sala){mostrarSalaService.mostrarSala(sala);}
    public void imprimirSalaPuntuacion(Sala sala){mostrarSalaService.mostrarPuntuacion(sala);}
}
