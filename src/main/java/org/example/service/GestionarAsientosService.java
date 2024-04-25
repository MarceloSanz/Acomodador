package org.example.service;

import org.example.model.Butaca;
import org.example.model.ISalaRepository;
import org.example.model.Sala;
import org.springframework.stereotype.Service;

@Service
public class GestionarAsientosService implements IGestionarAsientosService{
    ISalaRepository salaRepository;
    public GestionarAsientosService(ISalaRepository salaRepository){
        this.salaRepository = salaRepository;
    }

    @Override
    public void iniciarSalaVacia(int filas, int columnas) {
        salaRepository.crearSala(columnas, filas);
    }

    @Override
    public Sala iniciarSalaConButacasOcupadas(Sala sala) {
        return salaRepository.crearSala(sala);
    }

    @Override
    public Sala butacasOcupadas() {
        return null;
    }

    @Override
    public Sala solicitarButacas(int numeroButacas) {
        return null;
    }

    @Override
    public Sala asignarButacas(Butaca[] butacas) {
        return null;
    }

    @Override
    public Sala reservarButacas(Butaca[] butacas) {
        return null;
    }

    @Override
    public void asignarNumeroButacas(Butaca[][] butacas) {
        for (int i = 0; i < butacas.length; i++) {
            int fila = butacas[i].length;
            int acumulado=0;
            for (int j = 0; j < butacas[i].length; j++) {
                if (j<butacas[i].length/2) {
                    butacas[i][j].setAsiento( butacas[i].length-1 -acumulado + fila*i);
                    acumulado +=2;
                } else {
                    acumulado -=2;
                    butacas[i][j].setAsiento(butacas[i].length -acumulado + fila*i );
                }
            }
            System.out.println();
        }
    }

}