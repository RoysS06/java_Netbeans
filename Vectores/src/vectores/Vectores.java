
package vectores;

import java.util.Scanner;


public class Vectores {

    public static void main(String[] args) {
        
        
        //Declaración
        int vector[] = new int [4];
        
//        //Asignación
//        vector [0] = 2;
//        vector [1] = 55;
//        vector [2] = 128;
//        vector [3] = 3589;

        //Asignación via teclado del usuario:
        
        Scanner teclado = new Scanner (System.in);
        
        for(int i = 0; i<vector.length; i++){

            System.out.println("Ingresa el numero:" + i);
            vector[i] = teclado.nextInt();
        }
        
        for(int i=0 ; i<vector.length; i++){
            System.out.println("Estoy en el indice:" + i);
            System.out.println("Tengo guardado un:" + vector[i]);
        }

    }
    
    
}
