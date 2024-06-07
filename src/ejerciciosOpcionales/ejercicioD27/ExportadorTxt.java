package ejerciciosOpcionales.ejercicioD27;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ExportadorTxt extends ExportarTxt{
    public void exportar(ArrayList<Producto> listaProductos) {
        //crear carpeta
        File directorio = new File("src/ejerciciosOpcionales/EjercicioD27/Productos");
        try{
            if(!directorio.exists()){
                if(directorio.mkdirs()){
                    System.out.println("directorio creado correctamente");
                }else{
                    System.out.println("a ocurrido un error");
                }
            }
        }catch (RuntimeException e){
            System.out.println("error"+e.getMessage());
        }
        //creacion de archivo
        File fileWrite = new File(directorio,"/productos.txt");
        try{
            if(fileWrite.createNewFile()){
                System.out.println("archivo creado exitosamente");
            }else{
                System.out.println("probelmas al crear el archivo");
            }
        }catch (IOException e){
            System.out.println("Problemas al crear el archivo" + e.getMessage());
        }
        //escribir en el archivo
        try(BufferedWriter bufferWrite = new BufferedWriter(new FileWriter(fileWrite))){
            for(Producto dataProduct : listaProductos){
                bufferWrite.write(dataProduct.toString());
                bufferWrite.newLine();
            }
        }catch (IOException e){
            System.out.println("ocurrio un problema" + e.getMessage());
        }
    }
}
