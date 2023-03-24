import java.util.Scanner;

/*Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a
 * su llamante del tipo ArithmeticException que será capturada por su llamante
 * (desde "main", por ejemplo).
 * Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
 * Finalmente, mostraremos en cualquier caso: "Demo de código".

 * */
public class P7_DivisionPorCero {
    public static void main(String[] args) {

        //Lectura de datos numerador y denominador
        Scanner num = new Scanner(System.in);
        System.out.println("Ingrese el numerador ");
        int a = num.nextInt();

        System.out.println("Ingrese el numerador ");
        int b = num.nextInt();

        //Sentencia para capturar el error de división por cero y llamando a la función divisionPorCero si no la puede realizar genera y muestra el error
        try {
            divisionPorCero(a,b);
        } catch (ArithmeticException e){
            System.out.println("No es posible hacer la división por cero " + e);
        }
    }
    //función para realizar la operación de la división
    private static void divisionPorCero(int a , int b) throws ArithmeticException{
        int respuesta = a/b;
        System.out.println("La respuesta es: "+respuesta);
    }
}
