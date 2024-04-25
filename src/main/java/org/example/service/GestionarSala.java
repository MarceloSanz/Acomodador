package org.example.service;

import org.example.model.ISalaRepository;
import org.example.model.Sala;

public class GestionarSala implements IGestionarSala{
    ISalaRepository salaRepository;
    public GestionarSala(ISalaRepository salaRepository){
        this.salaRepository = salaRepository;
    }
    @Override
    public Sala inicializarYcrearSala(int filas, int columnas) {
        return salaRepository.crearSala(filas,columnas);
    }
}
