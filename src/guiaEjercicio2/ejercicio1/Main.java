package guiaEjercicio2.ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese numero");
        numero = sc.nextInt();
        for(int i = 1; i<= numero; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
