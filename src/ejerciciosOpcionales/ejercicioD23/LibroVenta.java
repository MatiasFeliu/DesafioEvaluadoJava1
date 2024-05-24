package ejerciciosOpcionales.ejercicioD23;

public class LibroVenta {
    private String nombreVenta;
    private String fechaVenta;

    public LibroVenta() {

    }

    public LibroVenta(String nombreVenta, String fechaVenta) {
        this.nombreVenta = nombreVenta;
        this.fechaVenta = fechaVenta;

    }

    public String getNombreVenta() {
        return nombreVenta;
    }

    public void setNombreVenta(String nombreVenta) {
        this.nombreVenta = nombreVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    public void guardarVenta(Cliente cliente, Vehiculo vehiculo){
        System.out.println(cliente.getEdad() + vehiculo.getPatente() + this.fechaVenta + this.nombreVenta);

    }

    @Override
    public String toString() {
        return "LibroVenta{" +
                "nombreVenta='" + nombreVenta + '\'' +
                ", fechaVenta='" + fechaVenta + '\'' +
                '}';


    }


}
