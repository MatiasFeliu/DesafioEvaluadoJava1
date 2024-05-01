package cl.praxis.Desafio3;

public class Promedios {
    public static void main(String[] args){
        if(args.length==0){
            System.out.println("Ingrese un argumento valido");
            return;
        }
        int[] promedios = new int[args.length];

        for(int i=0; i< args.length; i++ ){

            try {
                promedios[i] = Integer.parseInt(args[i]);
            }catch (NumberFormatException e){
                System.out.println("Ha sucedido un error" + e);
            }
        }
        suma(promedios);
    }

    public static void suma(int[] promedios){
        int suma = 0;
        int count = 0;
        for(int elemento : promedios){

            if (elemento%3==0){
                suma=suma + elemento;
              count++;
            }
         }
        System.out.println("La suma es "+ suma);
        promedio(suma,count);
    }

    public static void promedio(int suma, int count){
        int resultado = suma/count;
        System.out.println("El promedio es " + resultado);
    }
}
