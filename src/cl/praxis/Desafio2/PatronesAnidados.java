package cl.praxis.Desafio2;

import java.util.Scanner;

public class PatronesAnidados {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero");
        int numero = sc.nextInt();


    ////////Parte 1//////
        //patron 1
        for(int i=0; i<=numero; i++ ){
            if(i%2==0){
                System.out.print("*");
            }else{
                System.out.print(".");
            }
        }

        System.out.println();
        //patron 2
        for(int j = 1; j<=numero; j++){
            if(j%4 == 0){
                System.out.print(4);
            }else{
                System.out.print(j%4);
            }
        }

        System.out.println();
        //patron3
        for(int i=0; i<=numero; i++ ){
            if(i%2==0){
                System.out.print("||");
            }else{
                System.out.print("*");
            }
        }

        System.out.println();
    ////////Parte 2//////
        //patron 1
         for(int i=1; i<=numero;i++){
        for(int j=1; j<=numero;j++)  {
            if(i == 1 || i == numero ){
                System.out.print("*");
            }else if(j==1 || j == numero){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }

        //patron 2
        for(int i=0; i<=numero;i++) {
            for (int j = 1; j <= numero; j++) {
                if(i == 0 || i == numero -1){
                    System.out.print("*");
                }else if(i + j == numero){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //patron 3
        for(int i=1; i<=numero;i++) {
            for (int j = 1; j <= numero; j++) {
                if(i == j || i+j == numero +1){
                    System.out.print("x");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //patron 4
        for(int i=1; i<=numero;i++) {
            for (int j = 1; j <= numero; j++) {
             if((i!=numero && j==numero) || (i!=1 && j==1)){
                 System.out.print(" ");
             }else{
                 System.out.print("*");
             }
            }
            System.out.println();
        }
    }
}

