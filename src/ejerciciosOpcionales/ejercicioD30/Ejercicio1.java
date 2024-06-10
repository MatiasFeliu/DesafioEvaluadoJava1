package ejerciciosOpcionales.ejercicioD30;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    private List<String> marcas;

    public Ejercicio1(){
        this.marcas = new ArrayList<>();
    }

    public void agregarMarca(String marca){
        marcas.add(marca);
    }
}
