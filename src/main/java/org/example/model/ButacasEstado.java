package org.example.model;

import org.springframework.stereotype.Component;

public enum ButacasEstado {
    LIBRE('-'),
    RESERVADO('*'),
    OCUPADO('+');
    private char estado;

    ButacasEstado(char estado) {
        this.estado = estado;
    }

    public char getEstado() {
        return estado;
    }
}
