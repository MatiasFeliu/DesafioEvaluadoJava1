package cl.praxis.Desafio7;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductoServicio {
    //Atributos
    private List<Producto> listaProductos = new ArrayList<Producto>();
    private Scanner sc = new Scanner(System.in);

    //Getters
    public List<Producto> getListaProductos() {
        return listaProductos;
    }
    //Setters
    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    //Metodos
    public void listarProductos(){
        if(listaProductos.isEmpty()){
            System.out.println("No hay productos en la lista");
        }else{
            for (Producto producto : listaProductos){
                System.out.println("Datos del producto");
                System.out.println("Nombre de articulo: "+producto.getArticulo());
                System.out.println("Codigo del producto: "+producto.getCodigo());
                System.out.println("Marca: "+producto.getMarca());
                System.out.println("Color: "+producto.getColor());
                System.out.println("Descripcion: "+producto.getDescripcion());
                System.out.println("Precio: "+producto.getPrecio());
                System.out.println("Talla: "+producto.getTalla());
                System.out.println("-------------------------------------------");
            }
        }
    }
    public void agregarProducto(Producto producto){
        this.listaProductos.add(producto);
    }

    public void editarProducto(ArchivoServicio archService){

        String productCode, newValue;
        int foundIndex = 0, optionMenu = 0;
        boolean optionValidator = false;
        System.out.println("Editar Productos");

        do{
            System.out.println("Ingrese el número 1 para editar los datos ingresados del Producto");
            optionMenu = sc.nextInt();
            sc.nextLine();

            System.out.println("Ingrese el codigo del producto");
            productCode = sc.nextLine();

            //Objeto que va almacenar el producto a modificar
            Producto selectedProduct = new Producto();

            for(int i=0; i<listaProductos.size();i++){

                System.out.println(productCode);

                if(listaProductos.get(i).getCodigo().equals(productCode)){
                    selectedProduct = listaProductos.get(i);
                    foundIndex = i;
                    break;
                }
            }

            System.out.println(selectedProduct);
            System.out.println("Datos actuales del producto");
            System.out.println("1 Nombre de articulo: "+selectedProduct.getArticulo());
            System.out.println("2 Codigo del producto: "+selectedProduct.getCodigo());
            System.out.println("3 Marca: "+selectedProduct.getMarca());
            System.out.println("4 Color: "+selectedProduct.getColor());
            System.out.println("5 Descripcion: "+selectedProduct.getDescripcion());
            System.out.println("6 Precio: "+selectedProduct.getPrecio());
            System.out.println("7 Talla: "+selectedProduct.getTalla());
            System.out.println("-------------------------------------------");

            System.out.println("indice"+foundIndex);

            System.out.println("Ingrese la opción a editar de los datos del producto: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1:
                    System.out.println("Ingrese el nuevo nombre del Articulo");
                    newValue = sc.nextLine();
                    selectedProduct.setArticulo(newValue);
                    break;
                case 2:System.out.println("Ingrese el nuevo codigo del Articulo");
                    newValue = sc.nextLine();
                    selectedProduct.setCodigo(newValue);
                    break;
                case 3:System.out.println("Ingrese la nueva marca del Articulo");
                    newValue = sc.nextLine();
                    selectedProduct.setMarca(newValue);
                    break;
                case 4:System.out.println("Ingrese el nuevo color del Articulo");
                    newValue = sc.nextLine();
                    selectedProduct.setColor(newValue);
                    break;
                case 5:System.out.println("Ingrese una nueva descripcion del Articulo");
                    newValue = sc.nextLine();
                    selectedProduct.setDescripcion(newValue);
                    break;
                case 6:System.out.println("Ingrese un nuevo precio del Articulo");
                    newValue = sc.nextLine();
                    selectedProduct.setPrecio(newValue);
                    break;
                case 7:System.out.println("Ingrese una nueva talla del Articulo");
                    newValue = sc.nextLine();
                    selectedProduct.setTalla(newValue);
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }

            //Actualizamos el ArrayList original con el nuevo Objeto
            listaProductos.set(foundIndex,selectedProduct);

            //verificamos si el usuario requiere seguir editando
            System.out.println("desea seguir editando un producto? si: presione 1 - no: presione 2");
            optionMenu = sc.nextInt();
            sc.nextLine();

            if(optionMenu==1){
                optionValidator = true;
            }else{
                optionValidator = false;
            }

        }while(optionValidator);
        //Exportamos la lista actualizada al archivo csv
        archService.exportarDatos(listaProductos);

    }
}
