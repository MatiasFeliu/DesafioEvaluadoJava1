package desafioEvaluadoArreglos;

public class Visitas {
    public static void main(String[] args) {
        // Verificar si se proporcionan argumentos de línea de comandos
        if (args.length == 0) {
            System.out.println("Por favor, proporcione al menos un argumento con las visitas diarias.");
            return;
        }

        // Convertir los argumentos de String a enteros
        int[] visitasDiarias = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                visitasDiarias[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Error: Los argumentos deben ser números enteros.");
                return;
            }
        }

        // Calcular el promedio de las visitas diarias
        double promedioVisitas = promedio(visitasDiarias);

        // Imprimir el resultado
        System.out.println("El promedio de visitas diarias es: " + promedioVisitas);
    }

    // Método para calcular el promedio de visitas diarias
    public static double promedio(int[] visitasDiarias) {
        int suma = 0;
        for (int visita : visitasDiarias) {
            suma += visita;
        }
        return (double) suma / visitasDiarias.length;
    }
}
