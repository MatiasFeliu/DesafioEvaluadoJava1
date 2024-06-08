package cl.praxis.Desafio7;
import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArchivoServicio {
    private Scanner sc = new Scanner(System.in);
    private File archivo;
    public void cargarDatos(ProductoServicio ps){
        String ruta;
       /* System.out.println("Ingresa la ruta en donde se encuentra el archivo - ProductosImportados.csv: ");
        ruta = sc.nextLine();*/
        archivo = new File("src/cl/praxis/Desafio7/archivos/ProductosImportados.csv");
        //archivo = new File(ruta);

        if(archivo.exists()){
            try(BufferedReader bufferRead = new BufferedReader(new FileReader(archivo))){
                String linea;
                while ((linea = bufferRead.readLine())!=null){
                    //System.out.println(linea);
                    String[] productoData = linea.split(",");
                    //Creamos objeto
                    Producto producto = new Producto(productoData[0],productoData[1],productoData[2],
                    productoData[3],productoData[4],productoData[5],productoData[6]);
                    ps.agregarProducto(producto);
                }
                System.out.println("Datos cargados en la lista!!");
                System.out.println(ps.getListaProductos());

            }catch (IOException e){
                System.out.println("error al cargar el archivo: "+e.getMessage());
            }
        }else{
            System.out.println("el archivo no existe");
        }
    }

    public void exportarDatos(List<Producto> listaProductos){
        //escribir en el archivo
        try(BufferedWriter bufferWrite = new BufferedWriter(new FileWriter(archivo))){
            for(Producto dataProduct : listaProductos){
                bufferWrite.write(dataProduct.toString());
                bufferWrite.newLine();
            }
        }catch (IOException e){
            System.out.println("ocurrio un problema" + e.getMessage());
        }
    }
}
