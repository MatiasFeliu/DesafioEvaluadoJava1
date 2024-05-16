package ejerciciosOpcionales.ejercicioD23;

public class MiniBus extends Bus{
    private String tiempoViaje;

   public MiniBus(String color, String patente, int cantidadDeAsientos, int asientosDisponibles , String tiempoViaje){
       super(color,patente,cantidadDeAsientos,asientosDisponibles);
       this.tiempoViaje = tiempoViaje;
   }

    public String getTiempoViaje() {
        return tiempoViaje;
    }

    public void setTiempoViaje(String tiempoViaje) {
        this.tiempoViaje = tiempoViaje;
    }

    @Override
    public String toString() {
        return "MiniBus{" +
                "tiempoViaje='" + tiempoViaje + '\'' +
                "} " + super.toString();
    }
}
