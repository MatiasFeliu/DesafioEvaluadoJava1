package ejerciciosOpcionales.ejercicioD23;

public class Taxi extends Vehiculo {
    private int valorPasaje;

    public Taxi(String color,String patente, int valorPasaje){
        super (color, patente);
        this.valorPasaje = valorPasaje
    }
}
