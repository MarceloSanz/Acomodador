package org.example.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@Component
public class Butaca {
    //número de fila, asiento, ocupado (booleano)
    private int numFila;
    private int asiento;
    private ButacasEstado estadoButaca;
}
