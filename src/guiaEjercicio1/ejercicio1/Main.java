package guiaEjercicio1.ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        //Calculadora
        int num1;
        int num2;
        int resultado = 0;
        String opcion;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Ingrese el primer numero");
            num1 = sc.nextInt();
            System.out.println("Ingrese el segundo numero");
            num2 = sc.nextInt();
            sc.nextLine();

            System.out.println("para sumar ingrese la letra s");
            System.out.println("para restar ingrese la letra r");
            System.out.println("para multiplicar ingrese la letra m");
            System.out.println("para dividir ingrese la letra d");
            System.out.println("para salir de la calculadora ingrese la letra x ");
            opcion = sc.nextLine();

            //calcula segun opcion
            switch(opcion){
                case "s": resultado = num1 + num2;
                break;
                case "r": resultado = num1 -num2;
                break;
                case "m": resultado = num1*num2;
                break;
                case "d": if(num2 == 0) {
                            System.out.println("el numero 2 no puede ser 0");
                            break;
                        }else {
                    resultado = num1 / num2;
                    break;
                }
                default:
                    System.out.println("opcion no valida");
            }

            //imprime resultado
            System.out.println("el resultado es: " + resultado);

        }while(!opcion.equals("x"));

        System.out.println("salimos");

    }
}



