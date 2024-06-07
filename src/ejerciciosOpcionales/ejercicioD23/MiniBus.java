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

    public void imprimeBus(){
        System.out.println("color: "+this.getColor());
        System.out.println("patente: "+this.getPatente());
        System.out.println("Cantidad de asientos: "+this.getCantidadDeAsientos());
        System.out.println("Asientos disponibles: "+this.getAsientosDisponibles());
        System.out.println("Tiempo de viaje: "+this.getTiempoViaje());
    }

    @Override
    public String toString() {
        return "MiniBus{" +
                "tiempoViaje='" + tiempoViaje + '\'' +
                "} " + super.toString();
    }
}
