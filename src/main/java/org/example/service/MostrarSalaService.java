package org.example.service;

import org.example.model.Sala;
import org.springframework.stereotype.Service;

@Service
public class MostrarSalaService implements IMostrarSalaService {
    @Override
    public void mostrarSala(Sala sala) {
        for (int i = 0; i < sala.getButacas().length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < sala.getButacas()[i].length; j++) {
                System.out.print("[".concat(sala.getButacas()[i][j].getEstadoButaca().getEstado().concat("] ")));
            }
            System.out.println();
        }
    }

    @Override
    public void mostrarPuntuacion(Sala sala) {
        for (int i = 0; i < sala.getButacasPuntuacion().length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < sala.getButacasPuntuacion()[i].length; j++) {
                System.out.print("[".concat(sala.getButacasPuntuacion()[i][j].toString().concat("] ")));
            }
            System.out.println();
        }
    }
}
