
package ejerciciomaraton;

import java.util.Scanner;


public class EjercicioMaraton {

    public static void main(String[] args) {
        
        //Pasos a seguir
        //1. Pedir los datos a las personas: dni, nombre, edad
        //2. Determinar a que categoria se tienen que inscribir
        //3. Informarle a la persona
        //4. No sabemos la cantidad de personas
        
        System.out.println("Ingrese el dni de las persona");
        Scanner teclado = new Scanner(System.in);
        String dni = teclado.nextLine();
        
        System.out.println("Ingrese el nombre de la persona");
        String nombre = teclado.nextLine();
        
        System.out.println("Ingrese la edad de la persona");
        Scanner teclado2 = new Scanner(System.in);
        int edad = teclado2.nextInt();
        
        while(!dni.equals("0") && !nombre.equalsIgnoreCase("fin")){
            if(edad >=6 && edad<= 10){
                System.out.println("Perteneces a la categoria: Menores A");
            } else if(edad >= 11 && edad <= 17) {
                System.out.println("Perteneces a la categoria: Menores B");
            } else if(edad >= 18 && edad <= 30){
                System.out.println("Perteneces a la categoria: Juveniles");
            } else if(edad >= 31 && edad <= 50){
                System.out.println("Perteneces a la categoria: Adultos");
            } else if(edad >= 50){
                System.out.println("Perteneces a la categoria: Adultos mayores");
            } else{
                System.out.println("No pertences a ninguna categoria");
            }
          
            
        System.out.println("");
        System.out.println("------------------------");
        System.out.println("");
            
        System.out.println("Ingrese el dni de las persona");
        dni = teclado.nextLine();
        
        System.out.println("Ingrese el nombre de la persona");
        nombre = teclado.nextLine();
        
        System.out.println("Ingrese la edad de la persona");
        edad = teclado2.nextInt();
        
        }
        
    }
  
}
