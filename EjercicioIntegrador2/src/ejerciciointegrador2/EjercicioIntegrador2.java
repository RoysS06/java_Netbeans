package ejerciciointegrador2;

import java.util.Scanner;

public class EjercicioIntegrador2 {

    public static void main(String[] args) {

        //DECLACIÓN DE VARIABLES
        char asientos[][] = new char[10][10];
        boolean bandera = false;
        Scanner teclado = new Scanner(System.in);
        int asiento = 0;
        int fila = 0;
        String respuesta;
        String verMapa;

        //CARGAMOS LA MATRIZ DE ASIENTOS
        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                asientos[f][c] = 'L';
            }
        }

        //BIENVENIDO AL SISTEMA
        System.out.println("----------BIENVENIDO AL SISTEMA DE RESERVAS----------");

        //RESERVA DE ASIENTOS
        while (bandera != true) {

            //VISUALIZACIÓN DE MAPAS
            System.out.println("¿Desea ver los asientos disponible? S: si. N: no");
            verMapa = teclado.next();
            if (verMapa.equalsIgnoreCase("S")) {
                dibujarMapa(asientos);
            }

            //RESERVA
            boolean estaOk = false;
            while (estaOk != true) {
                System.out.println("");
                System.out.println("Ingrese la FILA y ASIENTO a reservar:");
                System.out.println("");
                System.out.print("Fila(entre 0 y 9:)");
                fila = teclado.nextInt();
                System.out.print("Asiento(entre 0 y 9:)");
                asiento = teclado.nextInt();

                if (fila <= 9 && fila >= 0) {
                    if (asiento <= 9 && asiento >= 0) {
                        estaOk = true;
                    } else {
                        System.out.println("El numero de asiento no es valido");
                    }
                } else {
                    System.out.println("El numero de fila no es valido");
                }
            }

            if (asientos[fila][asiento] == 'L') {
                asientos[fila][asiento] = 'X';
                System.out.println("El asiento fue reservado correctamente");
            } else {
                System.out.println("El asiento está ocupado. Por favor, elija otro ");
            }

            System.out.println("¿Desea finalizar la reserva? S: si. N: no");
            respuesta = teclado.next();

            if (respuesta.equalsIgnoreCase("S")) {
                bandera = true;
            }
        }

    }

    static void dibujarMapa(char asientos[][]) {
        for (int f = 0; f < 10; f++) {
            System.out.print(f);
            for (int c = 0; c < 10; c++) {
                System.out.print("[" + asientos[f][c] + "]");
            }
            System.out.println("");
        }

    }

}
