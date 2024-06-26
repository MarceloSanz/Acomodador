package org.example.service;

import org.example.model.Sala;

public interface IPuntuacionAsientos {
    int[][] asignarPuntuacionFilas(Sala sala);
    int[][] asignarPuntuacionColumnas(Sala sala);

    //Primero asignar puntuacion a las filas
    //Segundo puntuacion por columnas
    //Butacas conjuntas con mayor puntuación
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