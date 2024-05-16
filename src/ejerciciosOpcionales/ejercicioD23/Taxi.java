package ejerciciosOpcionales.ejercicioD23;

public class Taxi extends Vehiculo {
    private int valorPasaje;

    public Taxi (){

    }

    public Taxi(String color,String patente, int valorPasaje){
        super (color, patente);
        this.valorPasaje = valorPasaje;
    }


    public int getValorPasaje(){
        return valorPasaje;
    }
    public void valorPasaje(int valorPasaje){
        this.valorPasaje = valorPasaje;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "valorPasaje=" + valorPasaje +
                '}';
    }
}
