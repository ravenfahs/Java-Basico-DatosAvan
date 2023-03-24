/*
 * Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
 * Recorre ambos mostrando únicamente el valor de cada elemento.
 * */

import java.util.LinkedList;

public class P5_LinkedList {

    public static void main(String[] args) {
        String [] meses = {"Enero", "Febrero", "Marzo", "Abril"};

        LinkedList<String> lista = new LinkedList<String>();

        System.out.println("Meses del año almacenados en un array");
        for (String mese : meses) {
            System.out.println(mese);
            lista.add(mese);
        }
        System.out.println("Los meses de año en una LinkedList...: "+lista);
    }
}
