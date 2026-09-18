/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_primos;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class EVA1_12_PRIMOS {

   public static void main(String[] args) {
      Scanner captu = new Scanner(System.in);
      int val;
      boolean esPrimo = true;
      int divisiones = 0;
      System.out.println("Introduce un valor: ");
      val = captu.nextInt();
      
      //n - 1
      for (int i = 2; i < val; i++) {
         int residuo = val % i;
         divisiones++;
         if (residuo == 0) {
            esPrimo = false;
            break;
    }
}
      if (esPrimo)
         System.out.println("El valor " + val + " si es primo");
      else
         System.out.println("El valor " + val + " no es primo");
      System.out.println("Divisiones realizadas: " + divisiones);
      
      esPrimo = true;
      divisiones = 0;
      int raiz = (int) Math.sqrt(val);
      for (int i = 2; i <= raiz; i++) {
         int residuo = val % i;
        divisiones++;
        if (residuo == 0) {
           esPrimo = false;
           break;
    }
}
      if (esPrimo)
         System.out.println("El valor " + val + " si es primo");
      else
         System.out.println("El valor " + val + " no es primo");
      System.out.println("Divisiones con raiz: " + divisiones);
   }
   
}
