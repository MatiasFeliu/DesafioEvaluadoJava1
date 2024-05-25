package ejerciciosOpcionales.ejercicioD23;

import java.io.*;
import java.time.LocalDate;

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

    public void guardarVenta(Cliente cliente, Vehiculo vehiculo) {
        LocalDate toDay = LocalDate.now();
        String toDayFormat = toDay.toString();

        //Crear directorio
        File directorio = new File("src/ejerciciosOpcionales/ejercicioD23/" + "ficheros");
        if (!directorio.exists()) {
            if(directorio.mkdirs()){
                System.out.println("directorio creado correctamente");
            }else{
                System.out.println("ocurrio un error al crear el directorio");
            }
        }
        // Definir la cadena que se va a escribir en el archivo
        String ventaInfo = "-------------------------\n" + "Patente: " + vehiculo.getPatente()+ "\n" + "Edad Cliente: "  + cliente.getEdad() + "\n" + "Fecha Venta: " + toDayFormat + "\n" + "Nombre Cliente: " + cliente.getNombre();

        // Nombre del archivo
        String nombreArchivo = directorio + "/ventas.txt";

        // Escritura en el archivo
        try (BufferedWriter archivo = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
            archivo.write(ventaInfo);
            archivo.newLine();
            System.out.println("La venta se ha guardado exitosamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al guardar la venta: " + e.getMessage());

            System.out.println(cliente.getEdad() + " " + vehiculo.getPatente() + " " + this.fechaVenta + " " + this.nombreVenta);

        }
    }

    @Override
    public String toString() {
        return "LibroVenta{" +
                "nombreVenta='" + nombreVenta + '\'' +
                ", fechaVenta='" + fechaVenta + '\'' +
                '}';


    }


}
