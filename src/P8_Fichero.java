/*
 * Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros:
 * "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero
 * dado en el parámetro "fileIn" al fichero dado en "fileOut".
 * */

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class P8_Fichero {
    public static void main(String[] args) {
        //Rutas de los ficheros de entrada y de salida
        String fileIn = "/home/fabian/java_intelli/Java-basico-DatosAva/texto_1";
        String fileOut= "/home/fabian/java_intelli/Java-basico-DatosAva/texto_2";

        archivo(fileIn,fileOut);
    }

    static void archivo(final  String fileIn, final  String fileOut){
        try {
            //lectura del fichero de entrada
            InputStream entrada = new FileInputStream(fileIn);
            byte[] datos = entrada.readAllBytes();
            for(byte dato:datos){
                System.out.print((char)dato);
            }
            entrada.close();
            //Escritura del archivo de salida
            PrintStream salida  = new PrintStream(fileOut);
            salida.write(datos);
            salida.close();
        }catch (Exception e){
            System.out.println("Imposible de leer..." +e);
        }
    }
}
