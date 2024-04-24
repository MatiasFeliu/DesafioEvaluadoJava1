package ejerciciosGuiados.ejercicioGuiado1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String etiquetas ="<ul>\n";
        int cant;
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("indique la cantidad de list items");
        cant=sc.nextInt();

        while(i<=cant){
            etiquetas+="\t<li> item "+i+"</li>\n";
            i++;
        }
        etiquetas+="</ul>";
        System.out.println(etiquetas);
    }
}
