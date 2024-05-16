package ejerciciosOpcionales.ejercicioD23;
// Entregamos parametros a la clase
public class Vehiculo {
    private String color;
    private String patente;

    //constructor vacío (permite modificar la clase sin constructor en la main)
    public Vehiculo(){

    }
    public Vehiculo(String color,String patente){
        this.color = color;
        this.patente = patente;

    }
        public String getColor(){
        return color;
        }

        public String getPatente(){
        return patente;
        }
        public void setColor(String color) {
        this.color = color;
        }
        public void setPatente(String patente) {
        this.patente = patente;
        }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "color='" + color + '\'' +
                ", patente='" + patente + '\'' +
                '}';
    }
}
