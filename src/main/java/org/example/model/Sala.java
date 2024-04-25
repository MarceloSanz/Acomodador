package org.example.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@Component
public class Sala {
   private Butaca[][] butacas;
   private Integer[][] butacasPuntuacion;
   public Sala(int filas, int columnas){
      butacas = new Butaca[filas][columnas];
      butacasPuntuacion = new Integer[filas][columnas];
      for (int i = 0; i < butacas.length; i++) {
         for (int j = 0; j < butacas[i].length; j++) {
            butacasPuntuacion[i][j] = 0;
            butacas[i][j] = new Butaca();
            butacas[i][j].setNumFila(i);
         }
      }
   }

   public Butaca[][] getButacas() {
      return butacas;
   }

   public void setButacas(Butaca[][] butacas) {
      this.butacas = butacas;
   }

   public Integer[][] getButacasPuntuacion() {
      return butacasPuntuacion;
   }

   public void setButacasPuntuacion(Integer[][] butacasPuntuacion) {
      this.butacasPuntuacion = butacasPuntuacion;
   }
}
