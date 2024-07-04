
package vectoresejercicio;

import java.util.Scanner;


public class VectoresEjercicio {
    
    public static void main(String[] args) {
        
        int num [] = new int[15];
        Scanner teclado = new Scanner (System.in);
        
        for(int i=0; i<15; i++){
            System.out.println("Ingresa un numero para el vector: " + i);
            num[i] = teclado.nextInt();
        }
        
        
        int cont = 0;
        
        for(int i=0; i<15; i++){
            
            if(num[i] ==3){
                cont = cont+1;
            }
        }
        
        System.out.println("La cantidad de numeros 3 es de: " + cont);
    }
    
}
