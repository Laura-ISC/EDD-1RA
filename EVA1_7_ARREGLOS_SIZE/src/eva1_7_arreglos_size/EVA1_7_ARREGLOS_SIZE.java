/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_arreglos_size;

/**
 *
 * @author laura
 */
public class EVA1_7_ARREGLOS_SIZE {
   
   public static void main(String[] args) {
      int[] original = new int [10];
      System.out.println(original);
      for (int i = 0; i < original.length; i++) { //LLENAR CON DATOS ALEATORIOS
         original[i] = (int)(Math.random() * 100);
      }
      for (int i = 0; i < original.length; i++) { //IMPRIMIR
         System.out.print("[" + original[i] + "]");
      }
      System.out.println("");
      //CAMBIAR EL TAMAÑO (NO SE PUEDE)
      //RESPALDO
      int[] copia = original; //copio la dirección del arreglo original
      original = new int[5]; //AQUI DESCONECTAMMOS EL ARREGLO TAMAÑO 10 Y LO REEMPLAZAMOS
      System.out.println(original);
      //TRANSFERIR LA INFORMACIÓN
      for (int i = 0; i < original.length; i++) {
         original[i] = copia[i];
      }
      for (int i = 0; i < original.length; i++) { //IMPRIMIR ARREGLO "MODIFICADO"
        System.out.print("[" + original[i] + "]");
         
      }
   }
   
}
