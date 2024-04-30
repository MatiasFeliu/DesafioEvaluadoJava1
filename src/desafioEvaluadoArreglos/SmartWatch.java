package desafioEvaluadoArreglos;

public class SmartWatch {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Por favor, proporcione al menos un argumento con los pasos diarios.");
            return;
        }
        // Convertir los argumentos de String a enteros y filtrar los valores
        int[] pasos = clearSteps(args);

        // Calcular el promedio de los pasos diarios
        double promedioPasos = promedio(pasos);

        // Imprimir el resultado
        System.out.println("El promedio de pasos diarios es: " + promedioPasos);
    }

    public static int[] clearSteps(String[] pasosString) {
        int[] pasos = new int[pasosString.length];
        int contador = 0;

        for (String paso : pasosString) {
            try {
                int valor = Integer.parseInt(paso);
                if (valor >= 200 && valor <= 100000) {
                    pasos[contador] = valor;
                    contador++;
                }
            } catch (NumberFormatException e) {
                // Ignorar valores no numéricos
            }
        }

        // Crear un nuevo arreglo con tamaño igual al número de valores válidos
        int[] pasosFiltrados = new int[contador];
        System.arraycopy(pasos, 0, pasosFiltrados, 0, contador);

        return pasosFiltrados;
    }

    // Método para calcular el promedio de los pasos diarios
    public static double promedio(int[] pasos) {
        if (pasos.length == 0) {
            return 0; // Si no hay pasos, el promedio es cero
        }

        int suma = 0;
        for (int paso : pasos) {
            suma += paso;
        }
        return (double) suma / pasos.length;
    }
}
