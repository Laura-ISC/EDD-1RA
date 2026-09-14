/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_matrices;

/**
 *
 * @author laura
 */
public class EVA1_9_MATRICES {

   public static void main(String[] args) {
     int[][] matriz = new int [5][3];
      System.out.println("matriz = " + matriz );
      System.out.println("matriz.length = " + matriz.length);
      System.out.println("matriz[0] = " +  matriz[0]);
      System.out.println("matriz[0].length = " +  matriz[0].length);
      System.out.println("matriz[1].length = " +  matriz[1]);
      System.out.println("matriz[1].length = " +  matriz[1].length);
      //--------------
      for (int i = 0; i < matriz[i].length; i++) { //PRIMER DIMENSION --> FILAS
         for (int j = 0; j < matriz[i].length; j++) { //SEGUNDA DIMENSION --> COLUMNAS
            matriz[i][j] = (int)(Math.random() * 100);
         }
         
      }
      for (int i = 0; i < matriz[i].length; i++) { //PRIMER DIMENSION --> FILAS
         for (int j = 0; j < matriz[i].length; j++) { //SEGUNDA DIMENSION --> COLUMNAS
            System.out.print("[" + matriz[i][j] + "]");
         }
         System.out.println("");
      }
   }
   
}
