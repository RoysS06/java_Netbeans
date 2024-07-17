
package ejerciciocondicionales;

import java.util.Scanner;


public class EjercicioCondicionales {

    public static void main(String[] args) {

        double sueldo = 0;
        int categoria;
        
        System.out.println("Ingrese la categoría que desee calcular");
        Scanner teclado = new Scanner(System.in);
        categoria = teclado.nextInt();
        
        if(categoria == 1){
            sueldo = 1250 + (1250 * 0.10);     
        } else if (categoria == 2){
            sueldo = 2000.51;
        } else if (categoria == 3){
            sueldo = 3554 - (3554 * 0.11);
        } else{
            System.out.println("Debe ingresar una categoria valida");
        }
        
        if(categoria == 1 || categoria == 2 || categoria == 3){
            System.out.println("El sueldo de la categoria: " + categoria + " es de: " + sueldo + " nuevos soles");
        }
        
    }
    
}
