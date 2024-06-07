package ejerciciosOpcionales.ejercicioD27;
import java.util.ArrayList;

public class ProductoServicio {
    private ArrayList<Producto> listaProductos;

    // Constructor
    public ProductoServicio() {
        this.listaProductos = new ArrayList<>();
    }

    // Getter para listaProductos
    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    // Setter para listaProductos
    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    // Método para listar productos
    public void listarProductos() {
        if (listaProductos.isEmpty()) {
            System.out.println("No hay productos en la lista.");
        } else {
            System.out.println("Lista de Productos:");
            for (Producto producto : listaProductos) {
                System.out.println(producto);
            }
        }
    }

    // Método para agregar un producto a la lista
    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
        System.out.println("Producto agregado correctamente.");
    }
}
