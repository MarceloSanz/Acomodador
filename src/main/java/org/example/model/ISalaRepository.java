package org.example.model;

public interface ISalaRepository {
    Sala setButacas();
    Sala reservarButacas();
    Sala getSala();
    Sala crearSala(int filas, int columnas);
    Sala crearSala(Sala sala);
}
