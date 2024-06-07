package ejerciciosOpcionales.ejercicioOpcional4;
import java.util.Scanner;
import java.util.ArrayList;

public class dinamico {

    public static void main(String[] args){
        ArrayList<String> elementos = new ArrayList<String>();
        elementos.add("mesa");
        elementos.add("Refrigerador");
        elementos.add("Cocina");
        elementos.add("lavadora");
        System.out.println("Elementos " + elementos);

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese nuevo elemento");
        String elementoIngresado = sc.nextLine();

        AgregarElemento(elementos, elementoIngresado);
    }

    public static void AgregarElemento(ArrayList<String> elementos, String elemento){
        if(elementos.contains(elemento)){
            System.out.println("El elemento ya existe");
        }else{
            elementos.add(elemento);
            System.out.println("El elemento se ha agregado");
            System.out.println("Elementos " + elementos);
        }

    }
}


