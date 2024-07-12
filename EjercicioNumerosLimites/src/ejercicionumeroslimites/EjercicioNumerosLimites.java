
package ejercicionumeroslimites;

import java.util.Scanner;


public class EjercicioNumerosLimites {

    public static void main(String[] args) {
        
        System.out.println("Ingrese el numero límite que desee");
        
        Scanner teclado = new Scanner (System.in);
        int limite = teclado.nextInt();
        
      
        int cont = 1;
        while (cont <= limite){
            System.out.println(cont);
            cont++;
        }
        
    }
    
}
