/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_paso_parametros;

/**
 *
 * @author laura
 */
public class EVA1_5_PASO_PARAMETROS {
   
   public static void main(String[] args) {
      int i = 5;
      System.out.println("Valor i = " +  i);
      incrementar (i);
      System.out.println("Valor de i (despues de incrementar) = " + i);  
      //AHORA PASO POR REFERENCIA
      Prueba prueba = new Prueba();
      System.out.println("Valor de prueba.y = " + prueba.y);
      incrementarObj(prueba);
      System.out.println("Valor de prueba.y (despues de incrementar) = " + prueba.y);
   }
   public static void incrementar(int valor){ //PASO POR VALOR  (RECIBO COPIA)
      valor++;
   }
   public static void incrementarObj(Prueba objeto){
      objeto.y++;
   }
}

class Prueba{
   int y = 5;
}