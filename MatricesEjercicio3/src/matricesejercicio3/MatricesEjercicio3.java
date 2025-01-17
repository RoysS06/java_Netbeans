package matricesejercicio3;

import java.util.Scanner;

public class MatricesEjercicio3 {

    public static void main(String[] args) {

        //creamos la matriz
        int vuelos[][] = new int[4][3];

        //cargamos la matriz
        Scanner teclado = new Scanner(System.in);

        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese la cantidad de asientos para el destino: " + f + " horario: " + c);
                vuelos[f][c] = teclado.nextInt();
            }
        }

        //venta de asientos:
        Scanner teclado2 = new Scanner(System.in);
        String bandera = "";
        int destino;
        int horario;
        int asientos;

        while (!bandera.equalsIgnoreCase("finish")) {
            System.out.println("Ingrese el N° de destino");
            destino = teclado.nextInt();
            System.out.println("Ingrese el horario de vuelo ");
            horario = teclado.nextInt();
            System.out.println("Ingrese la cantidad de asientos");
            asientos = teclado.nextInt();

            if (destino >= 0 && destino <= 4) {
                if (horario >= 0 && horario <= 2) {
                    if (vuelos[destino][horario] >= asientos) {
                        System.out.println("Su reserva fue realizada con exito");
                        vuelos[destino][horario] = vuelos[destino][horario] - asientos;
                    } else {
                        System.out.println("No hay asientos disponibles");
                    }
                } else {
                    System.out.println("Horario no existente: ingrese un N° entre el 0 y 2");
                }
            } else {
                System.out.println("Destino no existente, ingrese un N° entre el 0 y 3");
            }

            System.out.println("¿Desea continuar?. Ingrese finish para culminar, u otro valor para seguir");
            bandera = teclado2.next();

        }
    }

}
