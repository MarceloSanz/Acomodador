package org.example.acomodadorApp;

import org.example.controller.AcomodadorController;
import org.example.model.Sala;
import org.springframework.stereotype.Component;

@Component
public class AcomodadorApp {
    AcomodadorController acomodadorController;
    public AcomodadorApp(AcomodadorController acomodadorController){
        this.acomodadorController = acomodadorController;
    }
    public void run(){
        System.out.println("Bienvenido al Teatro de la maestranza");
        System.out.println("1. Introducir datos de sala\n2.Consultar estado de sala\n3.Reservar butacas");
        Sala sala = new Sala(3,4);
        System.out.println(sala.getButacas().length/2);
        acomodadorController.asignarPuntuacion(sala);
        for (int i = 0; i < sala.getButacas().length; i++) {
            for (int j = 0; j < sala.getButacas()[i].length; j++) {
                System.out.print(sala.getButacasPuntuacion()[i][j]);
            }
            System.out.println();
        }
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
