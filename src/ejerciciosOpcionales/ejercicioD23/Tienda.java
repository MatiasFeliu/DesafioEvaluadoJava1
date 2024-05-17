package ejerciciosOpcionales.ejercicioD23;

import java.util.List;

public class Tienda {

    private List<Cliente> clientes;
    private List<Vehiculo> vehiculos;

    private Vendedor vendedor;
    private int stock;

    public Tienda(){

    }
    public Tienda(List<Cliente> clientes,List<Vehiculo> vehiculos,Vendedor vendedor,int stock){

    }
// getters
    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public int getStock() {
        return stock;
    }

    // setters


    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // creando metodo existeStock

    public String existeStock(){
        return "stock"+stock;
    }
    @Override
    public String toString() {
        return "Tienda{" +
                "clientes=" + clientes +
                ", vehiculos=" + vehiculos +
                ", vendedor=" + vendedor +
                ", stock=" + stock +
                '}';
    }

}
