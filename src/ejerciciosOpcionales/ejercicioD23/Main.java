package ejerciciosOpcionales.ejercicioD23;

import java.util.ArrayList;
import java.util.List;
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

        //Creacion del objeto taxi
        Taxi taxi1 = new Taxi("Amarillo","xx4455",2500);
        System.out.println("pagar pasaje, ingrese monto");
        int monto = sc.nextInt();
        //llamado a metodo pagar pasaje de objeto Taxi
        System.out.println("Tu Vuelto es de: "+ taxi1.pagarPasaje(monto));

        //Crear lista cliente
        List<Cliente> clientes = new ArrayList<Cliente>();
        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

        vehiculos.add(new Taxi("Amarillo","xx4455",2500));
        vehiculos.add(new Taxi("Amarillo","xx4563",2500));
        vehiculos.add(new Taxi("Amarillo","xx7852",2500));
        vehiculos.add(new Taxi("Amarillo","xx8754",2500));
        vehiculos.add(new MiniBus("blanco","xx5412",12,8,"60 minutos"));
        vehiculos.add(new MiniBus("rojo","xx8563",10,8,"60 minutos"));
        System.out.println(vehiculos);

    }
}
