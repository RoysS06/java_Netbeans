
package vectoresejercicio3;

import java.util.Scanner;


public class VectoresEjercicio3 {


    public static void main(String[] args) {
        
        //Creamos los vectores
        String ciudades[] = new String [4];
        Double minimas [] = new Double [4];
        Double maximas [] = new Double [4];
        
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        
        //Cargamos los vectores
        for(int i = 0 ; i<ciudades.length; i++){
            System.out.println("Ingrese el nombre de la ciudad " + i);
            ciudades[i] = teclado.next();
            
            System.out.println("Ingrese la temperatura minima de la ciudad: " + i);
            minimas[i] = teclado.nextDouble();
            
            System.out.println("Ingrese la temperatura maxima de la ciudad " + i);
            maximas[i] = teclado.nextDouble();
        }
        
        //determinamos la minima
        
        Double minima = 999999999.00;
        int posMin = -1;
        
        for(int i = 0; i<minimas.length; i++){
            if(minimas[i]<minima){
                minima = minimas[i];
                posMin = i;
            }
        }
        
        //determinamos la maxima
        Double maxima = -9999999999.00;
        int posMax = -1;
        
        for(int i = 0 ; i<maximas.length; i++){
            if(maximas[i] > maxima){
                maxima = maximas [i];
                posMax=i;
            }
        }
        
        
        //Mostramos por pantalla

        System.out.println("La temperatura minima registrada es de: " + minima);
        System.out.println("Se registro en la ciudad de: " + ciudades[posMin]);
        System.out.println("La temperatura maxima registrada es de: " + maxima);
        System.out.println("Se registro en la ciudad de: " + ciudades[posMax]);
        
    }
    
}
