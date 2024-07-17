
package matrices;


public class Matrices {


    public static void main(String[] args) {
        
        int matriz [] [] = new int [3] [3];
        
        matriz [0] [0] = 12;
        matriz [0] [1] = 20;
        matriz [0] [2] = 58;
        matriz [1] [0] = 741;
        matriz [1] [1] = 857;
        matriz [1] [2] = 25;
        matriz [2] [0] = 69;
        matriz [2] [1] = 81;
        matriz [2] [2] = 6;
        
        for(int f = 0; f<3; f++){
            for(int c = 0; c<3; c++){
                System.out.println("El valor de la posición f: " + f + " c: " + c);
                System.out.println("es de: " + matriz[f][c]);
            }
        }

    }
    
}
