package guiaEjercicio2.ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        float numero = 0f;
        float resultado = 0;
        String ingreso = null;
        int ascii = 0;
        int contador = 0;
        Scanner sc = new Scanner(System.in); //Se crea objeto Scanner

        do {

        if ((contador % 2) == 0) {
            System.out.println("Ingrese un número: ");
        } else {
            System.out.println("Ingrese un operador (+, -, *, /, =): ");
            contador++;
        }
        //Se lee por pantalla el ingreso del usuario, operador o número
        ingreso = sc.next();
        // Códigos ascii para operadores * + --> 43, * - --> 45, * = --> 61 */
        ascii = (int) ingreso.charAt(0);
        System.out.println(ascii);
        /* Si el programa inicio, es decir el contador está en cero y el usuario
         * no ingreso un operador (+, -, =) */
        if (contador == 0 && ascii != 43 && ascii != 45 && ascii != 42 && ascii != 47 && ascii != 61 ) {
            numero = Float.parseFloat(ingreso); //Se asigna a resultado el primer numero ingresado
            System.out.println(numero);
            resultado = numero;
            contador++;
            // continúa en la página siguiente
        } else { // De lo contrario, es el segundo ingreso de usuario
            //Suma
            if (ascii == 43) {
                resultado = suma(ingreso,numero,resultado);
                contador++;
            }
            //Resta
            if (ascii == 45) {
                resultado = resta(ingreso,numero,resultado);
                contador++;
            }
            //multiplicar
            if(ascii == 42){
                System.out.println("bandera 1");
                resultado = multiplicar(ingreso,numero,resultado);
                contador++;
            }
            //dividir
            if(ascii == 47){
                resultado = dividir(ingreso,numero,resultado);
                contador++;
            }
        }
        }while((int)ingreso.charAt(0) != 61);

        System.out.printf("El Resultado es: %f", resultado);
    }

    public static float suma(String ingreso, float numero, float resultado){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        ingreso = sc.next(); //Debiese ser un número o si no error
        numero = Float.parseFloat(ingreso);
        return resultado = resultado + numero;
    }

    public static float resta(String ingreso, float numero, float resultado){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        ingreso = sc.next(); //Debiese ser un número o si no error
        numero = Float.parseFloat(ingreso);
        return resultado = resultado - numero;
    }

    public static float multiplicar(String ingreso, float numero, float resultado){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        ingreso = sc.next(); //Debiese ser un número o si no error
        numero = Float.parseFloat(ingreso);
        return resultado = resultado * numero;
    }

    public static float dividir(String ingreso, float numero, float resultado){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        ingreso = sc.next(); //Debiese ser un número o si no error
        numero = Float.parseFloat(ingreso);
        return resultado = resultado / numero;
    }

}
