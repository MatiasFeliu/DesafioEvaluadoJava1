package guiaEjercicio2.ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        //Se declaran las variables a utilizar
        //El número que ingrese el usuario debe ser float
        float numero = 0f;
        float resultado = 0;
        //Variable tipo String, ya que puede ser un operador o un número
        String ingreso = null;
        //Variable que guardará el código ascii de cada ingreso del usuario
        int ascii = 0;
        /* Se crea variable contador, para identificar si es el primer ingreso
         * de usuario,el cual debe ser un número, y luego un operador, número
         * así sucesivamente. Si contador es cero es inicio y debe ser un
         * número. Si es impar, debe ser un operador +, -, = */
        int contador = 0;
        Scanner sc = new Scanner(System.in); //Se crea objeto Scanner
        do {
        if ((contador % 2) == 0) {
            System.out.println("Ingrese un número: ");
        } else {
            System.out.println("Ingrese un operador (+, -, =): ");
            contador++;
        }
        //Se lee por pantalla el ingreso del usuario, operador o número
        ingreso = sc.next();
        // Códigos ascii para operadores * + --> 43, * - --> 45, * = --> 61 */
        ascii = (int) ingreso.charAt(0);
        /* Si el programa inicio, es decir el contador está en cero y el usuario
         * no ingreso un operador (+, -, =) */
        if (contador == 0 && ascii != 43 && ascii != 45 && ascii != 61) {
            /* Se hace un cast de ingreso (String) a float. Todas las clases tienen un parse,
            Integer.parseInteger, * Double.parseDouble * etc. Se hace de esta manera, porque un String no se
            puede transformar en un número, sin embargo si el String no es un número, el programa dará un
            error. */
            numero = Float.parseFloat(ingreso); //Se asigna a resultado el primer numero ingresado
            resultado = numero;
            contador++;
            // continúa en la página siguiente
        } else { // De lo contrario, es el segundo ingreso de usuario
            //Suma
            if (ascii == 43) {
                System.out.println("Ingrese un número: ");
                ingreso = sc.next(); //Debiese ser un número o si no error
                numero = Float.parseFloat(ingreso);
                resultado = resultado + numero;
                contador++;
            }
            //Resta
            if (ascii == 45) {
                System.out.println("Ingrese un número: ");
                ingreso = sc.next(); //Debiese ser un número o si no error
                numero = Float.parseFloat(ingreso);
                resultado = resultado - numero;
                contador++;
            }
        }
    }while((int)ingreso.charAt(0) != 61);

    System.out.printf("El Resultado es: %f", resultado);

    }

}
