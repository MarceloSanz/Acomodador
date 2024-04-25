package org.example.acomodadorApp;

import org.example.controller.AcomodadorController;
import org.example.controller.SalaController;
import org.example.model.Sala;
import org.example.service.GestionarSala;
import org.springframework.stereotype.Component;

@Component
public class AcomodadorApp {
    AcomodadorController acomodadorController;
    SalaController salaController;
    public AcomodadorApp(AcomodadorController acomodadorController, SalaController salaController){
        this.acomodadorController = acomodadorController;
        this.salaController = salaController;
    }
    public void run(){
        System.out.println("Bienvenido al Teatro de la maestranza");
        System.out.println("1. Introducir datos de sala\n2.Consultar estado de sala\n3.Reservar butacas");
        Sala sala = new Sala(9,10);
        System.out.println(sala.getButacas().length/2);
        acomodadorController.asignarPuntuacion(sala);
        salaController.imprimirSalaPuntuacion(sala);
        salaController.imprimirSala(sala);
    };
    private void menu(int input){
        switch (input){
            case 1:
                System.out.println("1.Introducir filas y columnas");
                break;
            case 2:
                System.out.println("La sala tiene esta ocupacion\n Reservado(*)\nLibre(-)\nOcupado(+)");
                break;
            default:
                break;
        }
    }

}
