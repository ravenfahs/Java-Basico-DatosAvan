/*
 * Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
 * Este ejercio captura una cadea de texto por teclado y devuele una cadena escrita pero la revez,
 * muesteas las dos cadenas la de entrada y la de salida, no importa la longitud de la cadena
 * */

import java.util.Scanner;

public class P1_cadenaOrdenadaAlReves {
    public static void main(String[] args) {
        //Captura de datos por teclado
        try (Scanner lectura = new Scanner(System.in)){
            //Se puede escribir "Hola mundo y el resultado será "odnum aloH"."
            System.out.println("Ingresar cadena a modificar: ");
            String cadena = lectura.nextLine();
            StringBuilder reverso = new StringBuilder();
            //Se recorre la cade desde el final hasta el inicio - se ordena la cadena al revés
            for(int i = cadena.length()-1; i>=0; i -= 1){
                reverso.append(String.valueOf(cadena.charAt(i)));
            }
            System.out.println("Texto original de entrada: "+"\n"+ cadena + "\n"+ "Texto escrito al revés "+"\n"+reverso);
        }
    }
}
