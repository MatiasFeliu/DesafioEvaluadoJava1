package ejerciciosOpcionales.ejercicioD27;
import java.util.Scanner;

public class Menu {
    private ProductoServicio productoServicio = new ProductoServicio();
    private Exportador exportar = new ExportadorTxt();
    private Scanner sc = new Scanner(System.in);
    public void mostrarMenu(){
        int option;
        do{
            System.out.println("1 Listar Producto");
            System.out.println("2 Agregar Producto");
            System.out.println("3 Exportar Datos");
            System.out.println("4 Salir");
            System.out.print("Ingrese una opción: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1: productoServicio.listarProductos();
                break;
                case 2:addProducto();
                break;
                case 3:exportar.exportar(productoServicio.getListaProductos());
                break;
                case 4:
                    System.out.println("Saliendo del programa....");
                default:
                    System.out.println("Error, ingrese una opcion valida");
            }
        }while(option!=4);
    }
    public static void main (String[] args){
        Menu menu = new Menu();
        menu.mostrarMenu();
    }
    public void addProducto(){
        System.out.println("Ingrese Articulo");
        String articulo = sc.nextLine();
        System.out.println("Ingrese Precio");
        String precio = sc.nextLine();
        System.out.println("Ingrese Descripcion");
        String descripcion = sc.nextLine();
        System.out.println("Ingrese Codigo");
        String codigo = sc.nextLine();
        System.out.println("Ingrese Talla");
        String talla = sc.nextLine();
        System.out.println("Ingrese Marca");
        String marca = sc.nextLine();

        Producto producto = new Producto(articulo,precio,descripcion,codigo,talla,marca);
        productoServicio.agregarProducto(producto);
    }
}
