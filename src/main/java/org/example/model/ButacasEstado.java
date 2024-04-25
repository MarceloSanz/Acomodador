package org.example.model;

import org.springframework.stereotype.Component;

public enum ButacasEstado {
    LIBRE("-"),
    RESERVADO("*"),
    OCUPADO("+");
    private String estado;

    ButacasEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
}
