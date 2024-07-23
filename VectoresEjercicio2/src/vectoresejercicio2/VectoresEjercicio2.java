
package vectoresejercicio2;


public class VectoresEjercicio2 {


    public static void main(String[] args) {
        
        String vector[] = new String [8];
        
        vector[0] = "Roy";
        vector[1] = "Diana";
        vector[2] = "Ian";
        vector[3] = "Edu";
        vector[4] = "Silvia";
        vector[5] = "Marco";
        vector[6] = "Thomas";
        vector[7] = "Cintia";
        
        for(int i = 0 ; i<vector.length ; i++){
            System.out.println("El numero de vector es: " + i + " y su nombre es: " + vector[i]);
        }


    }
    
}
