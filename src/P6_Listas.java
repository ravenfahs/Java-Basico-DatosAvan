import java.util.ArrayList;

/*
 * Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle,
 * recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final.
 * Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
 * */
public class P6_Listas {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i <=10 ; i++) {
            lista.add(i);
        }
        System.out.println("Lista generada del 1 al 10, se guarda en ArrayList ..." +lista);

        for (int i = 0; i <lista.size() ; i++) {
            if (Math.floorMod(lista.get(i),2)==0) {
                lista.remove(i);
            }
        }
        System.out.println("Nueva lista donde se eliminan los números pares..: "+ lista);
    }
}
