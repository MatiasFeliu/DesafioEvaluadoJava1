package ejercicioOpcional4;

public class sueldos {

    public static void main(String[] args){
        int[] sueldos = { 400000, 760000, 1100000, 650000, 654980, 987300, 700450, 442300 };

        double promedioSueldos = calcularPromedio(sueldos);

        System.out.println("El promedio de los sueldos es: " + promedioSueldos);
    }

    public static double calcularPromedio(int[] sueldos) {
        int resultado = 0;
        int contador = 0;
        double promedio = 0;

        for (int sueldo : sueldos) {
            if (sueldo > 500000) {
                resultado += sueldo;
                contador++;
            }
        }
        promedio = resultado / contador;
        return promedio;
    }
}
