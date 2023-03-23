/*Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
 */

public class P2_ArrayBidimensional {
    public static void main(String[] args) {
        int[][] num ={{8,9,15,1,5},{2,5,8,4,2}};
        int f= num.length;
        int c= num[0].length;

        System.out.println("filas"+f);
        System.out.println("Columnas"+c);
        for (int i = 0; i<f; i++) {
            for (int j = 0; j <c ; j++) {
                System.out.println("Posición en la matriz ["+i+j+"] y su valor es de : "+num[i][j]);
            }
        }
    }
}
