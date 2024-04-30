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
        int numeros = promedio(promedios);

    }

    public static int promedio(int[] promedios){
        return 0;
    }
}
