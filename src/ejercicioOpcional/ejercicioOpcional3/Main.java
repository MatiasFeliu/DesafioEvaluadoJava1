package ejercicioOpcional.ejercicioOpcional3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
/*
        //Cambio de while a do_while
        int i = 0;
        int j = 0;

        do{
            j+=1;
            System.out.printf("Iteración %d\n", j);
        }while(j<3);


        while (i<3) {
            i+=1;
            System.out.printf("Iteración %d\n", i);
        }

/////////////////////////////////////////////////////////////////////////////////////////////

       //Mostrar Pares parte1
        System.out.println("Este programa muestra los numeros pares de un numero ingresado");
        System.out.println("ingrese numero");
        int num;
        int cont = 0;
        int cont2 = 0;
        num = sc.nextInt();

        while(cont<=num){

             if(cont%2 == 0){
                 System.out.println(cont);
             }

            cont++;

        }

        System.out.println("------------------- \n");

        //Parte 2
        while(cont2<=num){

            if(cont2%2 == 0 && cont2!=0){
                System.out.println(cont2);
            }

            cont2++;
        }

/////////////////////////////////////////////////////////////////////////////////////////////
        //Sumar impares parte 1
        int numero;
        int resultado = 0;
        System.out.println("Ingrese valor");
        numero = sc.nextInt();

        for(int k=0; k<=numero; k++){
            if(i%2!=0){
                resultado = resultado + k;
            }
        }

        System.out.println("El resultado es: "+resultado);
        System.out.println("------------------- \n");

        //Parte2
        int numero2;
        int numero3;
        int resultado2= 0;
        System.out.println("Ingrese limite superior (hasta)");
        numero2 = sc.nextInt();
        System.out.println("Ingrese limite inferior (desde)");
        numero3 = sc.nextInt();

        for(int l=numero3; l<=numero2; l++){
            System.out.println(i);
            if(i%2!=0){
                resultado2 = resultado2 + l;
            }
        }
        System.out.println("El resultado es: "+resultado2);
*/
/////////////////////////////////////////////////////////////////////////////////////////////
        //Secuencia Fibonacci

        int contador = 0;
        //hasta donde quieren calcular
        int cantidad;
        //calcular la secuencia
        int anterior = 0;
        int actual = 1;
        int ghost;

        System.out.println("ingrese la cantidad de elementos de la sec de fibonacci desea mostrar");
        cantidad = sc.nextInt();

        do{

            if(contador == 0){
                System.out.println(anterior);
            }

            System.out.println(actual);

            ghost = actual;
            actual = actual + anterior;
            anterior = ghost;
            contador++;

        }while(contador <= cantidad);
    }
}
