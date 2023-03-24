import java.util.Vector;

/**
 *Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
 */


public class P4_Vector2 {
    public static void main(String[] args) {
        Vector<String> diasSemana = new Vector<String>(5);

        //agregar días de la semana
        diasSemana.add("Lunes");
        diasSemana.add("Martes");
        diasSemana.add("Miércoles");
        diasSemana.add("Jueves");
        diasSemana.add("Viernes");

        //Mostrar los días de la semana
        System.out.println("Días de la semana: "+ diasSemana);

        //Eliminar datos los elementos en las posiciones segundo y tercero del anterior vector
        diasSemana.remove(1);
        diasSemana.remove(1);

        //vector resultante
        System.out.println("Vector resultante, se eliminaron los días Martes y Miércoles: "+diasSemana);
    }
}
