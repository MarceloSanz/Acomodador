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
    public Sala mostrarSala() {
        return salaRepository.getSala();
    }
}
        /*
        Acomodador automático.

        Tenemos un cine-teatro con una única sala. Todas las filas y todas las butacas tienen buena visibilidad,
        siendo de mejor visibilidad cuanto más cerca del escenario. Tenemos 9 filas con 10 butacas por fila

        Para cada butaca se configuran los datos: número de fila, asiento, ocupado (booleano).

        Nuestro teatro no tiene pasillos al medio, y las butacas centrales son la 1 y la 2, estando a la izquierda
        los impares y a la derecha los pares.

        En nuestra aplicación de ejemplo podremos precargar la lista de butacas ocupadas.

        En caso de vender más entradas conjuntas debemos buscar la manera de que el sistema nos permita asignar las
        mejores butacas libres. Las mejores butacas serán aquellas que están juntas, lo más cerca del
        escenario/pantalla y lo más centradas posibles.

        La aplicación debe pintar por consola la situación del teatro: butacas libres, butacas ocupadas y butacas
        reservadas. Las butacas reservadas son las asignadas al solicitar butacas/entradas.

        El ejercicio se debe realizar como aplicación de consola.

        Parte 2

        Necesitamos un método que nos devuelva todas las posibilidades de butacas contiguas libres.
        El método necesitará como parámetro el número de butacas contiguas necesarias
         */