
package ejerciciocentinela;

import java.util.Scanner;

public class EjercicioCentinela {


    public static void main(String[] args) {

        System.out.println("Ingresa tu palabra");
        Scanner teclado = new Scanner(System.in);
        String palabra = teclado.next();
        
        while(!palabra.equalsIgnoreCase("salir")){
            System.out.println("tu palabra es:" + palabra);
            System.out.println("Ingresa tu palabra");
            palabra = teclado.next();

        }
    }
    
}
