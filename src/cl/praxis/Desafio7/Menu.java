package cl.praxis.Desafio7;

import java.util.Scanner;

public class Menu {
    private ArchivoServicio archService = new ArchivoServicio();
    private ProductoServicio ps = new ProductoServicio();
    private Scanner sc = new Scanner(System.in);
    private Utilidad utility = new Utilidad();
    public static void main(String[] args){
        Menu menu = new Menu();
        menu.llamarMenu();
    }

    public void llamarMenu(){
        int option ;
        do {
            utility.limpiarPantalla();
            System.out.println("1 listar productos");
            System.out.println("2 Editar datos");
            System.out.println("3 Importar datos");
            System.out.println("4 Salir del menu");
            System.out.println("Ingrese una opcion: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1: ps.listarProductos();
                        utility.pausa(2);
                break;
                case 2:
                    if(ps.getListaProductos().isEmpty()){
                        System.out.println(" ERROR!!! tiene que cargar los datos primero desde el archivo - seleccione opcion 3");
                        utility.pausa(2);
                    }else{
                        ps.editarProducto(archService);
                        utility.pausa(2);
                    }
                    break;
                case 3: archService.cargarDatos(ps);
                         utility.pausa(2);
                break;
                case 4: System.out.println("Saliendo del programa");
                        utility.pausa(2);
                break;
                default: System.out.println("Error ingrese una opcion valida");
            }
        }while(option!=4);
    }
}
