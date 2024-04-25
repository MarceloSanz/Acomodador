package org.example.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@Component
public class Sala {
   private Butaca[][] butacas;
   private int[][] butacasPuntuacion;
   public Sala(int filas, int columnas){
      butacas = new Butaca[columnas][filas];
      butacasPuntuacion = new int[columnas][filas];
   }

   public Butaca[][] getButacas() {
      return butacas;
   }

   public void setButacas(Butaca[][] butacas) {
      this.butacas = butacas;
   }

   public int[][] getButacasPuntuacion() {
      return butacasPuntuacion;
   }

   public void setButacasPuntuacion(int[][] butacasPuntuacion) {
      this.butacasPuntuacion = butacasPuntuacion;
   }
}
