package cl.praxis.Desafio4;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        // Directorio de trabajo
        File directorio = new File("src/cl/praxis/Desafio4/Directorio");
        // Validador de error.
        try
        {
            if(directorio.exists())
            {
                System.out.println("El directorio existe");
            }else{
                System.out.println("El directorio no existe, creando directorio...");
                directorio.mkdir();
            }
        }catch(Exception e){
            System.out.println("Error al crear el directorio");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del fichero");
        String ingresarNombreArchivo = sc.nextLine();

        System.out.println("Ingrese palabra a buscar en listado");
        String ingresarBusqueda = sc.nextLine();

        // LLama metodo crearArchivo
        crearArchivo(directorio, ingresarNombreArchivo);

        // LLama metodo buscarTexto
        buscarTexto(ingresarNombreArchivo, ingresarBusqueda);
    }

    public static void crearArchivo(File directorio, String fichero){
        // Validamos si el nombre contiene la extension txt
        if(!fichero.endsWith(".txt")){
            fichero = fichero + ".txt";
        }
        // Buscamos si existe el fichero
        File archivo = new File(directorio + "/" + fichero);
        if(archivo.exists()){
            System.out.println("El fichero ya existe");
        }else{
            System.out.println("El fichero ingresado no existe");
            try {
                // Creamos el archivo si no existe
                if (archivo.createNewFile()) {
                    System.out.println("Archivo creado: " + fichero);
                } else {
                    System.out.println("No se pudo crear el archivo");
                }
            } catch (IOException e) {
                System.out.println("Error al crear el archivo: " + e.getMessage());
            }
        }
        // Creamos el ArrayList con los datos a escribir en el archivo
        ArrayList<String> lista = new ArrayList<>();
            lista.add("Perro");
            lista.add("Gato");
            lista.add("Juan");
            lista.add("Daniel");
            lista.add("Juan");
            lista.add("Gato");
            lista.add("Perro");
            lista.add("Camila");
            lista.add("Daniel");
            lista.add("Camila");

        System.out.println("Lista" + lista);

        // Escribimos en el archivo, validando cualquier error que podria pasar.
        try{
            FileWriter escribirArchivo = new FileWriter(new File(directorio, fichero));
            for (String texto : lista) {
                escribirArchivo.write(texto + "\n");
            }
            System.out.println("Archivo creado: " + fichero);
            escribirArchivo.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo");
        }
    }

    public static void buscarTexto(String nombreFichero, String texto){
        // Validamos si el nombre contiene la extension txt
        if(!nombreFichero.endsWith(".txt")){
            nombreFichero = nombreFichero + ".txt";
        }
        File archivo = new File("src/cl/praxis/Desafio4/Directorio/" + nombreFichero);
        System.out.println("----------------------------------");
        System.out.println("Proceso buscar palabra:");

        if(archivo.exists()){
           // System.out.println("El archivo existe");
            try{
                FileReader leerArchivo = new FileReader(archivo);
                BufferedReader bArchivo = new BufferedReader(leerArchivo);

                int contador = 0;
                String linea;
                while ((linea = bArchivo.readLine()) != null) {
                    if (linea.equals(texto)) {
                        contador++;
                    }
                }
                leerArchivo.close();
                bArchivo.close();
                System.out.println("La palabra " + texto + " se repite " + contador + " veces.");
            } catch (IOException e) {
                System.out.println("Error al leer el archivo");
            }
        }else{
            System.out.println("El archivo ingresado no existe");
        }
    }
}
