/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_4dimensiones;

/**
 *
 * @author laura
 */
public class EVA1_10_4DIMENSIONES {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      int[][][][] arreglo = new int[2][2][2][2];//almacena 16 enteros
      for (int i = 0; i < arreglo.length; i++) {//1er dimension
         for (int j = 0; j < arreglo[i].length; j++) {//2da
            for (int k = 0; k < arreglo[i][j].length; k++) {//3ra
               for (int l = 0; l < arreglo[i][j][k].length; l++) {//4ta
                  arreglo[i][j][k][l] = (int)(Math.random() * 100);
               }
            }
         }
         
      }
      
      for (int i = 0; i < arreglo.length; i++) {//1er dimension
         for (int j = 0; j < arreglo[i].length; j++) {//2da
            for (int k = 0; k < arreglo[i][j].length; k++) {//3ra
               for (int l = 0; l < arreglo[i][j][k].length; l++) {//4ta
                  System.out.print("[" + arreglo[i][j][k][l] + "]");
               }
            }
         }
      }   
   }
   
}
