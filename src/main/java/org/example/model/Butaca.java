package org.example.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import static org.example.model.ButacasEstado.LIBRE;

@Data
@Component
public class Butaca {
    //número de fila, asiento, ocupado (booleano)
    private int numFila;
    private int asiento;
    private ButacasEstado estadoButaca;
    public Butaca(){
        estadoButaca= LIBRE;
    }
}
