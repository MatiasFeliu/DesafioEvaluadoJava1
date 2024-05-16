package ejerciciosOpcionales.ejercicioD23;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        //Creacion de minibus
        MiniBus minibus1 = new MiniBus("blanco","pu2040",12,8,"60 minutos");
        //llamado imprimeBus
        minibus1.imprimeBus();
        //llamado asientosDisponibles
        System.out.println("asientos disponibles: "+minibus1.asientosDisponibles());

        //creacion del objeto taxi
        Taxi taxi1 = new Taxi("Amarillo","xx4455",2500);
        System.out.println("pagar pasaje, ingrese monto");
        int monto = sc.nextInt();
        //llamado a metodo pagar pasaje de objeto Taxi
        System.out.println("Tu Vuelto es de: "+ taxi1.pagarPasaje(monto));
    }
}
