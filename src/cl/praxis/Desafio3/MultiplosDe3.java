package cl.praxis.Desafio3;

public class MultiplosDe3 {
    public static void main (String[] args){

        if (args.length == 0) {
            System.out.println("Por favor, proporcione al menos un argumento con las visitas diarias.");
            return;
        }

        // Creamos el arreglo del tamaño de los argumentos ingresados
        int[] numeros = new int[args.length];

        for(int i=0; i<args.length; i++){
            try{
                numeros[i] = Integer.parseInt(args[i]);
            }catch(NumberFormatException e){
                System.out.println("error" + e);
                return;
            }
        }

        int multiplos = suma(numeros);
        System.out.println("La suma de los multiplos de 3 es: " + multiplos);
    }

    public static int suma(int [] numeros){
        int suma = 0;

        for(int num : numeros){
            if(num%3 == 0){
                suma = suma + num;
            }

        }
        return suma;
    }
}
