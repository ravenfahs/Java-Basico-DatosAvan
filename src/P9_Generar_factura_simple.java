import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;

/*Sorpréndenos creando un programa de tu elección que utilice
 * InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
 *
	1. Entrada de datos.
	2. Guardar datos en archivo txt.
	3. leer datos desde fichero
	4. Establecer un HasMap con los datos de la factura.
		Fecha:
		Nombre:
		Ruta:
		Detalle:
 *
 * */
public class P9_Generar_factura_simple {
    public static void main(String[] args) {
        // Se toma la fecha actual del sistema.
        String fecha = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(Calendar.getInstance().getTime());
        //Datos personales
        String nombre ="";
        float dinero =0;
        String concepto ="";
        //Rótulos de la factura demo
        String encabezado = "***GENERAR RECIBO DE PAGO***";
        String formatoFecha = "Fecha de elaboracion de factura";
        String registrarNombre= "Recibo a nombre de:";
        String valor = "La suma de (M/c):";
        String detalle = "Por concepto de:";
        String factura="";
        //Ruta del archivo a generar
        String ruta= "/home/fabian/java_intelli/Java-basico-DatosAva/factura";
        //Diálogos de Exception capturas y escritura de datos
        String e1_cap_datos = "Ooopss, No se puede capturar los datos por teclado...";
        String e2_esc_datos = "Ooopss, No se puede escribir el archivo...";
        String e3_lec_datos = "Ooopss, No se puede leer el fichero o no existe...";
        String e4_lec_datos = "Ooopss, Si el dinero a registrar tiene decimales, por favor utilizar el punto(.) ejemplo 5000.99, Vuelve a intentarlo ";

        capturaDeDatos(fecha,nombre,dinero,concepto,encabezado,formatoFecha,registrarNombre,valor,
                detalle,factura,ruta,e1_cap_datos,e2_esc_datos,e4_lec_datos);
        lecturaDeFactura(ruta,e3_lec_datos);
    }
    //se crea captura los datos a guardar en la factura
    private static void capturaDeDatos(String fecha, String nombre, float dinero,String concepto,
                                       String encabezado,String formatoFecha,String registrarNombre,
                                       String valor, String detalle, String factura, String ruta, String e1_cap_datos,
                                       String e2_esc_datos,  String e4_lec_datos ){

        try {
            HashMap<String,String> hashMap = new HashMap<>();
            BufferedReader entradaEstandar = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(encabezado);
            System.out.println(formatoFecha);
            System.out.println(fecha);
            System.out.println(registrarNombre);
            nombre = entradaEstandar.readLine();
            hashMap.put("Nombre ",nombre);
            boolean bandera;
            do {
                try {
                    bandera = false;
                    System.out.println(valor);
                    dinero = Float.parseFloat(entradaEstandar.readLine());
                    System.out.println(detalle);
                }catch (Exception e){
                    System.out.println(e4_lec_datos);
                    bandera = true;
                }
            }while (bandera);
            concepto = entradaEstandar.readLine();
            hashMap.put("Detalle ",concepto);
            hashMap.put("Ruta ",ruta);
            factura=(encabezado + "\n"+ formatoFecha + " " + fecha+"\n"+
                    registrarNombre + " " +nombre+ "\n"+
                    valor+ " "+ dinero+ " Us"+"\n"+
                    detalle+ " "+ concepto+"\n"+
                    "Datos del tipo de datos HasMap: \n"+hashMap);
        }catch (Exception e){
            System.out.println(e1_cap_datos+e);
        }
        escribirArchivo(factura,ruta,e2_esc_datos);
    }
    //Se re-escribe el archivo factura en su ruta
    private static void escribirArchivo(String factura,String ruta, String e2_esc_datos){
        try {
            PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter(ruta)));
            salida.write(factura);
            salida.close();
        }catch (IOException e){
            System.out.println(e2_esc_datos);
        }
    }
    //Se muestra el archivo creado
    private static void lecturaDeFactura(String ruta, String e3_lec_datos){
        try {
            InputStream entrada = new FileInputStream(ruta);
            byte [] datos = entrada.readAllBytes();
            for (byte dato:datos) {
                System.out.print((char) dato);
            }
            entrada.close();
        }catch (Exception e){
            System.out.println(e3_lec_datos + e);
        }
    }
}
