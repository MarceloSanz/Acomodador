package org.example.model;

import org.springframework.stereotype.Repository;

@Repository
public class SalaRepository implements ISalaRepository{
    Sala sala;
    public SalaRepository(Sala sala){
        this.sala = sala;
    }

    @Override
    public Sala setButacas() {
        return null;
    }

    @Override
    public Sala reservarButacas() {
        return null;
    }

    @Override
    public Sala getSala() {
        return sala;
    }

    @Override
    public Sala crearSala(int filas, int columnas) {
        sala = new Sala(filas, columnas);
        return sala;
    }

    @Override
    public Sala crearSala(Sala sala) {
        this.sala = sala;
        return sala;
    }
}
