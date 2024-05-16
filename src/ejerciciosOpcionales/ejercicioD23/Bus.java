package ejerciciosOpcionales.ejercicioD23;

public class Bus extends Vehiculo{
    private int cantidadDeAsientos;
    private int asientosDisponibles;

    public Bus(){}
    public Bus(String color, String patente, int cantidadDeAsientos, int asientosDisponibles){
        super(color, patente);
        this.cantidadDeAsientos = cantidadDeAsientos;
        this.asientosDisponibles = asientosDisponibles;
    }

    public int getCantidadDeAsientos() {
        return cantidadDeAsientos;
    }

    public void setCantidadDeAsientos(int cantidadDeAsientos) {
        this.cantidadDeAsientos = cantidadDeAsientos;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void setAsientosDisponibles(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "cantidadDeAsientos=" + cantidadDeAsientos +
                ", asientosDisponibles=" + asientosDisponibles +
                "} " + super.toString();
    }
}
