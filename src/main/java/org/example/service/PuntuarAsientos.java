package org.example.service;

import org.example.model.Sala;
import org.springframework.stereotype.Service;

@Service
public class PuntuarAsientos implements IPuntuacionAsientos{
    @Override
    public void asignarPuntuacionFilas(Sala sala) {
        for (int i = 0; i < sala.getButacas().length; i++) {
            for (int j = 0; j < sala.getButacas()[i].length; j++) {
                sala.getButacasPuntuacion()[i][j] += sala.getButacas().length-i;
            }
        }
    }

    @Override
    public void asignarPuntuacionColumnas(Sala sala) {
        for (int i = 0; i < sala.getButacas().length; i++) {
            for (int j = 0; j < sala.getButacas()[i].length; j++) {
                int centro = sala.getButacas()[i].length/2;
                if (j>=centro-1 && j<=centro){
                    sala.getButacasPuntuacion()[i][j] += 2;
                }else {
                    sala.getButacasPuntuacion()[i][j] += 1;
                }
            }
        }
    }
}